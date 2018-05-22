<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/25
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title></title>
</head>
<body>
<header class="header fixed-top clearfix">
    <!--logo start-->
    <div class="brand">
        <a href="views/show.jsp" class="logo">
            &nbsp;&nbsp;&nbsp;&nbsp;收益系统
        </a>
        <div class="sidebar-toggle-box">
            <div class="fa fa-bars"></div>
        </div>
    </div>
    <!--logo end-->

    <div class="top-nav clearfix">
        <!--search & user info start-->
        <ul class="nav pull-right top-menu">
            <li>
                <input type="text" class="form-control search" placeholder=" Search">
            </li>
            <!-- user login dropdown start-->
            <li class="dropdown">
                <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                    <img src="${userInfo.userPicture}">
                    <span class="username">${activeUser.userName}</span>
                    <b class="caret"></b>
                </a>
                <ul class="dropdown-menu extended logout">
                    <li><a href="/individual/init/center?userId=${userInfo.userId}"><i class=" fa fa-asterisk"></i>个人主页</a></li>
                    <li><a href="/account/get/user-info"><i class=" fa fa-user"></i>账号信息</a></li>
                    <li><a href="/account/get/picture"><i class="fa fa-cog"></i>头像设置</a></li>
                    <li><a href="/account/signout"><i class="fa fa-power-off"></i>退出登录</a></li>
                </ul>
            </li>
            <!-- user login dropdown end -->
        </ul>
        <!--search & user info end-->
    </div>
</header>
</body>
</html>
