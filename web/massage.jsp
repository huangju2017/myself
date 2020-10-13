<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>添加详细信息</title>
    <link rel="stylesheet" href="css/reset.css"/>
    <link rel="stylesheet" href="css/common.css"/>
    <script type="text/javascript" src="js/common.js">

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
                <form action="${pageContext.request.contextPath }/userServlet?cmd=message" method="post">

                    <div class="form_text_ipt">
                        <input name="name" id="name" type="text" placeholder="姓名">
                    </div>
                    <div class="form_text_ipt">
                        <input name="age" type="text" id="age" placeholder="年龄">
                    </div>
                    <div class="form_check_ipt">
                        <div class="left check_left">
                            <label><input type="radio" name="gender" value="男" checked="checked">男</label>
                            <label><input type="radio" name="gender" value="女">女</label>
                        </div>

                    </div>
                    <div class="form_btn">
                        <button type="submit">确定</button>
                    </div>
                    <div class="form_btn">
                        <button type="reset" onclick="spanempty()">重置</button>

                    </div>
                </form>

            </div>
        </div>
    </div>
</div>
</body>
</html>