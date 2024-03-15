package com.itwray.iw.auth.dao;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itwray.iw.auth.core.AuthServiceException;
import com.itwray.iw.auth.mapper.AuthUserMapper;
import com.itwray.iw.auth.model.entity.AuthUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * 用户 Dao
 *
 * @author wray
 * @since 2024/3/2
 */
@Component
public class AuthUserDao extends ServiceImpl<AuthUserMapper, AuthUser> {

    public @Nullable AuthUser queryOneByUsername(String username) {
        if (StringUtils.isBlank(username)) {
            throw new AuthServiceException("用户名不能为空");
        }
        return this.lambdaQuery()
                .eq(AuthUser::getUsername, username)
                .last("limit 1")
                .one();
    }
}
