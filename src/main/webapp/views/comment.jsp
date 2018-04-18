<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>评论管理</title>
    <link rel="shortcut icon" href="images/crplog.ico">
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- bootstrap-css -->
    <link rel="stylesheet" href="css/bootstrap.min.css" >
    <!-- //bootstrap-css -->
    <!-- Custom CSS -->
    <link href="css/style.css" rel='stylesheet' type='text/css' />
    <link href="css/style-responsive.css" rel="stylesheet"/>
    <!-- font-awesome icons -->
    <link rel="stylesheet" href="css/font.css" type="text/css"/>
    <link href="css/font-awesome.css" rel="stylesheet">
    <link rel="stylesheet" href="css/morris.css" type="text/css"/>
    <!-- calendar -->
    <link rel="stylesheet" href="css/monthly.css">
    <!-- //calendar -->
    <!-- //font-awesome icons -->
    <script src="js/jquery2.0.3.min.js"></script>
    <script src="js/raphael-min.js"></script>
    <script src="js/morris.js"></script>
    <link rel="stylesheet" href="css/gonggao.css">
    <link href="css/public.css" rel="stylesheet" type="text/css">
</head>
<body>
<section id="container">
    <!--header start-->
    <header class="header fixed-top clearfix">
        <!--logo start-->
        <div class="brand">
            <a href="views/home.jsp" class="logo">
                &nbsp;&nbsp;&nbsp;&nbsp;CRP
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
                        <img alt="" src="images/2.png">
                        <span class="username">${username}</span>
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu extended logout">
                        <li><a href="views/userinfo.jsp"><i class=" fa fa-user"></i>账号信息</a></li>
                        <li><a href="views/usersetting.jsp"><i class="fa fa-cog"></i>账号设置</a></li>
                        <li><a href="views/login.jsp"><i class="fa fa-power-off"></i>退出登录</a></li>
                    </ul>
                </li>
                <!-- user login dropdown end -->

            </ul>
            <!--search & user info end-->
        </div>
    </header>
    <!--header end-->
    <!--sidebar start-->
    <aside>
        <div id="sidebar" class="nav-collapse">
            <!-- sidebar menu start-->
            <div class="leftside-navigation">
                <ul class="sidebar-menu" id="nav-accordion">
                    <li>
                        <a href="views/home.jsp">
                            <i class="fa fa-home"></i>
                            <span>主页</span>
                        </a>
                    </li>

                    <li class="sub-menu">
                        <a href="javascript:;">
                            <i class="fa fa-pencil"></i>
                            <span>发表</span>
                        </a>
                        <ul class="sub">
                            <li class="sub-menu">
                                <a href="views/video.jsp">
                                    <i class="fa fa-video-camera"></i>
                                    <span>视频</span>
                                </a>
                                <ul class="sub">
                                    <li><a href="views/video.jsp">发表视频</a></li>
                                    <li><a href="views/vediolist.jsp">内容管理</a></li>
                                </ul>
                            </li>
                            <li class="sub-menu">
                                <a href="views/article.jsp">
                                    <i class="fa fa-book"></i>
                                    <span>文章</span>
                                </a>
                                <ul class="sub">
                                    <li><a href="views/article.jsp">发表文章</a></li>
                                    <li><a href="views/articlelist.jsp">内容管理</a></li>
                                </ul>
                            </li>
                            <!--<li><a href="views/video.jsp">视频</a></li>
                            <li><a href="views/article.jsp">文章</a></li>
                            <li><a href="views/atlas.jsp">图集</a></li>-->
                        </ul>
                    </li>
                    <li>
                        <a href="views/notice.jsp">
                            <i class="fa fa-envelope"></i>
                            <span>通知</span>
                        </a>
                    </li>
                    <li class="sub-menu">
                        <a class="active" href="views/comment.jsp">
                            <i class="fa fa-comments"></i>
                            <span>评论管理</span>
                        </a>
                    </li>
                    <li class="sub-menu">
                        <a href="javascript:;">
                            <i class="fa fa-users"></i>
                            <span>粉丝管理</span>
                        </a>
                        <ul class="sub">
                            <li><a href="views/face.jsp">粉丝概况</a></li>
                            <li><a href="views/face.jsp">粉丝画像</a></li>
                            <li><a href="views/face.jsp">粉丝列表</a></li>
                        </ul>
                    </li>
                    <li class="sub-menu">
                        <a href="javascript:;">
                            <i class=" fa fa-bar-chart-o"></i>
                            <span>数据分析</span>
                        </a>
                    </li>
                    <li class="sub-menu">
                        <a href="javascript:;">
                            <i class=" fa fa-yen"></i>
                            <span>收益结算</span>
                        </a>
                        <ul class="sub">
                            <li><a href="views/face.jsp">我的收益</a></li>
                            <li><a href="views/face.jsp">结算中心</a></li>
                        </ul>

                    <li>
                        <a href="views/face.jsp">
                            <i class="fa fa-gift"></i>
                            <span>活动</span>
                        </a>
                    </li>
                </ul>
            </div>
            <!-- sidebar menu end-->
        </div>
    </aside>
    <!--sidebar end-->
    <!--main content start-->
    <section id="main-content">
        <section class="wrapper">
            <div class="row">
                <div class="panel-body">
                    <div class="col-md-12 w3ls-graph">
                        <div>
                            <ul class="f-navart">
                                <i class="fa fa-comments"></i>
                                <span>评论管理</span>
                            </ul>
                        </div>
                        <div class="comment-body">
                            <div class="comment-header" >
                                <i class="fa fa-user"></i>
                                <a class="comment-title" href="">小花</a>
                                <div class="comment-time" style="float: right">
                                    <span>2018-04-18</span>
                                </div>
                            </div>
                            <div>
                                <div class="comment-content">啊哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈</div>
                                <p class="comment-refer">
                                    评论了我："<a href="">要坚持要坚持要坚持！</a>"
                                </p>
                            </div>
                            <div class="comment-action">
                                <div class="comment-aright" align="right">
                                    <i class="fa fa-trash"></i>
                                    <input type="button" class="comment-btn" value="删除" onclick=" "/>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <i class="fa fa-share-alt"></i>
                                    <span>0</span>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <i class="fa fa-thumbs-o-up"></i>
                                    <span>0</span>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <i class="fa fa-comment-o"></i>
                                    <span>0</span>
                                </div>
                            </div>
                        </div>
                        <div class="comment-body">
                            <div class="comment-header" >
                                <i class="fa fa-user"></i>
                                <a class="comment-title" href="">小花</a>
                                <div class="comment-time" style="float: right">
                                    <span>2018-04-18</span>
                                </div>
                            </div>
                            <div>
                                <div class="comment-content">啊哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈</div>
                                <p class="comment-refer">
                                    评论了我："<a href="">要坚持要坚持要坚持！</a>"
                                </p>
                            </div>
                            <div class="comment-action">
                                <div class="comment-aright" align="right">
                                    <i class="fa fa-trash"></i>
                                    <input type="button" class="comment-btn" value="删除" onclick=" "/>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <i class="fa fa-share-alt"></i>
                                    <span>0</span>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <i class="fa fa-thumbs-o-up"></i>
                                    <span>0</span>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <i class="fa fa-comment-o"></i>
                                    <span>0</span>
                                </div>
                            </div>
                        </div>
                        <div class="comment-body">
                            <div class="comment-header" >
                                <i class="fa fa-user"></i>
                                <a class="comment-title" href="">小花</a>
                                <div class="comment-time" style="float: right">
                                    <span>2018-04-18</span>
                                </div>
                            </div>
                            <div>
                                <div class="comment-content">啊哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈</div>
                                <p class="comment-refer">
                                    评论了我："<a href="">要坚持要坚持要坚持！</a>"
                                </p>
                            </div>
                            <div class="comment-action">
                                <div class="comment-aright" align="right">
                                    <i class="fa fa-trash"></i>
                                    <input type="button" class="comment-btn" value="删除" onclick=" "/>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <i class="fa fa-share-alt"></i>
                                    <span>0</span>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <i class="fa fa-thumbs-o-up"></i>
                                    <span>0</span>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <i class="fa fa-comment-o"></i>
                                    <span>0</span>
                                </div>
                            </div>
                        </div>
                        <div class="comment-body">
                            <div class="comment-header" >
                                <i class="fa fa-user"></i>
                                <a class="comment-title" href="">小花</a>
                                <div class="comment-time" style="float: right">
                                    <span>2018-04-18</span>
                                </div>
                            </div>
                            <div>
                                <div class="comment-content">啊哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈</div>
                                <p class="comment-refer">
                                    评论了我："<a href="">要坚持要坚持要坚持！</a>"
                                </p>
                            </div>
                            <div class="comment-action">
                                <div class="comment-aright" align="right">
                                    <i class="fa fa-trash"></i>
                                    <input type="button" class="comment-btn" value="删除" onclick=" "/>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <i class="fa fa-share-alt"></i>
                                    <span>0</span>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <i class="fa fa-thumbs-o-up"></i>
                                    <span>0</span>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <i class="fa fa-comment-o"></i>
                                    <span>0</span>
                                </div>
                            </div>
                        </div>
                        <div class="comment-body">
                            <div class="comment-header" >
                                <i class="fa fa-user"></i>
                                <a class="comment-title" href="">小花</a>
                                <div class="comment-time" style="float: right">
                                    <span>2018-04-18</span>
                                </div>
                            </div>
                            <div>
                                <div class="comment-content">啊哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈</div>
                                <p class="comment-refer">
                                    评论了我："<a href="">要坚持要坚持要坚持！</a>"
                                </p>
                            </div>
                            <div class="comment-action">
                                <div class="comment-aright" align="right">
                                    <i class="fa fa-trash"></i>
                                    <input type="button" class="comment-btn" value="删除" onclick=" "/>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <i class="fa fa-share-alt"></i>
                                    <span>0</span>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <i class="fa fa-thumbs-o-up"></i>
                                    <span>0</span>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <i class="fa fa-comment-o"></i>
                                    <span>0</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

    </section>
    <!--main content end-->
</section>
<script src="js/bootstrap.js"></script>
<script src="js/jquery.dcjqaccordion.2.7.js"></script>
<script src="js/scripts.js"></script>
<script src="js/jquery.slimscroll.js"></script>
<script src="js/jquery.nicescroll.js"></script>
<!--[if lte IE 8]><!--script language="javascript" type="text/javascript" src="js/flot-chart/excanvas.min.js"></script><![endif]-->
<script src="js/jquery.scrollTo.js"></script>
<!-- morris JavaScript -->
<script>
    $(document).ready(function() {
        //BOX BUTTON SHOW AND CLOSE
        jQuery('.small-graph-box').hover(function() {
            jQuery(this).find('.box-button').fadeIn('fast');
        }, function() {
            jQuery(this).find('.box-button').fadeOut('fast');
        });
        jQuery('.small-graph-box .box-close').click(function() {
            jQuery(this).closest('.small-graph-box').fadeOut(200);
            return false;
        });

        //CHARTS
        function gd(year, day, month) {
            return new Date(year, month - 1, day).getTime();
        }

        graphArea2 = Morris.Area({
            element: 'hero-area',
            padding: 10,
            behaveLikeLine: true,
            gridEnabled: false,
            gridLineColor: '#dddddd',
            axes: true,
            resize: true,
            smooth:true,
            pointSize: 0,
            lineWidth: 0,
            fillOpacity:0.85,
            data: [
                {period: '2015 Q1', iphone: 2668, ipad: null, itouch: 2649},
                {period: '2015 Q2', iphone: 15780, ipad: 13799, itouch: 12051},
                {period: '2015 Q3', iphone: 12920, ipad: 10975, itouch: 9910},
                {period: '2015 Q4', iphone: 8770, ipad: 6600, itouch: 6695},
                {period: '2016 Q1', iphone: 10820, ipad: 10924, itouch: 12300},
                {period: '2016 Q2', iphone: 9680, ipad: 9010, itouch: 7891},
                {period: '2016 Q3', iphone: 4830, ipad: 3805, itouch: 1598},
                {period: '2016 Q4', iphone: 15083, ipad: 8977, itouch: 5185},
                {period: '2017 Q1', iphone: 10697, ipad: 4470, itouch: 2038},

            ],
            lineColors:['#eb6f6f','#926383','#eb6f6f'],
            xkey: 'period',
            redraw: true,
            ykeys: ['iphone', 'ipad', 'itouch'],
            labels: ['All Visitors', 'Returning Visitors', 'Unique Visitors'],
            pointSize: 2,
            hideHover: 'auto',
            resize: true
        });


    });
</script>
<!-- calendar -->
<script type="text/javascript" src="js/monthly.js"></script>
<script type="text/javascript">
    $(window).load( function() {

        $('#mycalendar').monthly({
            mode: 'event',

        });

        $('#mycalendar2').monthly({
            mode: 'picker',
            target: '#mytarget',
            setWidth: '250px',
            startHidden: true,
            showTrigger: '#mytarget',
            stylePast: true,
            disablePast: true
        });

        switch(window.location.protocol) {
            case 'http:':
            case 'https:':
                // running on a server, should be good.
                break;
            case 'file:':
                alert('Just a heads-up, events will not work when run locally.');
        }

    });
</script>
<!-- //calendar -->

</body>
</html>