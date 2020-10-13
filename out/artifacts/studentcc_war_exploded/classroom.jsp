<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body leftmargin="2" topmargin="9">
		<form action="" method="post" name="formAdd">
			<table width="98%" align="center" border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px">
				<tr bgcolor="#EEF4EA">
					<td colspan="3"  class='title'><span>&nbsp;</span></td>
				</tr>
				
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';"
				 height="22">
					<td width="10%" bgcolor="#FFFFFF" align="right">
						教室id：
					</td>
					<td width="90%" bgcolor="#FFFFFF" align="left">
						<input type="text" name="mingcheng" style="width: 250px;" value="${sessionScope.qiye.mingcheng}" readonly="readonly">
					</td>
				</tr>
				
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';"
				 height="22">
					<td width="10%" bgcolor="#FFFFFF" align="right">
						课程id：
					</td>
					<td width="90%" bgcolor="#FFFFFF" align="left">
						<input type="text" name="dizhi" style="width: 250px;" value="${sessionScope.qiye.dizhi}" readonly="readonly">
					</td>
				</tr>
				
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';"
				 height="22">
					<td width="10%" bgcolor="#FFFFFF" align="right">
						教室位置：
					</td>
					<td width="90%" bgcolor="#FFFFFF" align="left">
						<input type="text" name="dizhi" style="width: 250px;" value="${sessionScope.qiye.dizhi}" readonly="readonly">
					</td>
				</tr>
				
			</table>
		</form>
	</body>
</html>
