<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
		
		<script type="text/javascript">
			$(function(){
				$(".level1").click(function(){
					$(this).next().stop().slideToggle().parent().siblings().slideDown("ul").slideDown();
				});
			});
		</script>
		
		<style type="text/css">
			body ul{
				margin: 0;
				padding: 0;
			}
			
			ul{
				list-style: none;
			}
			
			body .menu{
				width: 300px;
				margin: 30px auto 0;
			}
			
			.menu .level1, .menu li ul li a{
				display: block;
				width: 300px;
				height: 30px;
				line-height: 30px;
				text-decoration: none;
				font-size: 24px;
				text-indent: 10px;
				font-family: 楷体;
			}
			
			.menu .level1{
				font-size: 28px;
				color: black;
				/* background-color: yellow; */
				background-color: #ffed25;
			}
			
			.menu li ul li a{
				font-size: 20px;
				text-indent: 20px;
			}
			
			.menu li .xi li{
				display: inline;
			}
			
			.menu li .current{
				display: block;
			}
			
			.menu li ul li a:hover{
				background-color: antiquewhite;
			}
		</style>
	</head>
	<body>
		<ul class="menu">
			<li>
				<a href="#" class="level1">课程信息</a>
				<ul class="xi current">
					<li><a href="${pageContext.request.contextPath}/teacherServlet?cmd=findAll" target="Main">已选课程</a></li>
				</ul>
			</li>
			<li>
				<a href="#" class="level1">教师选课</a>
				<ul>
					<li><a href="${pageContext.request.contextPath}/teacherServlet?cmd=findNo" target="Main">未选课程</a></li>
				</ul>
			</li>

			<li>
				<a href="#" class="level1">个人信息</a>
				<ul>
					<li><a href="${pageContext.request.contextPath}/teacherServlet?cmd=findById" target="Main">查看</a></li>
					<li><a href="tea-pw.jsp" target="Main">修改</a></li>
				</ul>
			</li>
		</ul>
	<div>
		<a href="${pageContext.request.contextPath }/userServlet?cmd=logout" class="btn btn-danger" target="_top">安全退出</a>

	</div>
	</body>
</html>
