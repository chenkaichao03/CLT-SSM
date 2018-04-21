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
    <div class="web-width">
        <div class="for-liucheng">
            <div class="liulist for-cur"></div>
            <div class="liulist for-cur"></div>
            <div class="liulist"></div>
            <div class="liulist"></div>
            <div class="liutextbox">
                <div class="liutext for-cur"><em>1</em><br /><strong>验证身份</strong></div>
                <div class="liutext for-cur"><em>2</em><br /><strong>设置新密码</strong></div>
                <div class="liutext"><em>3</em><br /><strong>完成</strong></div>
            </div>
        </div><!--for-liucheng/-->
        <form action="/views/forgetpwd3.jsp" method="get" class="forget-pwd">
            <dl>
                <dt>手机号：</dt>
                <dd><input type="text" /></dd>
                <div class="clears"></div>
            </dl>
            <dl>
                <dt>新密码：</dt>
                <dd><input type="password" /></dd>
                <div class="clears"></div>
            </dl>
            <dl>
                <dt>确认密码：</dt>
                <dd><input type="password" /></dd>
                <div class="clears"></div>
            </dl>
            <div class="subtijiao"><input type="submit" value="提交" /></div>
        </form><!--forget-pwd/-->
    </div><!--web-width/-->
</div><!--content/-->

</body>
</html>
