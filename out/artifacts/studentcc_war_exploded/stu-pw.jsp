<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="pragma" content="no-cache"/>
    <meta http-equiv="cache-control" content="no-cache"/>
    <meta http-equiv="expires" content="0"/>
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
    <meta http-equiv="description" content="This is my page"/>


</head>

<body leftmargin="2" topmargin="9">
<form method="post" name="formPw" action="${pageContext.request.contextPath}/userServlet?cmd=xiugai？id=${user.id}">
    <table width="98%" align="center" border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC"
           style="margin-bottom:8px">
        <tr bgcolor="#EEF4EA">
            <td colspan="2" class='title'><span>&nbsp;</span></td>
        </tr>
        <tr bgcolor="#FFFFFF">
            <td width="10%" bgcolor="#FFFFFF" align="right">
                登录名：
            </td>
            <td width="90%" bgcolor="#FFFFFF">
                <input type="text" value="${user.username}" name="userName" style="width: 250px;" disabled="disabled"/>
            </td>
        </tr>
        <tr bgcolor="#FFFFFF">
            <td width="10%" bgcolor="#FFFFFF" align="right">
                原密码：
            </td>
            <td width="90%" bgcolor="#FFFFFF">
                <input type="password" name="password" id="password" style="width: 250px;" value="${user.password}"/>
            </td>
        </tr>
        <tr bgcolor="#FFFFFF">
            <td width="10%" bgcolor="#FFFFFF" align="right">
                新密码：
            </td>
            <td width="90%" bgcolor="#FFFFFF">
                <input type="password" id="userPw" name="newPassword" style="width: 250px;"/>
            </td>
        </tr>
        <tr bgcolor="#FFFFFF">
            <td width="10%" bgcolor="#FFFFFF" align="right">
                确认密码：
            </td>
            <td width="90%" bgcolor="#FFFFFF">
                <input type="password" id="userPw1" name="userPw1" style="width: 250px;"/>
            </td>
        </tr>
        <tr bgcolor="#FFFFFF">
            <td width="10%" bgcolor="#FFFFFF" align="right">
                &nbsp;
            </td>
            <td width="90%" bgcolor="#FFFFFF">
                <input type="submit" value="修改" />
                &nbsp;&nbsp;&nbsp;
                <input type="reset" value="重置"/>
            </td>
        </tr>
    </table>
</form>
</body>
<html>
