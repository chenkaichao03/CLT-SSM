<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>文章</title>
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
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/global.js"></script>
    <script type="text/javascript" src="js/jquery.autoTextarea.js"></script>
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
            <div class="panel-body">
                <div class="col-md-12 w3ls-graph">
                    <div>
                        <ul class="f-navart">
                            <i class="fa fa-edit"></i>
                            <span>发表文章</span>
                        </ul>
                    </div>
                    <form name="form1" action="/article/add" method="post" enctype="multipart/form-data">
                        <table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic">
                            <c:if test="${not empty article.id}">
                            <tr>
                                <input type="hidden" name="id" value="${article.id}">
                            </tr>
                            </c:if>
                            <tr>
                                <td width="90" align="right">文章名称</td>
                                <td>
                                    <label>
                                        <input type="text" name="articleTitle" value="${article.articleTitle}" size="80" class="inpMain" />
                                    </label>
                                </td>
                            </tr>
                            <tr>
                                <td align="right">文章分类</td>
                                <td>
                                    <select name="articleTypeId">
                                        <option value="" selected="selected">--未分类--</option>
                                        <c:forEach var="articleType" items="${articleTypeList}">
                                            <option value="${articleType.id}"<c:out value="${article.articleTypeId==articleType.id?'selected=selected':''}"></c:out>>${articleType.articleTypeName}</option>
                                        </c:forEach>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" valign="top">文章描述</td>
                                <td>
                                    <!-- KindEditor -->
                                    <link rel="stylesheet" href="js/kindeditor/themes/default/default.css" />
                                    <link rel="stylesheet" href="js/kindeditor/plugins/code/prettify.css" />
                                    <script charset="utf-8" src="js/kindeditor/kindeditor.js"></script>
                                    <script charset="utf-8" src="js/kindeditor/lang/zh_CN.js"></script>
                                    <script charset="utf-8" src="js/kindeditor/plugins/code/prettify.js"></script>
                                    <script>
                                        KindEditor.ready(function(K) {
                                            var editor1 = K.create('textarea[name="articleContent"]', {
                                                cssPath : '../plugins/code/prettify.css',
                                                uploadJson : '../jsp/upload_json.jsp',
                                                fileManagerJson : '../jsp/file_manager_json.jsp',
                                                uploadJson : '../views/article.jsp',
                                                fileManagerJson : '../views/article.jsp',
                                                allowFileManager : true,
                                                afterCreate : function() {
                                                    var self = this;
                                                    K.ctrl(document, 13, function() {
                                                        self.sync();
                                                        K('form[name=example]')[0].submit();
                                                    });
                                                    K.ctrl(self.edit.doc, 13, function() {
                                                        self.sync();
                                                        K('form[name=example]')[0].submit();
                                                    });
                                                }
                                            });
                                            prettyPrint();
                                        });
                                    </script>
                                    <!-- /KindEditor -->
                                    <textarea id="content"  name="articleContent" style="width:780px;height:400px;" class="textArea">${article.articleContent}</textarea>
                                </td>
                            </tr>
                            <tr>
                                <td align="right">上传图片</td>
                                <td>
                                    <input type="file" name="articleFile" size="38" class="inpFlie" />
                                </td>>
                            </tr>
                            <tr>
                                <td></td>
                                <td>
                                    <input name="submit" class="btn" type="submit" value="发表" />
                                </td>
                            </tr>
                        </table>
                    </form>
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
