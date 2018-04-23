<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-04-23
  Time: 14:15
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
    <title>CRP首页</title>
    <link rel="shortcut icon" href="images/crplog.ico">
    <link rel="stylesheet" href="css/show.css">
</head>
<body class="showbd">
<div >
    <table class="header">
        <tr>
            <td><p>CRP</p></td>
            <td>
                <a class="fw1" href="views/usercenter.jsp">欢迎，
                    <span class="username">Leta Chen</span>
                    <!--<span class="username">${username}</span>-->
                </a>
                <a href="views/home.jsp" class="fw2">发文</a>
            </td>
        </tr>
    </table>

    <table align="center" border="0" cellpadding="8" cellspacing="0" class="tableBasic">
        <tr>
            <td><a href="views/showpage.jsp" class="fw3">坚持就是胜利！</a></td>
            <td width="150px">2018-04-23</td>
        </tr>
        <tr>
            <td><a href="views/showpage.jsp" class="fw3">坚持就是胜利！</a></td>
            <td width="150px">2018-04-23</td>
        </tr>
    </table>
</div>
</body>
</html>
