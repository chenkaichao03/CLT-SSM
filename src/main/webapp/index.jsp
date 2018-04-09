<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>homepage</title>
    <link href="css/css.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="js/jquery-1.7.2.min.js" ></script>
</head>
<body>
    <div class="fixed_r">
        <ul >
            <li>1</li>
            <li>2</li>
            <li>3</li>
            <li>4</li>
            <li>5</li>
            <li>6</li>
        </ul>
    </div>
    <div class="num_box">
        <div class="num" id="num_0">
            <div >
                <button class="register" onclick=window.location.href="register.jsp">注册</button>
                <button class="login" onclick=window.location.href="login.jsp">登录</button>
            </div>
        </div>
        <div class="num" id="num_1"><p></p></div>
        <div class="num" id="num_2"><p></p></div>
        <div class="num" id="num_3"><p></p></div>
        <div class="num" id="num_4"><p></p></div>
        <div class="num" id="num_5"><p></p></div>
    </div>
    <input type="hidden" value="0" class="ddw"/>
    <input type="hidden" value="0" class="ddw2"/>

    <script type="text/javascript" src="js/scroll.js" ></script>
    <script type="text/javascript" src="js/jquery.mousewheel.js" ></script>

</body>
</html>