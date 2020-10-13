<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>注册</title>
    <link rel="stylesheet" href="css/reset.css"/>
    <link rel="stylesheet" href="css/common.css"/>
    <script type="text/javascript" src="js/common.js">

    </script>
    <script type="text/javascript">
        /* 改变验证码 */
        function changeImg(){
            var val = document.getElementById("img");
            // 重新访问地址
            val.src="${pageContext.request.contextPath }/validateServlet?date=" + new Date();
        }
    </script>
</head>
<body>
<div class="wrap login_wrap">
    <div class="content">

        <div class="logo"></div>

        <div class="login_box">

            <div class="login_form">
                <div class="login_title">
                    注册
                </div>
                <form action="${pageContext.request.contextPath }/userServlet?cmd=register" method="post">

                    <div class="form_text_ipt">
                        <input name="username" id="username" type="text" placeholder="用户名"
                               onblur="blockececk_warning(this.id)">
                    </div>
                    <div class="ececk_warning"><span id="usernamespan"></span></div>
                    <div class="form_text_ipt">
                        <input name="password" id="password" type="password" placeholder="密码"
                               onblur="blockececk_warning(this.id)">
                    </div>
                    <div class="ececk_warning"><span id="passwordspan"></span></div>
                    <div class="form_text_ipt">
                        <input name="repassword" type="password" id="repassword" placeholder="重复密码"
                               onblur="checkpassword(this.id)">
                    </div>
                    <div class="ececk_warning"><span id="repasswordspan"></span></div>
                    <div class="form_text_ipt">
                        <input type="text" name="validateStr" id="validateStr" placeholder="验证信息">

                    </div>
                    <div style="margin: 2px 29px auto;">
                        <img alt="验证码" id="img" src="${pageContext.request.contextPath }/validateServlet"
                              onclick="changeImg()" >
                    </div>
                    <div class="ececk_warning"><span style="color: #ff0000">${validate_msg }</span></div>
                    <div class="ececk_warning"><span id="remarkspan"></span></div>

                    <!-- <div class="form_text_ipt">
                        <input name="code" type="text" id="code" placeholder="验证码" onblur="blockececk_warning(this.id)">
                    </div> -->
                    <div class="ececk_warning"><span id="codespan"></span></div>

                    <div class="form_check_ipt">
                        <div class="left check_left">
                            <label><input type="radio" name="status" value="0" checked="checked">学生</label>
                            <label><input type="radio" name="status" value="1">老师</label>
                        </div>

                    </div>

                    <div class="form_btn">
                        <button type="submit">注册</button>
                    </div>
                    <div class="form_btn">
                        <button type="reset" onclick="spanempty()">重置</button>
                    </div>
                    <div class="form_reg_btn">
                        <span>已有帐号？</span><a href="login.jsp">马上登录</a>
                    </div>
                </form>

            </div>
        </div>
    </div>
</div>
</body>
</html>