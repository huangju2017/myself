<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>登录页面</title>
		<link rel="stylesheet" href="css/reset.css" />
		<link rel="stylesheet" href="css/common.css" />
		<script type="text/javascript" src="js/common.js">
		
		</script>
		<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
		
	</head>
	<body>
		<div class="wrap login_wrap">
			<div class="content">

				<div class="logo"></div>

				<div class="login_box">

					<div class="login_form">
						<div class="login_title">
							登录
						</div>
						<form action="${pageContext.request.contextPath}/userServlet?cmd=login" method="post">

							<div class="form_text_ipt">
								<input name="username" id="username" type="text" placeholder="用户名" onblur="blockececk_warning(this.id)">
							</div>
							<div class="ececk_warning"><span id="usernamespan" ></span></div>
							<div class="form_text_ipt">
								<input name="password" id="password" type="password" placeholder="密码" onblur="blockececk_warning(this.id)">
							</div>
							<div class="ececk_warning"><span id="passwordspan" ></span></div>
							<!-- <div >
								<input type="radio" name="identity" value="Student">学生
								<input type="radio" name="identity" value="Techer">老师
							</div> -->
							<div class="form_check_ipt">
								<div class="left check_left">
									<label><input type="radio" name="status" value="0" checked="checked">学生</label>
									<label><input type="radio" name="status" value="1">老师</label>
								</div>

							</div>
							<div class="form_check_ipt">
								<div class="left check_left">
									<label><input name="" type="checkbox"> 下次自动登录</label>
								</div>
								<div class="right check_right">
									<a href="#">忘记密码</a>
								</div>
							</div>
							<div class="form_btn">
								<button type="submit">登录</button>
								<font color="red">${login_msg }</font>
							</div>
							<div class="form_reg_btn">
								<span>还没有帐号？</span><a href="register.jsp">马上注册</a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>
