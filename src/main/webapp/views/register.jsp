<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>注册</title>
	<link rel="shortcut icon" href="/images/crplog.ico">
	<link href="../css/css1.css" rel="stylesheet" type="text/css" />

	<script src="../js/jquery-1.7.2.min.js" type="text/javascript"></script>
	<script type="text/javascript">
        function condition()
        {
            var username = document.getElementById("username");
            if(username.value.length==0)
            {
                alert("用户名不能为空！");
                return false;
            }
            var password = document.getElementById("password");
            if(password.value.length==0)
            {
                alert("用户密码不能为空！");
                return false;
            }
            if(password.value.length<6||password.value.length>15)
            {
                alert("用户密码应在6-15之间！");
                return false;
            }
            return true;
        }

	</script>
</head>

<body>
<div class="logo_box">
	<h3>Sign In</h3>
	<form action="/account/register" name="f" method="post" onsubmit="return condition(this)">
		<div class="input_outer">
			<span class="u_user"></span>
			<input name="username" id = "username" class="text" placeholder="输入用户名" style="color: #FFFFFF !important" type="text">
		</div>
		<div class="input_outer">
			<span class="us_uer"></span>
			<label class="l-login login_password" style="color: rgb(255, 255, 255);display: block;"></label>
			<input name="password" id="password" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;" placeholder="输入密码" type="password">
		</div>
		<div class="mb2">
			<input type="submit" id="register" class="submit" style="color: #FFFFFF" value="注册">
		</div>
	</form>
	<div class="sas">
		已有账号，<a href="/views/login.jsp">&nbsp;登录&nbsp;</a>账号！
	</div>
</div>
</body>
</html>
