package com.itwray.iw.bookkeeping.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 记账支出 新增DTO
 *
 * @author wray
 * @since 2024/7/15
 */
@Data
public class ExpensesAddDto {

    /**
     * 支出时间
     * <p>为空时，表示当前时间</p>
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime expenseDate;

    /**
     * 支出项目
     */
    @NotNull(message = "支出项目不能为空")
    @Length(min = 1, max = 255, message = "支出项目数据长度要求在1-255之间")
    private String expenseItem;

    /**
     * 支出金额
     */
    @NotNull(message = "支出金额不能为空")
    private BigDecimal expenseAmount;

    /**
     * 备注
     */
    private String remark;
}
