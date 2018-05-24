<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
    <base href="<%=basePath%>">
    <title>CRP首页</title>
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
    <style>
        .moder-project-list ul li{
            min-height:65px;
        }
         .btn{
             width:70px;
             height:40px;
             color:#fff;
             background-color:#ff6060;
             display:block;
             margin-top:10px;
             line-height:30px;
             text-align:center;
             font-size: 18px;
             float: right;
         }
        .btn:hover{
            color:#fff;
            background-color:#f05050;
        }
    </style>
</head>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script>
    $(function () {
        $.ajax({
            url:"/home/reception/init",
            type:"post",
            success:function (result) {
                if (result.code==200){
                    //头条
                    headline(result);
                    //公告
                    affiche(result);
                    //活动
                    activity(result);
                    //热门
                    hot(result);
                    //其他
                    other(result);
                }
                if (result.code==404){
                    alert(result.message);
                }
            }
        })
        function headline(result) {
            var title1 = result.object.headline[0].articleTitle;
            var articleId1 = result.object.headline[0].id;
            var title2 = result.object.headline[1].articleTitle;
            var articleId2 = result.object.headline[1].id;
            var title3 = result.object.headline[2].articleTitle;
            var articleId3 = result.object.headline[2].id;
            $(".big-pic-box>div:first a").attr("href","/article/show?id="+articleId1);
            $(".big-pic-box>div:first a").attr("title",title1);
            $(".big-pic-box>div:first a>div:first>img").attr("src",result.object.headline[0].articlePicture);
            $(".big-pic-box>div:first a>div:first>img").attr("alt",title1)
            $(".big-pic-box>div:first a>div:last>h1").html(title1);
            $(".big-pic-box>div:eq(1)>a:first").attr("href","/article/show?id="+articleId2);
            $(".big-pic-box>div:eq(1)>a:first>img").attr("src",result.object.headline[1].articlePicture);
            $(".big-pic-box>div:eq(1)>a:last").attr("href","/article/show?id="+articleId2);
            $(".big-pic-box>div:eq(1)>a:last").attr("title",title2);
            $(".big-pic-box>div:eq(1)>a:last>div>h2").html(title2);
            $(".big-pic-box>div:eq(2)>a:first").attr("href","/article/show?id="+articleId3);
            $(".big-pic-box>div:eq(2)>a:first").attr("title",title3);
            $(".big-pic-box>div:eq(2)>a:first>img").attr("src",result.object.headline[2].articlePicture);
            $(".big-pic-box>div:eq(2)>a:last").attr("href","/article/show?id="+articleId3);
            $(".big-pic-box>div:eq(2)>a:last>div>h2").html(title3);
        }
        function affiche(result) {
            var title1 = result.object.affiche[0].articleTitle;
            var createDate1 = result.object.affiche[0].createTimeStr;
            var articleId1 = result.object.affiche[0].id;
            var title2 = result.object.affiche[1].articleTitle;
            var createDate2 = result.object.affiche[1].createTimeStr;
            var articleId2 = result.object.affiche[1].id;
            var title3 = result.object.affiche[2].articleTitle;
            var createDate3 = result.object.affiche[2].createTimeStr;
            var articleId3 = result.object.affiche[2].id;
            $("#affiche ul>li:eq(0)>span:first").html("["+createDate1+"]");
            $("#affiche ul>li:eq(0)>span:last a").attr("href","/article/show?id="+articleId1);
            $("#affiche ul>li:eq(0)>span:last a").html(title1);
            $("#affiche ul>li:eq(1)>span:first").html("["+createDate2+"]");
            $("#affiche ul>li:eq(1)>span:last a").attr("href","/article/show?id="+articleId2);
            $("#affiche ul>li:eq(1)>span:last a").html(title2);
            $("#affiche ul>li:eq(2)>span:first").html("["+createDate3+"]");
            $("#affiche ul>li:eq(2)>span:last a").attr("href","/article/show?id="+articleId3);
            $("#affiche ul>li:eq(2)>span:last a").html(title3);
        }
        function activity(result) {
            var title1 = result.object.activity[0].articleTitle;
            var createDate1 = result.object.activity[0].createTimeStr;
            var articleId1 = result.object.activity[0].id;
            var title2 = result.object.activity[1].articleTitle;
            var createDate2 = result.object.activity[1].createTimeStr;
            var articleId2 = result.object.activity[1].id;
            var title3 = result.object.activity[2].articleTitle
            var createDate3 = result.object.activity[2].createTimeStr;
            var articleId3 = result.object.activity[2].id;
            $("#activity ul>li:eq(0)>span:first").html("["+createDate1+"]")
            $("#activity ul>li:eq(0)>span:last a").attr("href","/article/show?id="+articleId1);
            $("#activity ul>li:eq(0)>span:last a").html(title1);
            $("#activity ul>li:eq(1)>span:first").html("["+createDate2+"]")
            $("#activity ul>li:eq(1)>span:last a").attr("href","/article/show?id="+articleId2);
            $("#activity ul>li:eq(1)>span:last a").html(title2);
            $("#activity ul>li:eq(2)>span:first").html("["+createDate3+"]");
            $("#activity ul>li:eq(2)>span:last a").attr("href","/article/show?id="+articleId3);
            $("#activity ul>li:eq(2)>span:last a").html(title3);
        }
        function hot(result) {
            $.each(result.object.hot,function (index,elem) {
                $("#hotArticle").find(".hot-article-img:eq("+index+")").find("a").attr("href","/article/show?id="+elem.id);
                $("#hotArticle").find(".hot-article-img:eq("+index+")").find("a").attr("title",elem.articleTitle);
                $("#hotArticle").find(".hot-article-img:eq("+index+")").find("a>img").attr("src",elem.articlePicture);
                $("#hotArticle").find(".transition:eq("+index+")").attr("href","/article/show?id="+elem.id);
                $("#hotArticle").find(".transition:eq("+index+")").html(elem.articleTitle);
            })
        }
        function other(result) {
            $.each(result.object.other,function (index,elem) {
                $("#other").find(".mod-art:eq("+index+")").find(".transition").attr("href","/article/show?id="+elem.id);
                $("#other").find(".mod-art:eq("+index+")").find(".transition").attr("title",elem.articleTitle);
                $("#other").find(".mod-art:eq("+index+")").find(".lazy").attr("src",elem.articlePicture);
                $("#other").find(".mod-art:eq("+index+")").find(".lazy").attr("alt",elem.articleTitle);
                $("#other").find(".mod-art:eq("+(index)+")").find(".msubstr-row2").attr("href","/article/show?id="+elem.id);
                $("#other").find(".mod-art:eq("+(index)+")").find(".msubstr-row2").html(elem.articleTitle);
                $("#other").find(".mod-art:eq("+(index)+")").find(".mob-author").find("a").attr("href","/article/show?id="+elem.id);
                $("#other").find(".mod-art:eq("+(index)+")").find(".mob-author").find("a").find(".author-name").html(elem.userName);
                $("#other").find(".mod-art:eq("+(index)+")").find(".mob-author").find(".author-face>a").attr("href","/article/show?id="+elem.id);
                $("#other").find(".mod-art:eq("+(index)+")").find(".mob-author").find(".author-face>a>img").attr("src",elem.userPicture);
                $("#other").find(".mod-art:eq("+(index)+")").find(".mob-author>a").attr("href","/article/show?id="+elem.id);
                $("#other").find(".mod-art:eq("+(index)+")").find(".mob-author>i").next("em").html(elem.countReview);
                if(elem.timeDifference<=24){
                    $("#other").find(".mod-art:eq("+index+")").find(".time").html(elem.timeDifference+"小时");
                }else {
                    $("#other").find(".mod-art:eq("+index+")").find(".time").html(elem.createTimeStr);
                }
                $("#other").find(".mod-art:eq("+(index)+")").find(".mob-sub").html(elem.articleTitle);
            })
        }
    })
</script>
<body>
<header id="top" role="banner" class="transition">
    <div class="container">
        <div class="navbar-header transition">
            <a href="#" title="首页"><img src="images/logo.png" alt="创作收益平台" title="创作收益平台" /></a>
        </div>
        <ul class="nav navbar-nav navbar-left" id="jsddm" style="margin-top: 21px;">
            <li class="nav-news">
                <p style="font-size:20px;color: red;margin-top: -23px">
                    <strong>Pluralization &nbsp;&nbsp;&nbsp;&nbsp; High Quality &nbsp;&nbsp;&nbsp;&nbsp; Earnings</strong>
                </p>
            </li>
        </ul>
        <c:if test="${activeUser.isLogin==1}">
        <a href="/article/type/list"><input type="button" class="btn" value="发表" name="add" ></a>
        </c:if>
        <ul id="logout" style="float: right;margin-right: 30px">退出</ul>
        <ul class="nav navbar-nav navbar-right transition  xiala main_nav">
            <c:if test="${activeUser.isLogin==0 || empty activeUser.isLogin}">
            <li class="login-link-box" ><a class="cd-signin" style="margin-top: 21px;margin-right: 10px">登录</a></li>
            <li><a class="cd-signup" style="margin-top: 21px;margin-right: 10px">注册</a></li>
            </c:if>
            <li></li>
            <li></li>
            <c:if test="${activeUser.isLogin==1}">
            <li class="search-li js-show-search-box">欢迎<span style="height: 30px;margin-right: 5px">${activeUser.userName}</span></li>
            </c:if>
        </ul>
    </div>
    <div class="cd-user-modal">
        <div class="cd-user-modal-container">
            <div id="cd-login"> <!-- 登录表单 -->
                <div class="modal-alert-title" style="text-align: center">登录</div>
                <div class="register" >
                    <div class="register-top" id="reg-top"><i><a id="qrcode" href="#"></a></i></div>
                    <div class="register-con" id="rc">
                        <div class="login-form username-box " style="margin-top:52px;">
                            <label class="login-label transition" style="margin-bottom: 15px">
                                <input id="login_username" class="login-input" placeholder="用户名登录">
                            </label>
                            <label class="login-label">
                                <input id="login_password" class="login-input password" type="password" placeholder="请输入6～15位密码">
                            </label>
                            <div class="login-operation">
                                <%--<label><input id="autologin" type="checkbox">&nbsp;2周内自动登录</label>--%>
                                <a href="/user/reset_password" class="js-forget-passward pull-right">忘记密码</a>
                            </div>
                            <button id="button1" class="js-btn-login btn-login">登&nbsp;录</button>
                        </div>
                    </div>
                </div>
            </div>
            <div id="cd-signup"> <!-- 注册表单 -->
                <div class="modal-alert-title" style="text-align: center">注册</div>
                <div class="user-register-box">
                    <div class="login-form sms-box" style="margin-top:52px;">
                        <label class="login-label transition" style="margin-bottom: 15px">
                            <input id="register_username" class="login-input" placeholder="请输入用户名">
                        </label><br/>
                        <label class="login-label">
                            <input id="register_password" class="login-input password" type="password" placeholder="请输入6～15位密码">
                        </label>
                        <button id="button2" class="js-btn-sms-login btn-login">注&nbsp;册</button>
                    </div>
                <%--<div class="js-user-login register-text">已有账号，立即登录</div></div>--%>
            </div>
            <a href="#0" class="cd-close-form ">关闭</a>
        </div>
     </div>
    </div>
    <script src="js/firstjs/d-login.js"></script>
</header>

<div class="placeholder-height"></div>
<div class="placeholder-height"></div>
<div class="container" id="index">
    <div class="wrap-left pull-left">
        <div class="big-pic-box">
            <div class="big-pic">
                <a href="#" target="_blank" class="transition" title="">
                    <div class="back-img"><img src=""  alt=""></div>
                    <div class="big-pic-content">
                        <h1 class="t-h1"></h1>
                    </div>
                </a>
            </div>
            <div class="big2-pic big2-pic-index big2-pic-index-top">
                <a href="#" class="back-img transition" target="_blank" title="">
                    <img class="lazy" src="" alt="">
                </a>
                <a href="#" target="_blank" title="">
                    <div class="big2-pic-content">
                        <h2 class="t-h1"></h2>
                    </div>
                </a>
            </div>
            <div class="big2-pic big2-pic-index big2-pic-index-bottom">
                <a href="#" class="back-img transition" target="_blank" title="">
                    <img class="lazy" src="" alt="">
                </a>
                <a href="#" target="_blank" >
                    <div class="big2-pic-content">
                        <h2 class="t-h1"></h2>
                    </div>
                </a>
            </div>
        </div>
        <div class="mod-info-flow" id="other">
            <div class="mod-b mod-art" data-aid="213665">
                <div class="mod-thumb ">
                    <a class="transition" title="" href="#" target="_blank">
                        <img class="lazy" src="../../images/sy-img/111527830443.jpg" alt="你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低">
                    </a>
                </div>
                <div class="mob-ctt">
                    <h2><a href="#" class="transition msubstr-row2" target="_blank"></a></h2>
                    <div class="mob-author">
                        <div class="author-face">
                            <a href="#" target="_blank"><img src="../../images/sy-img/59_1502432173.jpg"></a>
                        </div>
                        <a href="#" target="_blank">
                            <span class="author-name ">量子位</span>
                        </a>
                        <span class="time">1小时前</span>
                        <i class="icon icon-cmt"></i><em>0</em>
                    </div>
                    <div class="mob-sub">公司纷纷看好人工智能技术潜力的同时，真正应用在自己业务中的并不算多</div>
                </div>
            </div>
            <div class="mod-b mod-art" data-aid="213665">
                <div class="mod-thumb ">
                    <a class="transition" title="你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低" href="#" target="_blank">
                        <img class="lazy" src="../../images/sy-img/111527830443.jpg" alt="你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低">
                    </a>
                </div>
                <div class="mob-ctt">
                    <h2><a href="#" class="transition msubstr-row2" target="_blank">你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低</a></h2>
                    <div class="mob-author">
                        <div class="author-face">
                            <a href="#" target="_blank"><img src="../../images/sy-img/59_1502432173.jpg"></a>
                        </div>
                        <a href="#" target="_blank">
                            <span class="author-name ">量子位</span>
                        </a>
                        <span class="time">1小时前</span>
                        <i class="icon icon-cmt"></i><em>0</em>
                    </div>
                    <div class="mob-sub">公司纷纷看好人工智能技术潜力的同时，真正应用在自己业务中的并不算多</div>
                </div>
            </div>
            <div class="mod-b mod-art" data-aid="213665">
                <div class="mod-thumb ">
                    <a class="transition" title="你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低" href="#" target="_blank">
                        <img class="lazy" src="../../images/sy-img/111527830443.jpg" alt="你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低">
                    </a>
                </div>
                <div class="mob-ctt">
                    <h2><a href="#" class="transition msubstr-row2" target="_blank">你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低</a></h2>
                    <div class="mob-author">
                        <div class="author-face">
                            <a href="#" target="_blank"><img src="../../images/sy-img/59_1502432173.jpg"></a>
                        </div>
                        <a href="#" target="_blank">
                            <span class="author-name ">量子位</span>
                        </a>
                        <span class="time">1小时前</span>
                        <i class="icon icon-cmt"></i><em>0</em>
                    </div>
                    <div class="mob-sub">公司纷纷看好人工智能技术潜力的同时，真正应用在自己业务中的并不算多</div>
                </div>
            </div>
            <div class="mod-b mod-art" data-aid="213665">
                <div class="mod-thumb ">
                    <a class="transition" title="你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低" href="#" target="_blank">
                        <img class="lazy" src="../../images/sy-img/111527830443.jpg" alt="你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低">
                    </a>
                </div>
                <div class="mob-ctt">
                    <h2><a href="#" class="transition msubstr-row2" target="_blank">你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低</a></h2>
                    <div class="mob-author">
                        <div class="author-face">
                            <a href="#" target="_blank"><img src="../../images/sy-img/59_1502432173.jpg"></a>
                        </div>
                        <a href="#" target="_blank">
                            <span class="author-name ">量子位</span>
                        </a>
                        <span class="time">1小时前</span>
                        <i class="icon icon-cmt"></i><em>0</em>
                    </div>
                    <div class="mob-sub">公司纷纷看好人工智能技术潜力的同时，真正应用在自己业务中的并不算多</div>
                </div>
            </div>
            <div class="mod-b mod-art" data-aid="213665">
                <div class="mod-thumb ">
                    <a class="transition" title="你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低" href="#" target="_blank">
                        <img class="lazy" src="../../images/sy-img/111527830443.jpg" alt="你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低">
                    </a>
                </div>
                <div class="mob-ctt">
                    <h2><a href="#" class="transition msubstr-row2" target="_blank">你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低</a></h2>
                    <div class="mob-author">
                        <div class="author-face">
                            <a href="#" target="_blank"><img src="../../images/sy-img/59_1502432173.jpg"></a>
                        </div>
                        <a href="#" target="_blank">
                            <span class="author-name ">量子位</span>
                        </a>
                        <span class="time">1小时前</span>
                        <i class="icon icon-cmt"></i><em>0</em>
                    </div>
                    <div class="mob-sub">公司纷纷看好人工智能技术潜力的同时，真正应用在自己业务中的并不算多</div>
                </div>
            </div>
            <div class="mod-b mod-art" data-aid="213665">
                <div class="mod-thumb ">
                    <a class="transition" title="你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低" href="#" target="_blank">
                        <img class="lazy" src="../../images/sy-img/111527830443.jpg" alt="你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低">
                    </a>
                </div>
                <div class="mob-ctt">
                    <h2><a href="#" class="transition msubstr-row2" target="_blank">你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低</a></h2>
                    <div class="mob-author">
                        <div class="author-face">
                            <a href="#" target="_blank"><img src="../../images/sy-img/59_1502432173.jpg"></a>
                        </div>
                        <a href="#" target="_blank">
                            <span class="author-name ">量子位</span>
                        </a>
                        <span class="time">1小时前</span>
                        <i class="icon icon-cmt"></i><em>0</em>
                    </div>
                    <div class="mob-sub">公司纷纷看好人工智能技术潜力的同时，真正应用在自己业务中的并不算多</div>
                </div>
            </div>
            <div class="mod-b mod-art" data-aid="213665">
                <div class="mod-thumb ">
                    <a class="transition" title="你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低" href="#" target="_blank">
                        <img class="lazy" src="../../images/sy-img/111527830443.jpg" alt="你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低">
                    </a>
                </div>
                <div class="mob-ctt">
                    <h2><a href="#" class="transition msubstr-row2" target="_blank">你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低</a></h2>
                    <div class="mob-author">
                        <div class="author-face">
                            <a href="#" target="_blank"><img src="../../images/sy-img/59_1502432173.jpg"></a>
                        </div>
                        <a href="#" target="_blank">
                            <span class="author-name ">量子位</span>
                        </a>
                        <span class="time">1小时前</span>
                        <i class="icon icon-cmt"></i><em>0</em>
                    </div>
                    <div class="mob-sub">公司纷纷看好人工智能技术潜力的同时，真正应用在自己业务中的并不算多</div>
                </div>
            </div>
            <div class="mod-b mod-art" data-aid="213665">
                <div class="mod-thumb ">
                    <a class="transition" title="你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低" href="#" target="_blank">
                        <img class="lazy" src="../../images/sy-img/111527830443.jpg" alt="你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低">
                    </a>
                </div>
                <div class="mob-ctt">
                    <h2><a href="#" class="transition msubstr-row2" target="_blank">你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低</a></h2>
                    <div class="mob-author">
                        <div class="author-face">
                            <a href="#" target="_blank"><img src="../../images/sy-img/59_1502432173.jpg"></a>
                        </div>
                        <a href="#" target="_blank">
                            <span class="author-name ">量子位</span>
                        </a>
                        <span class="time">1小时前</span>
                        <i class="icon icon-cmt"></i><em>0</em>
                    </div>
                    <div class="mob-sub">公司纷纷看好人工智能技术潜力的同时，真正应用在自己业务中的并不算多</div>
                </div>
            </div>
            <div class="mod-b mod-art" data-aid="213665">
                <div class="mod-thumb ">
                    <a class="transition" title="你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低" href="#" target="_blank">
                        <img class="lazy" src="../../images/sy-img/111527830443.jpg" alt="你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低">
                    </a>
                </div>
                <div class="mob-ctt">
                    <h2><a href="#" class="transition msubstr-row2" target="_blank">你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低</a></h2>
                    <div class="mob-author">
                        <div class="author-face">
                            <a href="#" target="_blank"><img src="../../images/sy-img/59_1502432173.jpg"></a>
                        </div>
                        <a href="#" target="_blank">
                            <span class="author-name ">量子位</span>
                        </a>
                        <span class="time">1小时前</span>
                        <i class="icon icon-cmt"></i><em>0</em>
                    </div>
                    <div class="mob-sub">公司纷纷看好人工智能技术潜力的同时，真正应用在自己业务中的并不算多</div>
                </div>
            </div>
            <div class="mod-b mod-art" data-aid="213665">
                <div class="mod-thumb ">
                    <a class="transition" title="你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低" href="#" target="_blank">
                        <img class="lazy" src="" alt="你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低">
                    </a>
                </div>
                <div class="mob-ctt">
                    <h2><a href="#" class="transition msubstr-row2" target="_blank">你的公司够前沿吗？至少在AI这件事上，多数企业都眼高手低</a></h2>
                    <div class="mob-author">
                        <div class="author-face">
                            <a href="#" target="_blank"><img src=""></a>
                        </div>
                        <a href="#" target="_blank">
                            <span class="author-name ">量子位</span>
                        </a>
                        <span class="time">1小时前</span>
                        <i class="icon icon-cmt"></i><em>0</em>
                    </div>
                    <div class="mob-sub">公司纷纷看好人工智能技术潜力的同时，真正应用在自己业务中的并不算多</div>
                </div>
            </div>
        </div>
        <div class="get-mod-more js-get-mod-more-list transition" data-cur_page="1" data-last_dateline="1504655833">
            点击加载更多
        </div>
    </div>
    <div class="wrap-right pull-right">
        <div class="right-ad-box"></div>

        <link rel="stylesheet" type="text/css" href="https://static.huxiucdn.com/www/css/moment.css">
        <div id="moment"></div>
        <div class="box-moder moder-project-list" id="affiche">
            <h3>公告</h3>
            <span class="pull-right project-more"><a href="#" class="transition" target="_blank">更多>></a></span>
            <span class="span-mark"></span>
            <ul>
                <li style="min-height:65px;">
                    <span style="color: red">[2018-04-15]</span> &nbsp;&nbsp;
                    <span><a href="" style="color: gray;">命名规则修改通知</a>
                        <span style="color: red;font-style: italic">[new]</span>
                    </span>
                </li>
                <li>
                    <span style="color: red">[2018-04-15]</span> &nbsp;&nbsp;
                    <span><a href="" style="color: gray;">命名规则修改通知</a></span>
                </li>
                <li>
                    <span style="color: red">[2018-04-15]</span> &nbsp;&nbsp;
                    <span><a href="" style="color: gray;">命名规则修改通知</a></span>
                </li>
            </ul>
        </div>
        <div class="placeholder"></div>
        <div class="box-moder moder-project-list" id="activity">
            <h3>活动</h3>
            <span class="pull-right project-more"><a href="#" class="transition" target="_blank">更多>></a></span>
            <span class="span-mark"></span>
            <ul>
                <li style="min-height:65px;">
                    <span style="color: red">[2018-04-15]</span> &nbsp;&nbsp;
                    <span><a href="" style="color: gray;">「礼遇计划」升级，每月奖励500个帐号，最高2万奖金</a>
                        <span style="color: red;font-style: italic">[new]</span>
                    </span>
                </li>
                <li>
                    <span style="color: red">[2018-04-15]</span> &nbsp;&nbsp;
                    <span><a href="" style="color: gray;">「礼遇计划」升级，每月奖励500个帐号，最高2万奖金</a></span>
                </li>
                <li>
                    <span style="color: red">[2018-04-15]</span> &nbsp;&nbsp;
                    <span><a href="" style="color: gray;">「礼遇计划」升级，每月奖励500个帐号，最高2万奖金</a></span>
                </li>
            </ul>
        </div>
        <div class="placeholder"></div>
        <div class="box-moder hot-article" id="hotArticle">
            <h3>热文</h3>
            <span class="span-mark"></span>
            <ul>
                <li>
                    <div class="hot-article-img">
                        <a href="#" target="_blank" title="华谊：老了，还花心">
                            <img src="../../images/sy-img/105108838520.jpg">
                        </a>
                    </div>
                    <a href="#" class="transition" target="_blank">华谊：老了，还花心</a>
                </li>
                <li>
                    <div class="hot-article-img">
                        <a href="#" target="_blank" title="华谊：老了，还花心">
                            <img src="../../images/sy-img/105108838520.jpg">
                        </a>
                    </div>
                    <a href="#" class="transition" target="_blank">华谊：老了，还花心</a>
                </li>
                <li>
                    <div class="hot-article-img">
                        <a href="#" target="_blank" title="华谊：老了，还花心">
                            <img src="../../images/sy-img/105108838520.jpg">
                        </a>
                    </div>
                    <a href="#" class="transition" target="_blank">华谊：老了，还花心</a>
                </li>
                <li>
                    <div class="hot-article-img">
                        <a href="#" target="_blank" title="华谊：老了，还花心">
                            <img src="../../images/sy-img/105108838520.jpg">
                        </a>
                    </div>
                    <a href="#" class="transition" target="_blank">华谊：老了，还花心</a>
                </li>
                <li>
                    <div class="hot-article-img">
                        <a href="#" target="_blank" title="华谊：老了，还花心">
                            <img src="../../images/sy-img/105108838520.jpg">
                        </a>
                    </div>
                    <a href="#" class="transition" target="_blank">华谊：老了，还花心</a>
                </li>
                <li>
                    <div class="hot-article-img">
                        <a href="#" target="_blank" title="华谊：老了，还花心">
                            <img src="../../images/sy-img/105108838520.jpg">
                        </a>
                    </div>
                    <a href="#" class="transition" target="_blank">华谊：老了，还花心</a>
                </li>

            </ul>
        </div>
        <div class="placeholder"></div>
    </div>
</div>

<footer class="footer">
    <div class="modal-backdrop fade in js-modal-backdrop"></div>
    <div class="container copy-right" align="center">
        <span>Copyright © <a href="views/show.jsp">创作收益平台 chenliting</a>
        </span>
    </div>

</footer>
<script type="text/javascript" src="js/firstjs/mouse.js"></script>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script>
    var loginType = "HOME_PAGE_LOGIN";
    $("#button1").click(function () {
        var username = $("#login_username").val();
        var password = $("#login_password").val();
        window.location="${ctx}/account/login?username="+username+"&password="+password+"&loginType="+loginType;
    })
    $("#button2").click(function () {
        var obj ={
            username:$("#register_username").val(),
            password:$("#register_password").val()
        }
        $.ajax({
            url:"/account/home/register",
            type:"post",
            data:obj,
            success:function (rs) {
                if(rs.code==200){
                    window.location="${ctx}/views/show.jsp"
                }
                if(rs.code==404){
                    alert(rs.message);
                }
            }
        })
    })
    //退出
    $("#logout").click(function () {
        var logintype="HOME_PAGE_LOGIN";
        $.ajax({
            url:"/account/logout",
            type:"post",
            data:"loginType="+logintype,
            success:function (rs) {
                if(rs.code==200){
                    window.location="${ctx}/views/show.jsp"
                }
                if (rs.code==404){
                    alert(rs.message);
                }
            }
        })
    })
</script>
</body>
</html>
