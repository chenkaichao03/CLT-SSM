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
    <link rel="stylesheet" type="text/css" href="css/firstcss/build1.css">
    <link href="css/firstcss/login.css" rel="stylesheet" type="text/css"/>
    <link href="css/firstcss/zzsc.css" rel="stylesheet" type="text/css"/>
    <link href="css/firstcss/dlzc.css" rel="stylesheet" type="text/css"/>
    <script language="javascript" type="text/javascript" src="js/firstjs/jquery-1.11.1.min.js"></script>
    <script language="javascript" type="text/javascript" src="js/firstjs/main.js"></script>
    <script language="javascript" type="text/javascript" src="js/firstjs/popwin.js"></script>
    <link rel="stylesheet" type="text/css" href="css/firstcss/nanoscroller.css">
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
        <ul class="nav navbar-nav navbar-right transition  xiala main_nav">

            <li class="search-li js-show-search-box"><a><i class="icon icon-search "></i></a><span>搜索</span></li>
            <li class="login-link-box" ><a class="cd-signin" style="margin-top: 21px;">登录</a></li>
            <li><a class="cd-signup" style="margin-top: 21px;">注册</a></li>
            <li><a href="views/home.jsp" class="cd-tougao">发表</a></li>
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
            <div class="user-face"><img src="images/NewModel/58_avatar_big.jpg"></div>
            <div class="user-name">卷毛<a href="#" target="_blank"></a></div>
            <div class="user-one">
                <span>粉丝：</span>
                <span>100</span>
            </div>
            <div class="user-one">
                <span>关注：</span>
                <span>105</span>
            </div>
        </div>
        <div class="user-info-box">
            <div class="col-lg-5">
                <div class="user-info"><i class="icon icon-user-point"></i>所在地：福建泉州</div>
                <div class="user-info"><i class="icon icon-user-point"></i>职业：产品个体户</div>
                <div class="user-info"><i class="icon icon-user-point"></i>邮箱：保密</div>
            </div>
            <div class="col-lg-7">
                <div class="user-info"><i class="icon icon-user-point"></i>微博：http://weibo.com/alexli2011</div>
                <div class="user-info"><i class="icon icon-user-point"></i>微信：17276694</div>
                <div class="user-info"><i class="icon icon-user-point"></i>微信公众号：lvkeapp2015</div>
            </div>
            <div class="btn-box"><a class="js-sea-more-info more-info pull-right">更多<span class="caret"></span></a></div>
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
            </div>
        </div>
    </div>
    <div id="menu" name="menu"></div>
    <div class="user-menu-warp">
        <div class="menu-warp">
            <ul id=myTabs1>
                <li class="active" onMouseDown=Tabs1(this,0);><a href="javascript:void(this)">TA的文章</a></li>
                <li class="" onMouseDown=Tabs1(this,1);><a href="javascript:void(this)">TA的评论</a></li>
                <li class="" onMouseDown=Tabs1(this,2);><a href="javascript:void(this)">TA的收藏</a></li>
                <li class="" onMouseDown=Tabs1(this,3);><a href="javascript:void(this)">TA的关注</a></li>
                <li class="" onMouseDown=Tabs1(this,4);><a href="javascript:void(this)">TA的项目</a></li>
            </ul>
        </div>
        <div class="user-content-warp" id=myTabs1_Content0>
            <div class="message-box" >
                <div class="mod-b mod-art ">
                    <a class="transition" href="/article/197460.html?f=member_article" target="_blank">
                        <div class="mod-thumb"><img class="lazy" src="images/NewModel/ad1.jpg" alt="闪送、小罐茶：将单一元素推向极致的创业给我们什么启发？" style="display: inline;"></div>
                    </a>
                    <div class="mob-ctt">
                        <h3><a href="/article/197460.html?f=member_article" class="transition" target="_blank">1闪送、小罐茶：将单一元素推向极致的创业给我们什么启发？</a></h3>
                        <div class="mob-author"><span class="time">6天前</span></div>
                        <div class="mob-sub">就问你怕不怕</div>
                    </div>
                </div>
                <div class="mod-b mod-art ">
                    <a class="transition" href="/article/197348.html?f=member_article" target="_blank">
                        <div class="mod-thumb"><img class="lazy" src="images/NewModel/ad1.jpg" alt="冷眼看快手、陌陌们的“短视频社交”" style="display: inline;"></div>
                    </a>
                    <div class="mob-ctt">
                        <h3><a href="/article/197348.html?f=member_article" class="transition" target="_blank">2冷眼看快手、陌陌们的"短视频社交"</a></h3>
                        <div class="mob-author"><span class="time">2017-05-28</span></div>
                        <div class="mob-sub">短视频天然离社交远一点。</div>
                    </div>
                </div>
                <div class="mod-b mod-art ">
                    <a class="transition" href="/article/197348.html?f=member_article" target="_blank">
                        <div class="mod-thumb"><img class="lazy" src="images/NewModel/ad1.jpg" alt="冷眼看快手、陌陌们的“短视频社交”" style="display: inline;"></div>
                    </a>
                    <div class="mob-ctt">
                        <h3><a href="/article/197348.html?f=member_article" class="transition" target="_blank">3冷眼看快手、陌陌们的"短视频社交"</a></h3>
                        <div class="mob-author"><span class="time">2017-05-28</span></div>
                        <div class="mob-sub">短视频天然离社交远一点。</div>
                    </div>
                </div>
                <div class="mod-b mod-art ">
                    <a class="transition" href="/article/197348.html?f=member_article" target="_blank">
                        <div class="mod-thumb"><img class="lazy" src="images/NewModel/ad1.jpg" alt="冷眼看快手、陌陌们的“短视频社交”" style="display: inline;"></div>
                    </a>
                    <div class="mob-ctt">
                        <h3><a href="/article/197348.html?f=member_article" class="transition" target="_blank">4冷眼看快手、陌陌们的"短视频社交"</a></h3>
                        <div class="mob-author"><span class="time">2017-05-28</span></div>
                        <div class="mob-sub">短视频天然离社交远一点。</div>
                    </div>
                </div>
                <div class="mod-b mod-art ">
                    <a class="transition" href="/article/197348.html?f=member_article" target="_blank">
                        <div class="mod-thumb"><img class="lazy" src="images/NewModel/ad1.jpg" alt="冷眼看快手、陌陌们的“短视频社交”" style="display: inline;"></div>
                    </a>
                    <div class="mob-ctt">
                        <h3><a href="/article/197348.html?f=member_article" class="transition" target="_blank">5冷眼看快手、陌陌们的"短视频社交"</a></h3>
                        <div class="mob-author"><span class="time">2017-05-28</span></div>
                        <div class="mob-sub">短视频天然离社交远一点。</div>
                    </div>
                </div>
                <div class="mod-b mod-art ">
                    <a class="transition" href="/article/197348.html?f=member_article" target="_blank">
                        <div class="mod-thumb"><img class="lazy" src="images/NewModel/ad1.jpg" alt="冷眼看快手、陌陌们的“短视频社交”" style="display: inline;"></div>
                    </a>
                    <div class="mob-ctt">
                        <h3><a href="/article/197348.html?f=member_article" class="transition" target="_blank">6冷眼看快手、陌陌们的"短视频社交"</a></h3>
                        <div class="mob-author"><span class="time">2017-05-28</span></div>
                        <div class="mob-sub">短视频天然离社交远一点。</div>
                    </div>
                </div>
                <div class="mod-b mod-art " >
                    <a class="transition" href="/article/197348.html?f=member_article" target="_blank">
                        <div class="mod-thumb"><img class="lazy" src="images/NewModel/ad1.jpg" alt="冷眼看快手、陌陌们的“短视频社交”" style="display: inline;"></div>
                    </a>
                    <div class="mob-ctt">
                        <h3><a href="/article/197348.html?f=member_article" class="transition" target="_blank">7冷眼看快手、陌陌们的"短视频社交"</a></h3>
                        <div class="mob-author"><span class="time">2017-05-28</span></div>
                        <div class="mob-sub">短视频天然离社交远一点。</div>
                    </div>
                </div>
                <div class="mod-b mod-art " >
                    <a class="transition" href="/article/197348.html?f=member_article" target="_blank">
                        <div class="mod-thumb"><img class="lazy" src="images/NewModel/ad1.jpg" alt="冷眼看快手、陌陌们的“短视频社交”" style="display: inline;"></div>
                    </a>
                    <div class="mob-ctt">
                        <h3><a href="/article/197348.html?f=member_article" class="transition" target="_blank">8冷眼看快手、陌陌们的"短视频社交"</a></h3>
                        <div class="mob-author"><span class="time">2017-05-28</span></div>
                        <div class="mob-sub">短视频天然离社交远一点。</div>
                    </div>
                </div>
                <div class="mod-b mod-art ">
                    <a class="transition" href="/article/197348.html?f=member_article" target="_blank">
                        <div class="mod-thumb"><img class="lazy" src="images/NewModel/ad1.jpg" alt="冷眼看快手、陌陌们的“短视频社交”" style="display: inline;"></div>
                    </a>
                    <div class="mob-ctt">
                        <h3><a href="/article/197348.html?f=member_article" class="transition" target="_blank">9冷眼看快手、陌陌们的"短视频社交"</a></h3>
                        <div class="mob-author"><span class="time">2017-05-28</span></div>
                        <div class="mob-sub">短视频天然离社交远一点。</div>
                    </div>
                </div>
                <div class="mod-b mod-art ">
                    <a class="transition" href="/article/197348.html?f=member_article" target="_blank">
                        <div class="mod-thumb"><img class="lazy" src="images/NewModel/ad1.jpg" alt="冷眼看快手、陌陌们的“短视频社交”" style="display: inline;"></div>
                    </a>
                    <div class="mob-ctt">
                        <h3><a href="/article/197348.html?f=member_article" class="transition" target="_blank">10冷眼看快手、陌陌们的"短视频社交"</a></h3>
                        <div class="mob-author"><span class="time">2017-05-28</span></div>
                        <div class="mob-sub">短视频天然离社交远一点。</div>
                    </div>
                </div>
                <nav class="page-nav">
                    <ul class="pagination">
                        <li class="disabled"><a href="#" aria-label="First"><span aria-hidden="true"><i class="icon icon-first"></i></span></a></li>
                        <li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true"><i class="icon icon-lt"></i></span></a></li>
                        <li class="active"><a>1</a></li>
                        <li><a href="">2</a></li>
                        <li><a href="">3</a></li>
                        <li><a href="">4</a></li>
                        <li><a href=""><i class="icon icon-gt"></i></a></li>
                        <li><a href=""><i class="icon icon-last"></i></a></li>
                    </ul>
                </nav>
            </div>
        </div>
        <div class="user-content-warp" style="display:none" id=myTabs1_Content1>
            <ul class='nav-box' id=myTabs2>
                <li class="active" onMouseDown=Tabs2(this,0);><a href="#">评论（115）</a></li>
                <li class="" onMouseDown=Tabs2(this,1)><a href="#">点评（540）</a></li>
            </ul>
            <div class="message-box" id=myTabs2_Content0>
                <ul>
                    <li type="comment" >
                        <div class="message-title"><a href="#" target="_blank">1直播甚至短视频的最大隐患在于，主流用户的消费习惯尚未形成，一旦受限于用户规模增长停滞，则高流失率带来的后果可想而知</a></div>
                        <div class="message-time">1天前<span class="message-article">来自文章：<a href="#" target="_blank">资本的局，直播的病，斗鱼映客们扎堆融资背后的心思与隐忧</a></span></div>
                    </li>
                    <li type="comment" >
                        <div class="message-title"><a href="#" target="_blank">直播甚至短视频的最大隐患在于，主流用户的消费习惯尚未形成，一旦受限于用户规模增长停滞，则高流失率带来的后果可想而知</a></div>
                        <div class="message-time">1天前<span class="message-article">来自文章：<a href="#" target="_blank">资本的局，直播的病，斗鱼映客们扎堆融资背后的心思与隐忧</a></span></div>
                    </li>
                    <li type="comment" >
                        <div class="message-title"><a href="#" target="_blank">直播甚至短视频的最大隐患在于，主流用户的消费习惯尚未形成，一旦受限于用户规模增长停滞，则高流失率带来的后果可想而知</a></div>
                        <div class="message-time">1天前<span class="message-article">来自文章：<a href="#" target="_blank">资本的局，直播的病，斗鱼映客们扎堆融资背后的心思与隐忧</a></span></div>
                    </li>
                    <li type="comment" >
                        <div class="message-title"><a href="#" target="_blank">直播甚至短视频的最大隐患在于，主流用户的消费习惯尚未形成，一旦受限于用户规模增长停滞，则高流失率带来的后果可想而知</a></div>
                        <div class="message-time">1天前<span class="message-article">来自文章：<a href="#" target="_blank">资本的局，直播的病，斗鱼映客们扎堆融资背后的心思与隐忧</a></span></div>
                    </li>
                    <li type="comment" >
                        <div class="message-title"><a href="#" target="_blank">直播甚至短视频的最大隐患在于，主流用户的消费习惯尚未形成，一旦受限于用户规模增长停滞，则高流失率带来的后果可想而知</a></div>
                        <div class="message-time">1天前<span class="message-article">来自文章：<a href="#" target="_blank">资本的局，直播的病，斗鱼映客们扎堆融资背后的心思与隐忧</a></span></div>
                    </li>
                    <li type="comment" >
                        <div class="message-title"><a href="#" target="_blank">直播甚至短视频的最大隐患在于，主流用户的消费习惯尚未形成，一旦受限于用户规模增长停滞，则高流失率带来的后果可想而知</a></div>
                        <div class="message-time">1天前<span class="message-article">来自文章：<a href="#" target="_blank">资本的局，直播的病，斗鱼映客们扎堆融资背后的心思与隐忧</a></span></div>
                    </li>
                    <li type="comment" >
                        <div class="message-title"><a href="#" target="_blank">直播甚至短视频的最大隐患在于，主流用户的消费习惯尚未形成，一旦受限于用户规模增长停滞，则高流失率带来的后果可想而知</a></div>
                        <div class="message-time">1天前<span class="message-article">来自文章：<a href="#" target="_blank">资本的局，直播的病，斗鱼映客们扎堆融资背后的心思与隐忧</a></span></div>
                    </li>
                    <li type="comment" >
                        <div class="message-title"><a href="#" target="_blank">直播甚至短视频的最大隐患在于，主流用户的消费习惯尚未形成，一旦受限于用户规模增长停滞，则高流失率带来的后果可想而知</a></div>
                        <div class="message-time">1天前<span class="message-article">来自文章：<a href="#" target="_blank">资本的局，直播的病，斗鱼映客们扎堆融资背后的心思与隐忧</a></span></div>
                    </li>
                    <li type="comment" >
                        <div class="message-title"><a href="#" target="_blank">直播甚至短视频的最大隐患在于，主流用户的消费习惯尚未形成，一旦受限于用户规模增长停滞，则高流失率带来的后果可想而知</a></div>
                        <div class="message-time">1天前<span class="message-article">来自文章：<a href="#" target="_blank">资本的局，直播的病，斗鱼映客们扎堆融资背后的心思与隐忧</a></span></div>
                    </li>
                    <li type="comment" >
                        <div class="message-title"><a href="#" target="_blank">10直播甚至短视频的最大隐患在于，主流用户的消费习惯尚未形成，一旦受限于用户规模增长停滞，则高流失率带来的后果可想而知</a></div>
                        <div class="message-time">1天前<span class="message-article">来自文章：<a href="#" target="_blank">资本的局，直播的病，斗鱼映客们扎堆融资背后的心思与隐忧</a></span></div>
                    </li>
                </ul>
                <nav class="page-nav">
                    <ul class="pagination">
                        <li class="disabled"><a href="#" aria-label="First"><span aria-hidden="true"><i class="icon icon-first"></i></span></a></li>
                        <li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true"><i class="icon icon-lt"></i></span></a></li>
                        <li class="active"><a>1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#"><i class="icon icon-gt"></i></a></li>
                        <li><a href="#"><i class="icon icon-last"></i></a></li>
                    </ul>
                </nav>
            </div>
            <div class="message-box" style="display:none" id=myTabs2_Content1>
                <ul>
                    <li type="recomment">
                        <blockquote>1社交国内产品真能成大气候，月活过三亿的，我估计最终会有四个，微信、QQ、微博、……。过一亿在垂直领域有大成就的，也会有四个左右［不算过三亿］，陌陌、快手基本上会是，还有二个位置</blockquote>
                        <div class="message-title"><span class="me-dp">TA的点评：</span><a href="#" target="_blank">微博是social media，快手是video community，严格讲不算社交产品</a></div>
                        <div class="message-time">2017-05-29<span class="message-article">来自文章：<a href="/article/197348.html" target="_blank">冷眼看快手、陌陌们的"短视频社交"</a></span></div>
                    </li>
                    <li type="recomment">
                        <blockquote>1社交国内产品真能成大气候，月活过三亿的，我估计最终会有四个，微信、QQ、微博、……。过一亿在垂直领域有大成就的，也会有四个左右［不算过三亿］，陌陌、快手基本上会是，还有二个位置</blockquote>
                        <div class="message-title"><span class="me-dp">TA的点评：</span><a href="#" target="_blank">微博是social media，快手是video community，严格讲不算社交产品</a></div>
                        <div class="message-time">2017-05-29<span class="message-article">来自文章：<a href="/article/197348.html" target="_blank">冷眼看快手、陌陌们的"短视频社交"</a></span></div>
                    </li>
                    <li type="recomment">
                        <blockquote>1社交国内产品真能成大气候，月活过三亿的，我估计最终会有四个，微信、QQ、微博、……。过一亿在垂直领域有大成就的，也会有四个左右［不算过三亿］，陌陌、快手基本上会是，还有二个位置</blockquote>
                        <div class="message-title"><span class="me-dp">TA的点评：</span><a href="#" target="_blank">微博是social media，快手是video community，严格讲不算社交产品</a></div>
                        <div class="message-time">2017-05-29<span class="message-article">来自文章：<a href="/article/197348.html" target="_blank">冷眼看快手、陌陌们的"短视频社交"</a></span></div>
                    </li>
                    <li type="recomment">
                        <blockquote>1社交国内产品真能成大气候，月活过三亿的，我估计最终会有四个，微信、QQ、微博、……。过一亿在垂直领域有大成就的，也会有四个左右［不算过三亿］，陌陌、快手基本上会是，还有二个位置</blockquote>
                        <div class="message-title"><span class="me-dp">TA的点评：</span><a href="#" target="_blank">微博是social media，快手是video community，严格讲不算社交产品</a></div>
                        <div class="message-time">2017-05-29<span class="message-article">来自文章：<a href="/article/197348.html" target="_blank">冷眼看快手、陌陌们的"短视频社交"</a></span></div>
                    </li>
                    <li type="recomment">
                        <blockquote>1社交国内产品真能成大气候，月活过三亿的，我估计最终会有四个，微信、QQ、微博、……。过一亿在垂直领域有大成就的，也会有四个左右［不算过三亿］，陌陌、快手基本上会是，还有二个位置</blockquote>
                        <div class="message-title"><span class="me-dp">TA的点评：</span><a href="#" target="_blank">微博是social media，快手是video community，严格讲不算社交产品</a></div>
                        <div class="message-time">2017-05-29<span class="message-article">来自文章：<a href="/article/197348.html" target="_blank">冷眼看快手、陌陌们的"短视频社交"</a></span></div>
                    </li>
                    <li type="recomment">
                        <blockquote>1社交国内产品真能成大气候，月活过三亿的，我估计最终会有四个，微信、QQ、微博、……。过一亿在垂直领域有大成就的，也会有四个左右［不算过三亿］，陌陌、快手基本上会是，还有二个位置</blockquote>
                        <div class="message-title"><span class="me-dp">TA的点评：</span><a href="#" target="_blank">微博是social media，快手是video community，严格讲不算社交产品</a></div>
                        <div class="message-time">2017-05-29<span class="message-article">来自文章：<a href="/article/197348.html" target="_blank">冷眼看快手、陌陌们的"短视频社交"</a></span></div>
                    </li>
                    <li type="recomment">
                        <blockquote>1社交国内产品真能成大气候，月活过三亿的，我估计最终会有四个，微信、QQ、微博、……。过一亿在垂直领域有大成就的，也会有四个左右［不算过三亿］，陌陌、快手基本上会是，还有二个位置</blockquote>
                        <div class="message-title"><span class="me-dp">TA的点评：</span><a href="#" target="_blank">微博是social media，快手是video community，严格讲不算社交产品</a></div>
                        <div class="message-time">2017-05-29<span class="message-article">来自文章：<a href="/article/197348.html" target="_blank">冷眼看快手、陌陌们的"短视频社交"</a></span></div>
                    </li>
                    <li type="recomment">
                        <blockquote>1社交国内产品真能成大气候，月活过三亿的，我估计最终会有四个，微信、QQ、微博、……。过一亿在垂直领域有大成就的，也会有四个左右［不算过三亿］，陌陌、快手基本上会是，还有二个位置</blockquote>
                        <div class="message-title"><span class="me-dp">TA的点评：</span><a href="#" target="_blank">微博是social media，快手是video community，严格讲不算社交产品</a></div>
                        <div class="message-time">2017-05-29<span class="message-article">来自文章：<a href="/article/197348.html" target="_blank">冷眼看快手、陌陌们的"短视频社交"</a></span></div>
                    </li>
                    <li type="recomment">
                        <blockquote>1社交国内产品真能成大气候，月活过三亿的，我估计最终会有四个，微信、QQ、微博、……。过一亿在垂直领域有大成就的，也会有四个左右［不算过三亿］，陌陌、快手基本上会是，还有二个位置</blockquote>
                        <div class="message-title"><span class="me-dp">TA的点评：</span><a href="#" target="_blank">微博是social media，快手是video community，严格讲不算社交产品</a></div>
                        <div class="message-time">2017-05-29<span class="message-article">来自文章：<a href="/article/197348.html" target="_blank">冷眼看快手、陌陌们的"短视频社交"</a></span></div>
                    </li>
                    <li type="recomment">
                        <blockquote>10社交国内产品真能成大气候，月活过三亿的，我估计最终会有四个，微信、QQ、微博、……。过一亿在垂直领域有大成就的，也会有四个左右［不算过三亿］，陌陌、快手基本上会是，还有二个位置</blockquote>
                        <div class="message-title"><span class="me-dp">TA的点评：</span><a href="#" target="_blank">微博是social media，快手是video community，严格讲不算社交产品</a></div>
                        <div class="message-time">2017-05-29<span class="message-article">来自文章：<a href="/article/197348.html" target="_blank">冷眼看快手、陌陌们的"短视频社交"</a></span></div>
                    </li>
                </ul>
                <nav class="page-nav">
                    <ul class="pagination">
                        <li class="disabled"><a href="#" aria-label="First"><span aria-hidden="true"><i class="icon icon-first"></i></span></a></li>
                        <li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true"><i class="icon icon-lt"></i></span></a></li>
                        <li class="active"><a>1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#"><i class="icon icon-gt"></i></a></li>
                        <li><a href="#"><i class="icon icon-last"></i></a></li>
                    </ul>
                </nav>
            </div>
        </div>
        <div class="user-content-warp" style="display:none" id=myTabs1_Content2>
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
        </div>
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

</body>
</html>
