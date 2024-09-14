# iw-mixes

A mixed project, aim to do all the functions in one project.

# Project Modules

<table>
<tr><td>ProjectName</td><td>Version</td><td>Port</td><td>Description</td></tr>
<tr>
   <td>
    </td>
</tr>
<tr>
    <td>iw-gateway</td>
    <td>0.0.1-SNAPSHOT</td>
    <td>18000</td>
    <td>Gateway网关服务</td>
</tr>
<tr>
    <td>iw-common</td>
    <td>0.0.1-SNAPSHOT</td>
    <td></td>
    <td>IW项目公共基础模块</td>
</tr>
<tr>
    <td>iw-web</td>
    <td>0.0.1-SNAPSHOT</td>
    <td></td>
    <td>Web项目基础模块</td>
</tr>
<tr>
    <td>iw-auth</td>
    <td>0.0.1-SNAPSHOT</td>
    <td>18001</td>
    <td>用户授权服务</td>
</tr>
<tr>
    <td>iw-note</td>
    <td>0.0.1-SNAPSHOT</td>
    <td>18002</td>
    <td>笔记服务</td>
</tr>
<tr>
    <td>iw-oauth2-authorization-server</td>
    <td>0.0.1-SNAPSHOT</td>
    <td>18101</td>
    <td>OAuth2授权服务</td>
</tr>
<tr>
    <td>iw-eat</td>
    <td>0.0.1-SNAPSHOT</td>
    <td>18003</td>
    <td>餐饮服务</td>
</tr>
<tr>
    <td>iw-bookkeeping</td>
    <td>0.0.1-SNAPSHOT</td>
    <td>18004</td>
    <td>记账服务</td>
</tr>
<tr>
    <td>iw-redis-starter</td>
    <td>0.0.1-SNAPSHOT</td>
    <td></td>
    <td>Redis Starter</td>
</tr>
</table>

# 个人开发习惯
* yaml配置：非隐私数据尽量写在yaml中，而非配置中心
* id长度：能用int，就不用long
* CRUD习惯：新增使用`add`，编辑使用`update`，删除使用`delete`，详情使用`detail`，分页使用`page`
* 字典：
  * 无论是一对一、一对多、多对多的数据字典项，都采用\<id:name\>的格式存储和查询。
  * 当数据字典具有业务判断逻辑时，通过前后端枚举+表code的形式配置。