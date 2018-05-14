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
        <input type="button" class="btn" value="发表" name="add" onclick="">
        <a href="" style="float: right;margin-right: 30px">退出</a>
        <ul class="nav navbar-nav navbar-right transition  xiala main_nav">
            <li class="login-link-box" ><a class="cd-signin" style="margin-top: 21px;margin-right: 10px">登录</a></li>
            <li><a class="cd-signup" style="margin-top: 21px;margin-right: 10px">注册</a></li>
            <li class="search-li js-show-search-box">欢迎<span style="height: 30px;margin-right: 5px">ccccccccccc</span></li>
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
<div class="placeholder-height"></div>
<div class="container" id="index">
    <div class="wrap-left pull-left">
        <div class="big-pic-box">
            <div class="big-pic">
                <a href="#" target="_blank" class="transition" title="醒醒吧，腾讯、网易称霸的游戏行业，谁都没机会成为第三">
                    <div class="back-img"><img src="../../images/sy-img/061708387437.jpg"  alt="醒醒吧，腾讯、网易称霸的游戏行业，谁都没机会成为第三"></div>
                    <div class="big-pic-content">
                        <h1 class="t-h1">醒醒吧，腾讯、网易称霸的游戏行业，谁都没机会成为第三</h1>
                    </div>
                </a>
            </div>
            <div class="big2-pic big2-pic-index big2-pic-index-top">
                <a href="#" class="back-img transition" target="_blank" title="嘘！Facebook 正在上海悄悄寻找办公室">
                    <img class="lazy" src="../../images/sy-img/142618969973.jpg" alt="嘘！Facebook 正在上海悄悄寻找办公室">
                </a>
                <a href="#" target="_blank" title="嘘！Facebook 正在上海悄悄寻找办公室">
                    <div class="big2-pic-content">
                        <h2 class="t-h1">嘘！Facebook 正在上海悄悄寻找办公室</h2>
                    </div>
                </a>
            </div>
            <div class="big2-pic big2-pic-index big2-pic-index-bottom">
                <a href="#" class="back-img transition" target="_blank" title="马云在人生最艰难时去了延安，在革命根据地决定建立淘宝">
                    <img class="lazy" src="../../images/sy-img/093433055013.jpg" alt="马云在人生最艰难时去了延安，在革命根据地决定建立淘宝">
                </a>
                <a href="#" target="_blank" 马云在人生最艰难时去了延安，在革命根据地决定建立淘宝>
                    <div class="big2-pic-content">
                        <h2 class="t-h1">马云在人生最艰难时去了延安，在革命根据地决定建立淘宝</h2>
                    </div>
                </a>
            </div>
        </div>
        <div class="mod-info-flow">
            <div class="mod-b mod-art" data-aid="213665">
                <div class="mod-angle">热</div>
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
                <div class="mod-angle">热</div>
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
                <div class="mod-angle">热</div>
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
                <div class="mod-angle">热</div>
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
                <div class="mod-angle">热</div>
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
                <div class="mod-angle">热</div>
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
        </div>
        <div class="get-mod-more js-get-mod-more-list transition" data-cur_page="1" data-last_dateline="1504655833">
            点击加载更多
        </div>
    </div>
    <div class="wrap-right pull-right">
        <div class="right-ad-box"></div>

        <link rel="stylesheet" type="text/css" href="https://static.huxiucdn.com/www/css/moment.css">
        <div id="moment"></div>
        <div class="box-moder moder-project-list">
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
        <div class="box-moder moder-project-list">
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
        <div class="box-moder hot-article">
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

</body>
</html>
