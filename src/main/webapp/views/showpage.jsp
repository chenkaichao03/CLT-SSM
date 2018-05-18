<%@ taglib uri="/WEB-INF/tlds/c.tld" prefix="c"%>
<%@ taglib uri="/WEB-INF/tlds/fmt.tld" prefix="fmt"%>
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
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <base href="<%=basePath%>">
    <title>articleshow</title>
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
        .btn{
            background: #f05050;
        }
        .btn:hover{
            color: #fff;
        }
    </style>
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
            <a href="#" title="首页"><img src="images/logo.png" alt="创作收益平台" title="创作收益平台" /></a>
        </div>
        <ul class="nav navbar-nav navbar-left" id="jsddm" style="margin-top: 21px;">
            <li class="nav-news">
                <p style="font-size:20px;color: red;margin-top: -23px">
                    <strong>Pluralization &nbsp;&nbsp;&nbsp;&nbsp; High Quality &nbsp;&nbsp;&nbsp;&nbsp; Earnings</strong>
                </p>
            </li>
        </ul>
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
<div class="article-section-wrap">
    <div class="article-section" data-aid="197460">
        <div class="container" id="article197460">
            <div class="nrtj-wrap" id="nrtj-wrap197460"></div>
            <div class="wrap-left pull-left">
                <!--文章内容页-->
                <div class="article-wrap">
                    <h1 class="t-h1">${article.articleTitle}</h1>
                    <div class="article-author">
                        <%--<span class="author-name"><a href="" target="_blank">作者</a></span>--%>
                        <div class="column-link-box">
                            <span class="article-time pull-left">${article.createTimeStr}</span>
                            <span class="article-pl pull-left">评论${countReview}</span>
                           <%-- <a href="#" class="column-link" target="_blank">创业维艰</a> <i></i>--%>
                        </div>
                    </div>
                    <!--管理员按钮-->
                    <div class="article-manage-bar" id="article-manage-bar197460"></div>
                    <!--文章头图-->
                    <div class="article-img-box"><img src="${article.articlePicture}" alt="${article.articleTitle}"></div>
                    <div id="article_content197460" class="article-content-wrap">
                        <p>${article.articleContent}</p>
                        <p><br/></p>
                    </div>
                    <div class="Qr-code">
                        <!--普通文章点赞-->
                        <div class="praise-box transition js-like-article pull-right " data-type="like" id="fabulous">
                            <i class="icon icon-article-zan"></i><span class="num">${countFabulous}</span>
                        </div>
                        <div class="js-qr-img transition info-false">
                            <div class="article-zfb-wx-box" onmouseover="isOut=false" onmouseout="isOut=true">
                                <ul>
                                    <li class="zhifb-mouseover">
                                        <i class="icon icon-zhifb"></i>
                                        <div class="j-btm zfbdashang-wrap"><img src="https://mobilecodec.alipay.com/show.htm?code=rex021253evapgmoq9smla8" alt=""/><i class="c2">给 Ta打个赏</i></div>
                                    </li>
                                    <li class="weix-mouseover"><i class="icon icon-weix"></i>
                                        <div class="j-btm wxdashang-wrap"><img src="https://img.huxiucdn.com/author_qr/8/1373658_1496668398_weixin.jpg" alt=""/><i class="c2">给 Ta 打个赏</i></div>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <!--公共评论-->
                    <div class="pl-wrap" id="pl-wrap-article197460" name="pl-wrap-article">
                        <!--登录评论-->
                        <div class="pl-form-wrap">
                            <span class="span-mark-author active">发表评论</span>
                            <div class="pl-form-box pl-article-wrap">
                                <c:if test="${activeUser.isLogin==0 || empty activeUser.isLogin}">
                                <div class="no-login-box" style="margin-left:10px">
                                    <ul class="nav navbar-nav navbar-right transition  xiala main_nav" style="margin-right: 280px">
                                        <a class="cd-signin">登录</a>后参与评论
                                    </ul>
                                </div>
                                </c:if>
                                <c:if test="${activeUser.isLogin==1}">
                                <textarea class="form-control" id="saytext197460" name="saytext" placeholder="客官，8个字起评，不讲价哟"></textarea>
                                <!--普通文章评论发表-->
                                <button class="btn btn-article js-login transition ">发表</button>
                                </c:if>
                            </div>
                        </div>
                        <!--点评-->
                        <div id="pl-wrap197460" name="pl-wrap"></div>
                        <div class="pl-list-wrap">
                            <a href="javascript:void(0)" class="span-mark-author active js-default-new-pl" data-type="agree">评论列表</a>
                            <c:forEach var="review" items="${pageData.reviewList}">
                            <div class="pl-box-wrap">
                                <input type="hidden" value="${review.id}">
                                <div class="pl-box-top">
                                    <div class="author-info">
                                        <div class="author-face"><img src="${review.reviewUserPicture}"></div>
                                        <span class="author-name">
                    					<a href="#">${review.reviewUserName}</a>
                    					<a href="#" target="_blank"></a>
                					</span>
                                        <span class="time">${review.dayDifferent}天前</span>
                                    </div>
                                    <div class="pl-content">${review.content}</div>
                                    <div class="dp-box">
                                        <c:forEach var="detail" items="${review.reviewDetailList}">
                                        <span class="span-mark-author">点评</span>
                                        <div class="dl-user dl-user-list  " data-type="dl-user" style="display:block">
                                            <ul>
                                                <li class="del-pl108924"><a href="#" target="_blank"><img src="${detail.reviewUserPicture}"></a></li>
                                            </ul>
                                            <!--只有一条点评时显示-->
                                            <div class="one-pl-content one-pl-content-box">
                                                <div class="pull-right time">${detail.dayDifferent}天前</div>
                                                <p class="content">
                                                    <span class="name">${detail.reviewUserName}</span>
                                                    <a href="#" target="_blank"></a>&nbsp;&nbsp;
                                                    <span class="author-content">${detail.content}</span>
                                                </p>
                                                <div class="js-hf-article-pl"><span>回复</span></div>
                                                <div class="pl-form-box dp-article-box">
                                                    <textarea class="form-control hide" placeholder="客官，8个字起评，不讲价哟"></textarea>
                                                    <input type="hidden"  value="${detail.id}">
                                                    <button class="btn btn-article js-article-dp hide">发表</button>
                                                </div>
                                                <c:forEach var="detailsChild" items="${detail.reviewDetails}" >
                                                <div class="dl-user dl-user-list  " data-type="dl-user" style="display:block">
                                                    <ul>
                                                        <li class="del-pl108924"><a href="#" target="_blank"><img src="${detailsChild.reviewUserPicture}"></a></li>
                                                    </ul>
                                                    <!--只有一条点评时显示-->
                                                    <div class="one-pl-content one-pl-content-box">
                                                        <div class="pull-right time">${detailsChild.dayDifferent}天前</div>
                                                        <p class="content">
                                                            <span class="name">${detailsChild.reviewUserName}</span>
                                                            <a href="#" target="_blank"></a>&nbsp;&nbsp;
                                                            <span class="author-content">${detailsChild.content}</span>
                                                        </p>
                                                    </div>
                                                </div>
                                                </c:forEach>
                                            </div>
                                        </div>
                                        </c:forEach>
                                    </div>
                                </div>
                                <div class="pl-box-btm">
                                    <div class="article-type pull-right">
<%--                                        <div class="icon-like-prompt">
                                            <i class="icon icon-like active"></i><span class="c1">+1</span>
                                        </div>
                                        <div class="icon-no-like-prompt">
                                            <i class="icon icon-no-like active"></i><span class="c1">+1</span>
                                        </div>--%>
                                        <ul>
                                            <li class="js-icon-like" data-type="like"><i class="icon icon-like "></i><span class="like">${review.countGoodReview}</span></li>
                                            <li class="js-no-icon-like" data-type="no-like"><i class="icon icon-no-like "></i><span class="like">${review.countBadReview}</span></li>
                                        </ul>
                                    </div>
                                    <div class="btn-dp transition js-add-dp-box"><i class="icon icon-dp"></i>我要点评</div>
                                    <div class="pl-form-box dp-article-box">
                                        <textarea class="form-control hide" placeholder="客官，8个字起评，不讲价哟"></textarea>
                                        <button class="btn btn-article js-article-dp hide">发表</button>
                                        <%--<input type="hidden" value="${review.id}">--%>
                                    </div>
                                </div>
                            </div>
                            </c:forEach>
                        </div>
                    </div>
                    <div class="m-style" style="float: right;margin-right:500px"></div>
                    <!--相关文章位置-->
                    <div id="related-article-wrap197460"></div>
                </div>
            </div>
            <div class="wrap-right pull-right">
                <c:if test="${user.role=='user'}">
                <div class="box-author-info">
                    <div class="author-face">
                        <a href="#" target="_blank">
                            <img src="${userInfo.userPicture}">
                        </a>
                    </div>
                    <div class="author-name">
                        <a href="#" target="_blank">${userInfo.realName}</a>
                    </div>
                    <div class="author-one">
                        <span>粉丝：</span>
                        <span>${countFansAndConcern.fansCount}</span>
                    </div>
                    <div class="author-one">
                        <span>关注：</span>
                        <span>${countFansAndConcern.concernCount}</span>
                    </div>
                    <div class="author-article-pl">
                        <ul>
                            <li><span><input type="button" class="btn" value="${concernType==0?'未关注':(concernType==1?'已关注':'互相关注')}" name="add"  id="concern"></span></li>
                        </ul>
                    </div>
                    <div class="author-next-article">
                        <div class="author-one c2">最近文章</div>
                        <a href="#" target="_blank">冷眼看快手的"短视频社交"</a>
                    </div>
                </div>
                </c:if>
                <div class="box-moder hot-tag">
                    <h3>热门标签</h3>
                    <span class="pull-right project-more"><a href="#" class="transition" target="_blank">全部</a></span>
                    <span class="span-mark"></span>
                    <div class="search-history search-hot">
                        <ul>
                            <li class="transition"><a href="#" target="_blank">阿里巴巴</a></li>
                            <li class="transition"><a href="#" target="_blank">投稿</a></li>
                            <li class="transition"><a href="#" target="_blank">创业</a></li>
                            <li class="transition"><a href="#" target="_blank">头条</a></li>
                            <li class="transition"><a href="#" target="_blank">马云</a></li>
                            <li class="transition"><a href="#" target="_blank">大数据</a></li>
                            <li class="transition"><a href="#" target="_blank">移动互联网</a></li>
                            <li class="transition"><a href="#" target="_blank">电子商务</a></li>
                            <li class="transition"><a href="#" target="_blank">微信</a></li>
                            <li class="transition"><a href="#" target="_blank">Facebook</a></li>
                        </ul>
                    </div>
                </div>
                <div class="placeholder"></div>
                <div class="box-moder hot-article">
                    <h3>热文</h3>
                    <span class="span-mark"></span>
                    <ul>
                        <c:forEach var="hotArticle" items="${hot}">
                        <li>
                            <div class="hot-article-img">
                                <a href="${ctx}/article/show?id=${hotArticle.id}" target="_blank"><img src="${hotArticle.articlePicture}"></a>
                            </div>
                            <a href="${ctx}/article/show?id=${hotArticle.id}" class="transition" target="_blank">${hotArticle.articleTitle}</a>
                        </li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="article-section article-section-last"></div>
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
<script type="text/javascript" src="/js/highlight.min.js"></script>
<script type="text/javascript" src="/js/jquery.pagination.js"></script>
<script type="text/javascript">
    //登录
    var loginType = "SHOW_PAGE";
    $("#button1").click(function () {
        var username = $("#login_username").val();
        var password = $("#login_password").val();
        window.location="${ctx}/account/login?username="+username+"&password="+password+"&loginType="+loginType+"&articleId=${article.id}";
    })
    //注册
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
                    window.location="${ctx}/article/show?id=${article.id}";
                }
                if (rs.code==404){
                    alert(rs.message);
                }
            }
        })
    });
    $("#concern").click(function () {
        var concernedUserId="${article.createUserId}";
        $.ajax({
            url:"/article/concern",
            type:"post",
            data:"concernedUserId="+concernedUserId,
            success:function (rs) {
                if (rs.code==200){
                    window.location="${ctx}/article/show?id=${article.id}";
                }
                if (rs.code==404){
                    alert(rs.message);
                }
            }
        });
    });
    //点赞
    $("#fabulous").click(function () {
        var obj={
            articleId:"${article.id}",
            fabulousUserId:"${activeUser.userId}"
        }
        $.ajax({
            url:"/article/fabulous",
            type:"post",
            data:obj,
            success:function (rs) {
                if (rs.code==200){
                    window.location="${ctx}/article/show?id=${article.id}";
                }
                if (rs.code==404){
                    alert(rs.message);
                }
            }
        })
    })
    //评论弹框
    $(".pl-box-top").find(".js-hf-article-pl").click(function () {
        var $comment = $(this).next("div").find("textarea");
        var $publish = $(this).next("div").find("button");
        if ($comment.hasClass("hide") && $publish.hasClass("hide")){
            $comment.removeClass("hide");
            $publish.removeClass("hide")
        }else {
            $comment.addClass("hide");
            $publish.addClass("hide");
        }
    })
    $(".pl-box-btm").find(".js-add-dp-box").click(function () {
        var $comment = $(this).next("div").find("textarea");
        var $publish = $(this).next("div").find("button");
        if ($comment.hasClass("hide") && $publish.hasClass("hide")){
            $comment.removeClass("hide");
            $publish.removeClass("hide")
        }else {
            $comment.addClass("hide");
            $publish.addClass("hide");
        }
    })
    //发表
    $(".pl-form-wrap").find("button").click(function () {
        var obj = {
            articleId:"${article.id}",
            reviewUserId:"${activeUser.userId}",
            content:$(".pl-form-wrap").find(".form-control").val()
        }
        $.ajax({
            url:"/article/review",
            type:"post",
            data:obj,
            success:function (rs) {
                if(rs.code==200){
                    window.location="${ctx}/article/show?id=${article.id}";
                }
                if(rs.code==404){
                    alert(rs.message);
                }
            }
        })
    })
    //点评评论
    $(".pl-box-btm").find(".js-article-dp").click(function () {
        var obj = {
            reviewId:$(this).parent().parent().prevAll("input:hidden").val(),
            content:$(this).prev("textarea").val(),
            articleId:"${article.id}",
            reviewUserId:"${activeUser.userId}"
        }
        $.ajax({
            url:"/article/remark/on",
            type:"post",
            data:obj,
            success:function (rs) {
                if(rs.code==200){
                    window.location="${ctx}/article/show?id=${article.id}";
                }
                if(rs.code==404){
                    alert(rs.message);
                }
            }
        })
    })
    //点评回复
    $(".pl-box-top").find(".js-article-dp").click(function () {
        var obj = {
            reviewId:$(this).parent().parent().parent().parent().parent().prevAll("input:hidden").val(),
            articleId:"${article.id}",
            reviewUserId:"${activeUser.userId}",
            parentReviewId:$(this).prev("input:hidden").val(),
            content:$(this).prevAll("textarea").val()
        }
        $.ajax({
            url:"/article/remark/on",
            type:"post",
            data:obj,
            success:function (rs) {
                if(rs.code==200){
                    window.location="${ctx}/article/show?id=${article.id}";
                }
                if(rs.code==404){
                    alert(rs.message);
                }
            }
        })
    })
    //评论 好评
    $(".pl-box-btm").find(".js-icon-like").click(function () {
        var obj ={
            reviewId:$(this).parent().parent().parent().prevAll("input:hidden").val(),
            articleId:"${article.id}",
            goodReviewUserId:"${activeUser.userId}"
        }
        $.ajax({
            url:"/article/good/review",
            type:"post",
            data:obj,
            success:function (rs) {
                if(rs.code==200){
                    window.location="${ctx}/article/show?id=${article.id}";
                }
                if(rs.code==404){
                    alert(rs.message);
                }
            }
        })
    })
    //评论 差评
    $(".pl-box-btm").find(".js-no-icon-like").click(function () {
        var obj ={
            reviewId:$(this).parent().parent().parent().prevAll("input:hidden").val(),
            articleId:"${article.id}",
            badReviewUserId:"${activeUser.userId}"
        }
        $.ajax({
            url:"/article/bad/review",
            type:"post",
            data:obj,
            success:function (rs) {
                if(rs.code==200){
                    window.location="${ctx}/article/show?id=${article.id}";
                }
                if(rs.code==404){
                    alert(rs.message);
                }
            }
        })
    })
    $('.m-style').pagination({
        mode: 'fixed',
        pageCount:${pageData.totalPage},
        totalData:${pageData.totalCount},
        showData:${pageData.pageSize},
        current:${pageData.pageNo},
        callback:function (api) {
            window.location="${ctx}/article/show?pageNo="+api.getCurrent()+"&id=${article.id}";
        }
    });
</script>
</body>
</html>
