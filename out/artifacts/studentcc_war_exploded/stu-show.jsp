<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title></title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">


	</head>
	<body leftmargin="2" topmargin="9" >
		<form  method="post" name="formAdd" action="${pageContext.request.contextPath}/studentServlet?cmd=update&id=${student.u_id}">
			<table width="98%" align="center" border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px">
				<tr bgcolor="#EEF4EA">
					<td colspan="3" ><span>&nbsp;</span></td>
				</tr>
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';"
				 height="22">
					<td width="10%" bgcolor="#FFFFFF" align="right">
						姓名：
					</td>
					<td width="90%" bgcolor="#FFFFFF" align="left">
						<input type="text" name="name" style="width: 250px;" value="${student.s_name}" >
					</td>
				</tr>
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';"
				 height="22">
					<td width="10%" bgcolor="#FFFFFF" align="right">
						性别：
					</td>
					<td width="90%" bgcolor="#FFFFFF" align="left">
						<input type="text" name="gender" style="width: 250px;" value="${student.s_gender}" >
					</td>
				</tr>
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';"
				 height="22">
					<td width="10%" bgcolor="#FFFFFF" align="right">
						年龄：
					</td>
					<td width="90%" bgcolor="#FFFFFF" align="left">
						<input type="text" name="age" style="width: 250px;" value="${student.s_age}">
					</td>
				</tr>
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';"
				 height="22">
					<td width="10%" bgcolor="#FFFFFF" align="right">
						&nbsp;
					</td>
					<td width="90%" bgcolor="#FFFFFF" align="left">
						<input type="submit" value="修改" />&nbsp;
						<!-- <input type="reset" value="重置" />&nbsp; -->
					</td>
				</tr>
			</table>
		</form>
	</body>
	<html>
