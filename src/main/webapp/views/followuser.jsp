<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-05-05
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
    <base href="<%=basePath%>">
    <title>关注管理</title>
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
    <!--分页样式-->
    <link rel="stylesheet" href="/css/pagination/pagination.css" />
    <style>
        .user-info{
            overflow: hidden;
            width:170px;
            height: 200px;
            background: #fff;
            position: relative;
            margin: 0 7px 14px;
            padding: 25px 10px 0;
            -webkit-box-shadow: 0 0 3px #f1f1f1;
            -moz-box-shadow: 0 0 3px #f1f1f1;
            box-shadow: 0 0 3px #f1f1f1;
            -webkit-border-radius: 5px;
            -moz-border-radius: 5px;
            border-radius: 5px;
            -webkit-transition: -webkit-box-shadow .3s;
            transition: -webkit-box-shadow .3s;
            -moz-transition: box-shadow .3s,-moz-box-shadow .3s;
            transition: box-shadow .3s;
            transition: box-shadow .3s,-webkit-box-shadow .3s,-moz-box-shadow .3s;
        }
        .user-name{
            line-height: 30px;
            padding-top: 10px;
            padding-bottom: 10px;
            text-align: center;
            font-size: 14px;
            color: #555;
            width: 100%;
            overflow: hidden;
            text-overflow: ellipsis;
            white-space: nowrap;
        }
        .user-follow{
            padding-bottom: 10px;
            height:32px;
        }
    </style>
</head>
<body>
<section id="container">
    <!--header start-->
    <jsp:include page="head.jsp"></jsp:include>
    <!--header end-->
    <!--sidebar start-->
    <jsp:include page="navigation.jsp"></jsp:include>
    <!--sidebar end-->
    <!--main content start-->
    <section id="main-content">
        <section class="wrapper">
            <div class="row">
                <div class="panel-body">
                    <div class="col-md-12 w3ls-graph">
                        <div>
                            <ul class="f-navart">
                                <i class="fa fa-user-plus"></i>
                                <span style="padding-bottom: 10px">
                                    关注管理
                                </span>
                            </ul>
                        </div>
                        <!--<div style="font-size: 15px;padding: 14px 0 55px 0" >
                            <form style="float: left" action="" method="post">
                                <input type="text" style="width: 200px;height: 32px"/>&nbsp;&nbsp;
                                <input name="submit" style="height: 32px" class="btn" type="submit" value="查找">
                            </form>
                        </div>-->
                        <span style="float: right;color: red;margin-right: 50px">${pageData.totalCount}</span><span style="float: right;">当前关注人数：</span>


                        <table id="table1">
                            <tr>
                                <c:forEach items="${pageData.concernList}" var="concern">
                                <td>
                                    <div style="padding: 20px 40px;text-align: center">
                                        <div class="user-info">
                                            <a>
                                                <img src="${concern.userPicture}" style="float-displace:10px;width: 84px;height: 84px;-webkit-border-radius: 50%;-moz-border-radius: 50%;border-radius: 50%;"/>
                                            </a>
                                            <div class="user-name">
                                                ${concern.userName}
                                            </div>
                                            <c:if test="${userRole.role=='user'}">
                                            <div class="user-follow"><!--未取消关注有取消关注按钮，取消关注了则显示已取消关注 -->
                                                <input id="concernedUserId" type="hidden" value="${concern.concernedUserId}">
                                                <input name="submit" class="btn" type="submit" value="${concern.concernType==0?'末关注':(concern.concernType==1?'已关注':'互相关注')}">
                                                <!--<input name="submit" style="height: 32px" class="btn" type="submit" value="已取消关注">-->
                                            </div>
                                            </c:if>
                                        </div>
                                    </div>
                                </td>
                                </c:forEach>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
            <div class="m-style" style="float: right;margin-right:500px"></div>
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
<script type="text/javascript" src="/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="/js/highlight.min.js"></script>
<script type="text/javascript" src="/js/jquery.pagination.js"></script>
<script>
    $('.m-style').pagination({
        mode: 'fixed',
        pageCount:${pageData.totalPage},
        totalData:${pageData.totalCount},
        showData:${pageData.pageSize},
        current:${pageData.pageNo},
        callback:function (api) {
            window.location="${ctx}/concern/list?pageNo="+api.getCurrent();
        }
    });
    
    $(".btn").click(function () {
        var concernedUserId = $(this).prev("input:hidden").val();
        if(confirm("确定取消关注吗？")) {
            $.ajax({
                url: "/concern/cancel",
                type: "post",
                data: "concernedUser="+concernedUserId,
                success: function (rs) {
                    if(rs.code==404){
                        alert(rs.message);
                    }
                    if(rs.code==200){
                        window.location="${ctx}/concern/list?pageNo="+1;
                    }
                }
            });
        }
    });
</script>
</body>
</html>
