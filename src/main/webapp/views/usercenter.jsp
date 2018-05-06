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
    <title>个人主页</title>
    <link rel="shortcut icon" href="images/crplog.ico">
    <link rel="stylesheet" type="text/css" href="css/firstcss/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/firstcss/build.css">
    <link rel="stylesheet" type="text/css" href="css/firstcss/activity.css">
    <link href="css/firstcss/login.css" rel="stylesheet" type="text/css"/>
    <link href="css/firstcss/zzsc.css" rel="stylesheet" type="text/css"/>
    <link href="css/firstcss/dlzc.css" rel="stylesheet" type="text/css"/>
    <script language="javascript" type="text/javascript" src="js/firstjs/jquery-1.11.1.min.js"></script>
    <script language="javascript" type="text/javascript" src="js/firstjs/main.js"></script>
    <script language="javascript" type="text/javascript" src="js/firstjs/popwin.js"></script>
    <link rel="stylesheet" type="text/css" href="css/firstcss/nanoscroller.css">
</head>

<body>

<header id="top" role="banner" class="transition">
    <!--搜索弹窗 开始-->
    <div class="box">
        <div class="box2">
            <div class="icon icon-search-close js-show-search-box"><a class="close"></a></div>
            <div class="search-content overlay-dialog-animate">
                <div class="search-input">
                    <form role="search" method="get" action="/search.html" onsubmit="return checkinput()">
                        <button type="submit"></button>
                        <input placeholder="请输入关键字" name="s" id="search-input">
                    </form>
                </div>
                <div class="search-history hide" id="history">
                    <span>我的搜索历史</span>
                    <ul class="transition" id="history_ul">
                        <li class="transition"><a href="#">数码</a></li>
                        <li class="transition"><a href="#">科技</a></li>
                        <li class="transition"><a href="#">科技</a></li>
                        <li class="transition"><a href="#">互联网</a></li>
                        <li class="transition"><a href="#">汽车之家</a></li>
                    </ul>
                    <div class="pull-right empty-history js-empty-history">清空历史</div>
                </div>
                <div class="search-history search-hot">
                    <strong>热搜词</strong>
                    <ul>
                        <li class="transition"><a href="#">数码</a></li>
                        <li class="transition"><a href="#">科技</a></li>
                        <li class="transition"><a href="#">互联网</a></li>
                        <li class="transition"><a href="#">汽车之家</a></li>
                        <li class="transition"><a href="#">Uber</a></li>
                        <li class="transition"><a href="#">支付宝</a></li>
                        <li class="transition"><a href="#">大数据</a></li>
                        <li class="transition"><a href="#">创业</a></li>
                        <li class="transition"><a href="#">旅游</a></li>
                        <li class="transition"><a href="#">美团</a></li>
                        <li class="transition"><a href="#">社交</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <!--搜索弹窗 结束-->
    <script>
        function checkinput(){
            var input = $("#search-input").val();
            if(input ==  null || input == ''){
                return false;
            }
            return true;
        }
    </script>
    <div class="container">
        <div class="navbar-header transition">
            <a href="#" title="首页"><img src="images/logo.png" alt="虎嗅网" title="首页" /></a>
        </div>
        <ul class="nav navbar-nav navbar-left" id="jsddm" style="margin-top: 21px;">
            <li class="nav-news js-show-menu">
                <a href="#">资讯 <span class="caret"></span></a>
                <ul style="visibility: hidden;">
                    <li><a href="#" target="_blank">电商消费</a></li>
                    <li><a href="#" target="_blank">娱乐淘金</a></li>
                    <li><a href="#" target="_blank">雪花一代</a></li>
                    <li><a href="#" target="_blank">人工智能</a></li>
                    <li><a href="#" target="_blank">车与出行</a></li>
                    <li><a href="#" target="_blank">智能终端</a></li>
                    <li><a href="#" target="_blank">医疗健康</a></li>
                    <li><a href="#" target="_blank">金融地产</a></li>
                    <li><a href="#" target="_blank">企业服务</a></li>
                    <li><a href="#" target="_blank">创业维艰</a></li>
                    <li><a href="#" target="_blank">社交通讯</a></li>
                    <li><a href="#" target="_blank">全球热点</a></li>
                    <li><a href="#" target="_blank">生活腔调</a></li>
                </ul>
            </li>
            <style>
                #jsddm ul{position: absolute; visibility: hidden; background:#fff; width:250px;  top:60px; left:-50px; z-index:9999; box-shadow:0 1px 15px rgba(18,21,21,.2);padding:10px 5px;}
                #jsddm ul li{ float:left; width:105px; padding-left:20px; line-height:40px;}
            </style>
            <li class="nav-news"><a href="#" target="_blank">热议<span class="nums-prompt nums-prompt-topic"></span></a></li>
            <li class="nav-news"><a href="#" target="_blank">活动</a></li>
            <li class="nav-news"><a href="#" target="_blank">创业白板<span class="nums-prompt"></span></a></li>
            <li class="nav-news"><a href="#" target="_blank">会员专享<em class="nums-prompt"></em></a></li>
            <li class="nav-news"><a href="#" target="_blank">官方Blog</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right transition  xiala main_nav">

            <li class="search-li js-show-search-box"><a><i class="icon icon-search "></i></a><span>搜索</span></li>
            <li class="login-link-box" ><a href="views/login.jsp" class="cd-signin" style="margin-top: 21px;">登录</a></li>
            <li><a href="views/register.jsp"class="cd-signup" style="margin-top: 21px;">注册</a></li>
            <li><a href="views/home.jsp" class="cd-tougao">发表</a></li>
        </ul>
    </div>

</header>
<div class="placeholder-height"></div>
<div class="placeholder-height"></div>


<footer class="footer">
    <div class="modal-backdrop fade in js-modal-backdrop"></div>
    <div class="container copy-right" align="center">
        <span>Copyright © <a href="#">创作收益平台</a> <a href="#" target="_blank">闽ICP备163140814号-1</a>
            &nbsp;<a href="#" target="_blank"><i class="i-wj"></i>闽公网安备 11010102001402号</a>&nbsp;&nbsp;&nbsp;
        </span>
    </div>

</footer>
<script type="text/javascript" src="js/firstjs/mouse.js"></script>
</body>
</html>
