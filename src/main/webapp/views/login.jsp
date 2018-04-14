<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>登录</title>
	<link href="../css/css1.css" rel="stylesheet" type="text/css" />
	<script src="../js/jquery-1.7.2.min.js" type="text/javascript"></script>
	<script type="text/javascript">
        function condition(f)
        {
            if(f.useraccount.value==="")
            {
                alert("用户账号不能为空！");
                return false;
            }
            if(f.password.value==="")
            {
                alert("用户密码不能为空！");
                return false;
            }
            return true;
        }
	</script>
</head>

<body>
	<div class="logo_box">
		<h3>Welcome</h3>
		<form action="/account/login" name="f" method="post" onsubmit="return condition(this)">
			<div class="input_outer">
				<span class="u_user"></span>
				<input name="username" class="text" placeholder="输入账号登录" style="color: #FFFFFF !important" type="text">
			</div>
			<div class="input_outer">
				<span class="us_uer"></span>
				<label class="l-login login_password" style="color: rgb(255, 255, 255);display: block;"></label>
				<input name="password" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;" placeholder="输入密码" type="password">
			</div>
			<div class="mb2">
				<input type="submit" class="submit" style="color: #FFFFFF" value="登录">
			</div>
			<input type="checkbox" value="0" id="check-box" class="checkbox" title="remember"><span>记住账号</span>
			<a href="#" class="login-fgetpwd" style="color: #FFFFFF">忘记密码？</a>
		</form>


		<div class="sas">
			还没注册账号，请先<a href="/views/register.jsp">&nbsp;注册</a>&nbsp;账号！
		</div>
	</div>

</body>
</html>