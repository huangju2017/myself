<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>

		<div align="center">
			<table align="center" style="margin-top: 2px;margin-bottom: 6px;" width="1188">
				<tr>
					<td align="left" valign="top">
						<div style="border:0px solid  #CCCCCC;height: 100%;width: 1002px;margin-left: 0px;padding: 10px;">
							<table width="100%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
								<tr align="center" bgcolor="#FAFAF1" height="22">
									<!-- <td width="5%">选择</td> -->
									<td width="5%">序号</td>

									<td width="10%">名称</td>

									<!-- <td width="10%">教师id</td> -->
									<td width="30%">教室id</td>
									<td width="10%">详细信息</td>
									<td width="10%">操作</td>

								</tr>
								<c:forEach items="${xuan}" var="view" varStatus="ss">
									<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';"
									 height="22">
										<!-- <td bgcolor="#FFFFFF" align="center">
											<input type="checkbox" name="choose" />
										</td> -->
										<td bgcolor="#FFFFFF" align="center">
											${ss.index+1}
										</td>

										<td bgcolor="#FFFFFF" align="center">
											<a href="" style="color: red">${view.c_name}</a>
										</td>


										<td bgcolor="#FFFFFF" align="center">
											${view.cla_name}
										</td>
										<td bgcolor="#FFFFFF" align="center">
											<a href="" style="color: red">${view.c_info}</a>
										</td>
										<td bgcolor="#FFFFFF" align="center">
											<a href="${pageContext.request.contextPath}/teacherServlet?cmd=cancel&id=${view.c_id}" style="color: red">取消授课</a>
										</td>

									</tr>
								</c:forEach>
							</table>
						</div>
					</td>
				</tr>
			</table>
		</div>

	</body>
</html>
