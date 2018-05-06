<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/25
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>navigation</title>
</head>
<body>
<aside>
    <div id="sidebar" class="nav-collapse">
        <!-- sidebar menu start-->
        <div class="leftside-navigation">
            <ul class="sidebar-menu" id="nav-accordion">
                <li>
                    <a class="active" href="/home/index">
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
                            <a href="/article/type/list">
                                <i class="fa fa-book"></i>
                                <span>图文</span>
                            </a>
                            <ul class="sub">
                                <li><a href="/article/type/list">发表图文</a></li>
                                <li><a href="/article/list">内容管理</a></li>
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
                    <a href="views/comment.jsp">
                        <i class="fa fa-comments"></i>
                        <span>评论管理</span>
                    </a>
                </li>
                <li class="sub-menu">
                    <a href="views/followuser.jsp">
                        <i class="fa fa-user-plus"></i>
                        <span>关注管理</span>
                    </a>
                </li>
                <li class="sub-menu">
                    <a href="views/fans.jsp">
                        <i class="fa fa-user-md"></i>
                        <span>粉丝管理</span>
                    </a>
                </li>
                <li class="sub-menu">
                    <a href="views/umanage.jsp">
                        <i class="fa fa-users"></i>
                        <span>用户管理</span>
                    </a>
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
                        <li><a href="views/myprofit.jsp">我的收益</a></li>
                        <li><a href="views/profitcenter.jsp">兑换中心</a></li>
                    </ul>
                </li>
                <li>
                    <a href="views/activity.jsp">
                        <i class="fa fa-gift"></i>
                        <span>活动</span>
                    </a>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class=" fa fa-key"></i>
                        <span>管理员操作</span>
                    </a>
                    <ul class="sub">
                        <li><a href="views/face.jsp">发布公告</a></li>
                        <li><a href="views/face.jsp">结算中心</a></li>
                    </ul>
                </li>
            </ul>
        </div>
        <!-- sidebar menu end-->
    </div>
</aside>
</body>
</html>
