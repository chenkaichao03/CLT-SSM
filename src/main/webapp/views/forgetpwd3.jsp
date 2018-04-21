<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-04-21
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>忘记密码</title>
    <link rel="shortcut icon" href="images/favicon.ico" />
    <link type="text/css" href="/css/css.css" rel="stylesheet" />
</head>
<body>

<div class="content">
    <div class="for-liucheng">
        <div class="liulist for-cur"></div>
        <div class="liulist for-cur"></div>
        <div class="liulist for-cur"></div>
        <div class="liulist for-cur"></div>
        <div class="liutextbox">
            <div class="liutext for-cur"><em>1</em><br /><strong>验证身份</strong></div>
            <div class="liutext for-cur"><em>2</em><br /><strong>设置新密码</strong></div>
            <div class="liutext for-cur"><em>3</em><br /><strong>完成</strong></div>
        </div>
    </div><!--for-liucheng/-->
        <div class="successs">
            <h3>恭喜您，修改成功！</h3>
            <h3>请跳转到<a href="/views/login.jsp">&nbsp;登录&nbsp;</a>页面</h3>

        </div>
    </div><!--web-width/-->
</div><!--content/-->

</body>
</html>
