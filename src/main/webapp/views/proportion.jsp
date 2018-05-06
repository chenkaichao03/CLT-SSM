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
    <title>兑换设置</title>
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
    <script type="text/javascript" src="js/spinner/jquery.min.js"></script>
    <script type="text/javascript" src="js/spinner/jquery.Spinner.js"></script>

    <style type="text/css">
        body{background:#f0fdf0;}
        .Spinner{display:block;overflow:hidden;width:300px;}
        #left1{margin:-20px auto 25px 118px;}
        #right1{margin:-50px auto 25px 245px;}
        #left2{margin:-20px auto 25px 118px;}
        #right2{margin:-50px auto 25px 245px;}
        .Spinner .Amount{width:40px;height:25px;padding:4px 5px;line-height:17px;border-width:1px 0;border-style:solid;border-color:#d9d9d9;float:left;text-align:center;color:#565656;outline:0;}
        .Spinner a{display:inline-block;width:25px;height:25px;border:1px solid #d9d9d9;background-color:#f7f7f7;float:left;cursor:pointer;outline:0;}
        .Spinner a i{font-style:normal;background:url(images/BuynBtn.png) no-repeat;display:block;width:9px;height:9px;margin:8px;text-indent:999999%;overflow:hidden;}
        .Spinner .Decrease i{background-position:-9px -9px;}
        .Spinner .Increase i{background-position:-9px -0px;}
        .Spinner .DisDe i{background-position:-0px -9px;}
        .Spinner .DisIn i{background-position:-0px -0px;}

        .btn {
            display: inline-block;
            background-color: #0072C6;
            -moz-border-radius: 2px;
            -webkit-border-radius: 2px;
            border: 0;
            color: #FFF;
            padding: 6px 15px;
            font-weight: bold;
            text-transform: capitalize;
            cursor: pointer;
            -webkit-appearance: none;
            margin:-54px 0 0 40px;
        }

    </style>

    <script type="text/javascript">
        $(function(){
            $("#left1").Spinner({value:0, min:0, len:4, max:1000});
            $("#right1").Spinner({value:0, min:0, len:3, max:100});
            $("#left2").Spinner({value:0, min:0, len:4, max:1000});
            $("#right2").Spinner({value:0, min:0, len:3, max:100});
        });
    </script>
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
                        <div style="font-size:30px;color:#000000;text-transform:uppercase;">
                            <ul class="f-navart">
                                <i class="fa fa-clone"></i>
                                <span style="padding-bottom: 10px">
                                    兑换设置
                                </span>
                            </ul>
                        </div>
                        <div style="margin: 20px 0 0 50px;">
                            <form  name="form1" action="" method="post" enctype="multipart/form-data">
                                <table style="width: 800px;border:10px solid #707682"  cellpadding="0" cellspacing="0" class="">
                                    <tr>
                                        <td><br/><br/>
                                            <div style="margin-left: 170px;">
                                                <span>粉丝数兑换： </span>
                                                <span id="left1" class="Spinner">&nbsp;&nbsp;&nbsp;&nbsp;:</span>
                                                <span id="right1" class="Spinner">&nbsp;&nbsp;&nbsp;&nbsp;</span>
                                                <div style="margin-left: 350px">
                                                    <input name="submit" style="height: 32px" class="btn" type="submit" value="保存">
                                                </div>
                                            </div>
                                            <span style="color: red;margin-left: 326px">（粉丝数 ：金额 ¥）</span>
                                            <br/><br/>
                                            <div style="margin-left: 170px;">
                                                <span>点击量兑换：</span>
                                                <span id="left2" class="Spinner">&nbsp;&nbsp;&nbsp;&nbsp;:</span>
                                                <span id="right2" class="Spinner">&nbsp;&nbsp;&nbsp;&nbsp;</span>
                                                <div style="margin-left: 350px">
                                                    <input name="submit" style="height: 32px" class="btn" type="submit" value="保存">
                                                </div>
                                            </div>
                                            <span style="color: red;margin-left: 326px">（点击量 ：金额 ¥）</span>
                                            <br/><br/><br/>
                                        </td>
                                    </tr>
                                </table>

                            </form>
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
