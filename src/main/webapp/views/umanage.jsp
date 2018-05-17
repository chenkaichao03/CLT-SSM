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
<html>
<head>
    <base href="<%=basePath%>">
    <title>用户管理</title>
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
    <link rel="stylesheet" href="/css/pagination/pagination.css" />
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
                                <i class="fa fa-users"></i>
                                <span style="padding-bottom: 10px">
                                    用户管理
                                </span>
                            </ul>
                        </div>
                        <div style="font-size: 15px;padding: 14px 0 55px 0" >
                            <span style="float: right;color: red;margin-right: 50px">${pageData.totalCount}</span><span style="float: right">当前用户人数：</span>
                        </div>
                        <form name="form1" action="" method="post" enctype="multipart/form-data" style="text-align: center">
                            <table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic">
                                <tr align="center" style="background-color:#7b8894;color: #ffffff;">
                                    <td>序号</td>
                                    <td>用户ID</td>
                                    <td>用户名</td>
                                    <td>手机号</td>
                                    <td>所在地</td>
                                    <td>粉丝数</td>
                                    <td>关注数</td>
                                    <td>操作</td>
                                </tr>
                                <c:forEach items="${pageData.userList}" var="user" varStatus="status">
                                <tr align="center">
                                    <td>${status.index+1+((pageData.pageNo-1)*pageData.pageSize)}</td>
                                    <td>${user.userNo}</td>
                                    <td>${user.userRealName}</td>
                                    <td>${user.userPhone}</td>
                                    <td>${user.userAddress}</td>
                                    <td>${user.totalFans}</td>
                                    <td>${user.totalConcerns}</td>
                                    <td>
                                        <a href="/concern/list?userManageId=${user.concernedUserId}"><input type="button"  class="listbtn" name="button1" value="他的关注"></a>
                                        <a href="/fans/list?userManageId=${user.concernedUserId}"><input type="button"  class="listbtn" name="button2" value="他的粉丝"></a>
                                        <a href=""><input type="button"  class="listbtn" name="button3" value="删除用户"></a>
                                    </td>
                                </tr>
                                </c:forEach>
                            </table>
                        </form>
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
            window.location="${ctx}/user/manage/list?pageNo="+api.getCurrent();
        }
    });
</script>
</body>
</html>
