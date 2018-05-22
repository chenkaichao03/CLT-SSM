<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>个人主页</title>
    <link rel="shortcut icon" href="images/crplog.ico">
    <link rel="stylesheet" type="text/css" href="css/firstcss/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/firstcss/build1.css">
    <link href="css/firstcss/login.css" rel="stylesheet" type="text/css"/>
    <link href="css/firstcss/zzsc.css" rel="stylesheet" type="text/css"/>
    <link href="css/firstcss/dlzc.css" rel="stylesheet" type="text/css"/>
    <script language="javascript" type="text/javascript" src="js/firstjs/jquery-1.11.1.min.js"></script>
    <script language="javascript" type="text/javascript" src="js/firstjs/main.js"></script>
    <script language="javascript" type="text/javascript" src="js/firstjs/popwin.js"></script>
    <link rel="stylesheet" type="text/css" href="css/firstcss/nanoscroller.css">
    <!--分页样式-->
    <link rel="stylesheet" href="/css/pagination/pagination.css" />
</head>

<body style="background-color:#f0f4fb;">
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
            <a href="#" title="首页"><img style="width: 180px;" src="images/logo.png" alt="创作收益平台" title="创作收益平台" /></a>
        </div>
        <ul class="nav navbar-nav navbar-left" id="jsddm" style="margin-top: 21px;">
            <li class="nav-news" style="margin-left: 117px">
                <p style="font-size:20px;color: red;margin-top: -23px">
                    <strong>Pluralization &nbsp;&nbsp;&nbsp;&nbsp; High Quality &nbsp;&nbsp;&nbsp;&nbsp; Earnings</strong>
                </p>
            </li>
        </ul>
<%--        <ul class="nav navbar-nav navbar-right transition  xiala main_nav">
            <c:if test="${activeUser.isLogin==0 || empty activeUser.isLogin}">
            <li class="login-link-box" ><a class="cd-signin" style="margin-top: 21px;">登录</a></li>
            <li><a class="cd-signup" style="margin-top: 21px;">注册</a></li>
            </c:if>
            <c:if test="${activeUser.isLogin==1}">
            <li><a href="/article/type/list" class="cd-tougao">发表</a></li>
            </c:if>
        </ul>--%>
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
                                <label><input id="autologin" type="checkbox">&nbsp;2周内自动登录</label>
                                <a href="/user/reset_password" class="js-forget-passward pull-right">忘记密码</a>
                            </div>
                            <button class="js-btn-login btn-login">登&nbsp;录</button>
                        </div>
                    </div>
                </div>
            </div>
            <div id="cd-signup"> <!-- 注册表单 -->
                <div class="modal-alert-title" style="text-align: center">注册</div>
                <div class="user-register-box">
                    <div class="login-form sms-box" style="margin-top:52px;">
                        <label class="login-label transition" style="margin-bottom: 15px">
                            <input id="login_username" class="login-input" placeholder="请输入用户名">
                        </label><br/>
                        <label class="login-label">
                            <input id="login_password" class="login-input password" type="password" placeholder="请输入6～15位密码">
                        </label>
                        <button class="js-btn-sms-login btn-login">注&nbsp;册</button>
                    </div>
                    <div class="js-user-login register-text">已有账号，立即登录</div></div>
            </div>
            <a href="#0" class="cd-close-form ">关闭</a>
        </div>
    </div>

    <script src="js/firstjs/d-login.js"></script>

</header>

<div class="placeholder-height"></div>
<div class="container per_center_body" id="per_center">
    <div class="user-info-warp">
        <div class="user-head-box">
            <div class="user-face"><img src="${userInfo.userPicture}"></div>
            <%--<div class="user-name">卷毛<a href="#" target="_blank"></a></div>--%>
            <div class="user-one">
                <span>粉丝：</span>
                <span>${countFansAndConcern.fansCount}</span>
            </div>
            <div class="user-one">
                <span>关注：</span>
                <span>${countFansAndConcern.concernCount}</span>
            </div>
        </div>
        <div class="user-info-box">
            <div class="col-lg-5">
                <div class="user-info"><i class="icon icon-user-point"></i>姓名：${userInfo.realName}</div>
                <div class="user-info"><i class="icon icon-user-point"></i>编码：${userInfo.userNo}</div>
                <div class="user-info"><i class="icon icon-user-point"></i>手机号：${userInfo.userNo}</div>
            </div>
            <div class="col-lg-7">
                <div class="user-info"><i class="icon icon-user-point"></i>个人介绍：${userInfo.userIntroduce}</div>
                <div class="user-info"><i class="icon icon-user-point"></i>地址：${userInfo.userAddress}</div>
                <%--<div class="user-info"><i class="icon icon-user-point"></i>微信公众号：lvkeapp2015</div>--%>
            </div>
 <%--           <div class="btn-box"><a class="js-sea-more-info more-info pull-right">更多<span class="caret"></span></a></div>
            <div class="more-user-info-box">
                <div class="col-lg-5">
                    <div class="more-user-info"><i class="icon icon-user-point"></i>真实姓名：保密</div>
                    <div class="more-user-info"><i class="icon icon-user-point"></i>手机：保密</div>
                </div>
                <div class="col-lg-7">
                    <div class="more-user-info"><i class="icon icon-user-point"></i>性别：男</div>
                    <div class="more-user-info"><i class="icon icon-user-point"></i>所在地址：保密</div>
                </div>
                <div style="clear:both; width:100%;">
                    <div class="more-user-info"><i class="icon icon-user-point"></i>注册时间：2015-06-29</div>
                </div>
                <div style="width:100%;">
                    <div class="more-user-info" style="padding-left:75px;"><span>认证星级：<i class="i-icon2 icon2-stars03"></i></span></div>
                </div>
            </div>--%>
        </div>
    </div>
    <div id="menu" name="menu"></div>
    <div class="user-menu-warp">
        <div class="menu-warp">
            <ul id=myTabs1>
                <li class="active" onMouseDown=Tabs1(this,0);><a href="javascript:void(this)">TA的文章</a></li>
                <li class="" onMouseDown=Tabs1(this,1);><a href="javascript:void(this)">TA的评论</a></li>
<%--                <li class="" onMouseDown=Tabs1(this,2);><a href="javascript:void(this)">TA的收藏</a></li>
                <li class="" onMouseDown=Tabs1(this,3);><a href="javascript:void(this)">TA的关注</a></li>
                <li class="" onMouseDown=Tabs1(this,4);><a href="javascript:void(this)">TA的项目</a></li>--%>
            </ul>
        </div>
        <div class="user-content-warp" id=myTabs1_Content0>
            <div class="message-box" >
                <c:forEach var="article" items="${pageData.articleList}">
                <div class="mod-b mod-art ">
                    <a class="transition" href="${ctx}/article/show?id=${article.id}" target="_blank">
                        <div class="mod-thumb"><img class="lazy" src="${ctx}/article/show?id=${article.id}" alt="${article.articleTitle}" style="display: inline;"></div>
                    </a>
                    <div class="mob-ctt">
                        <h3><a href="${ctx}/article/show?id=${article.id}" class="transition" target="_blank">${article.articleTitle}</a></h3>
                        <div class="mob-author"><span class="time">${article.createTimeStr}</span></div>
                    </div>
                </div>
                </c:forEach>
            </div>
        </div>
        <div class="user-content-warp" style="display:none" id=myTabs1_Content1>
            <ul class='nav-box' id=myTabs2>
                <li class="active" onMouseDown=Tabs2(this,0);><a href="javascript:void(this)">评论（${reviewPageData.totalCount}）</a></li>
                <li class="" onMouseDown=Tabs2(this,1)><a href="javascript:void(this)">点评（${reviewDetailPageData.totalCount}）</a></li>
            </ul>
            <div class="message-box" id=myTabs2_Content0>
                <ul>
                    <c:forEach var="review" items="${reviewPageData.reviewVOList}">
                    <li type="comment" >
                        <div class="message-title"><a href="${ctx}/article/show?id=${review.articleId}" target="_blank">${review.content}</a></div>
                        <div class="message-time">${review.createTimeStr}<span class="message-article">来自文章：<a href="${ctx}/article/show?id=${review.articleId}" target="_blank">${review.articleTitle}</a></span></div>
                    </li>
                    </c:forEach>
                </ul>
            </div>
            <div class="message-box" style="display:none" id=myTabs2_Content1>
                <ul>
                    <c:forEach var="reviewDetail" items="${reviewDetailPageData.reviewDetalVOS}">
                    <li type="recomment">
                        <blockquote>${reviewDetail.reviewContent}</blockquote>
                        <div class="message-title"><span class="me-dp">TA的点评：</span><a href="${ctx}/article/show?id=${reviewDetail.articleId}" target="_blank">${reviewDetail.content}</a></div>
                        <div class="message-time">${reviewDetail.createTimeStr}<span class="message-article">来自文章：<a href="${ctx}/article/show?id=${reviewDetail.articleId}" target="_blank">${reviewDetail.articleTitle}</a></span></div>
                    </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
<%--        <div class="user-content-warp" style="display:none" id=myTabs1_Content2>
            <div class="collect-box" data-cid="129416"><span class="collect-title">我的默认收藏夹</span></div>
        </div>
        <div class="user-content-warp" style="display:none" id=myTabs1_Content3>
            <div class="topic-message-wrap">
                <div class="no-content-prompt">TA还没有关注</div>
            </div>
        </div>
        <div class="user-content-warp" style="display:none" id=myTabs1_Content4>
            <div class="product-html-box">
                <div class="message-box">
                    <ul>
                        <li type="article">
                            <div class="cy-mod-thumb">
                                <a class="transition" href="#" target="_blank"><img class="lazy" src="images/1461314509617354.png" alt="旅客"></a>
                            </div>
                            <div class="cy-mob-ctt">
                                <div class="cp-name"><a href="#" class="transition" target="_blank">旅客</a></div>
                                <div class="cp-time"> 提交时间：2016-04-22</div>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>--%>
        <div class="m-style" style="float: right;margin-right:350px"></div>
    </div>
</div>
<footer class="footer">
    <div class="modal-backdrop fade in js-modal-backdrop"></div>
    <div class="container copy-right" align="center">
        <span>Copyright © <a href="views/show.jsp">创作收益平台 chenliting</a>
        </span>
    </div>

</footer>
<script language="javascript" type="text/javascript" src="js/firstjs/jquery-1.11.1.min.js"></script>
<script>
    $(document).ready(function() {
        $(".more-user-info-box").fadeOut(0);
        $(".btn-box").click(function() {
            $(".more-user-info-box").not($(this).next()).slideUp('fast');
            $(this).next().slideToggle(400);
        });
    });
</script>
<script type="text/javascript" src="js/firstjs/mouse.js"></script>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="/js/highlight.min.js"></script>
<script type="text/javascript" src="/js/jquery.pagination.js"></script>
<script type="text/javascript">
    $('.m-style').pagination({
        mode: 'fixed',
        pageCount:${pageData.totalPage},
        totalData:${pageData.totalCount},
        showData:${pageData.pageSize},
        current:${pageData.pageNo},
        callback:function (api) {
            window.location="${ctx}/individual/init/center?pageNo="+api.getCurrent()+"&userId=${userInfo.userId}";
        }
    });
</script>
</body>
</html>
