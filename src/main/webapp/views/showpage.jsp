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
    <title>详细</title>
    <link rel="shortcut icon" href="images/crplog.ico">
    <link rel="stylesheet" href="css/show.css">
</head>
<body class="showbd">
<div >
    <table class="header">
        <tr>
            <td><p>CRP</p></td>
            <td>
                <a class="fw1" href="views/usercenter.jsp">欢迎，
                    <span class="username">Leta Chen</span>
                    <!--<span class="username">${username}</span>-->
                </a>
                <a href="views/home.jsp" class="fw2">发文</a>
            </td>
        </tr>
    </table>

    <table width="100%" border="0" cellpadding="8" cellspacing="0" class="tablepage-left">
        <tr>
            <td><h1 align="center">坚持就是胜利！</h1></td>
        </tr>
        <tr>
            <td><p>人们都想在事业或学业上有所成就，但是，只有一部分人取得了胜利，而相当一部分人却陷入失败的若痛之中。这是为什么呢？

　　俗语说“功到自然成”。按理说那些失败者完全可以尝到胜利的喜悦，但他们往往缺少一种胜利的必要条件，那就是坚持。这就是他们失败的原因。上边的俗语中所提到的“功到”其中已经隐含了“坚持”的意思。可见，一个人要想取得学业上或事业上的成功，除了个人的努力之外，坚持也是实现这一目标的重要条件。

　　大家报名参加这个大赛也想在其比赛中有所成就吧，我也想、你也想、他也想，可是不可能所以人都会看到令自己满意的结果，不然这个比赛也没有什么意义，你也没有什么动力了，自然也学不到什么东西了。那么为什么最后有的比赛选手会露出满意笑容呢？他们除了技术问题能熟练操作之外，还有就是他们的心态，他们一直在坚持，不管是进步还是落后了，他们从来就没有放弃过。

　　时间对于每一人都是公平的，单看你是怎么利用它了，有的人成了时间的主人，有的人却成了时间的奴隶。凡每一个成功的人，他们都是勤奋、努力的；而凡每一个勤奋、努力的人，都是善于抓住时间的人，从不轻言放弃的。所谓“光阴似箭”，真是一点儿不错啊。也许你中途放弃了比赛，你就放弃了一个机会，别人都在向前追赶，当你想继续的时候，也许发现已太晚了，所以不要等到失去了才知道回头珍惜，可能他已属于别人了，所以不要轻易放弃。

　　还记得狄更斯和爱迪生就是靠坚持而取得最后的胜利的。坚持，使狄更斯为人们留下许多优秀着作，也为世界文学宝库增添了许多精品；坚持，使爱迪生攻克了许许多多的难关，为人类的进步作出不可磨灭的贡献。可见，坚持能够使人取得事业和学业上的成功。如果你想成功从现在起就好好作这个比赛，也许你会有意外的收获哦。

　　没有所谓的失败，除非你不在尝试。我相信坚持就是胜利，你呢？

　　《坚持就是胜利》（二）人们都想在事业或学业上有所成就，但是，只有一部分人取得了胜利，而相当一部分人却陷入失败的若痛之中。这是为什么呢？

                　　俗语说“功到自然成”。按理说那些失败者完全可以尝到胜利的喜悦，但他们往往缺少一种胜利的必要条件，那就是坚持。这就是他们失败的原因。上边的俗语中所提到的“功到”其中已经隐含了“坚持”的意思。可见，一个人要想取得学业上或事业上的成功，除了个人的努力之外，坚持也是实现这一目标的重要条件。

                　　大家报名参加这个大赛也想在其比赛中有所成就吧，我也想、你也想、他也想，可是不可能所以人都会看到令自己满意的结果，不然这个比赛也没有什么意义，你也没有什么动力了，自然也学不到什么东西了。那么为什么最后有的比赛选手会露出满意笑容呢？他们除了技术问题能熟练操作之外，还有就是他们的心态，他们一直在坚持，不管是进步还是落后了，他们从来就没有放弃过。

                　　时间对于每一人都是公平的，单看你是怎么利用它了，有的人成了时间的主人，有的人却成了时间的奴隶。凡每一个成功的人，他们都是勤奋、努力的；而凡每一个勤奋、努力的人，都是善于抓住时间的人，从不轻言放弃的。所谓“光阴似箭”，真是一点儿不错啊。也许你中途放弃了比赛，你就放弃了一个机会，别人都在向前追赶，当你想继续的时候，也许发现已太晚了，所以不要等到失去了才知道回头珍惜，可能他已属于别人了，所以不要轻易放弃。

                　　还记得狄更斯和爱迪生就是靠坚持而取得最后的胜利的。坚持，使狄更斯为人们留下许多优秀着作，也为世界文学宝库增添了许多精品；坚持，使爱迪生攻克了许许多多的难关，为人类的进步作出不可磨灭的贡献。可见，坚持能够使人取得事业和学业上的成功。如果你想成功从现在起就好好作这个比赛，也许你会有意外的收获哦。

                　　没有所谓的失败，除非你不在尝试。我相信坚持就是胜利，你呢？

                　　《坚持就是胜利》（二）

                　　每一个人都见过成功的彩虹，都尝过成功的喜悦，而成功的秘诀是什么呢？那就是坚持不懈的精神。

                　　从毛毛虫蜕变成蝴蝶，是一个艰难的、痛苦的过程，但它并没有因此而放弃，而是凭着坚持不懈的精神，最终赢得了美丽；蚌壳里钻进了一粒细小的沙粒，使它不断地分秘汁液，这种过程是一种折磨，是一种煎熬，但它并没有向困难低头，而是凭着坚持不懈的精神，一层一层地包裹着这粒细小的沙，最终它孕育出了绚丽夺目的珍珠。

                　　事实证明，无论多么艰难的事情，只要你有着坚持不懈的精神，你就一定会战胜困难，收获成功的硕果。

                　　海伦·凯勒，是个家喻户晓的人物，她是一个在无声的黑暗世界里摸索的少女，但她并没有因此而自暴自弃，而是以她惊人的毅力和坚持不懈的精神，掌握了许多的知识，创造了生命的奇迹。

                　　贝多芬，这位着名的音乐家，创作了许许多多优秀的音乐作品。（励志文章 www.lz13.cn）风华正茂的他，面对失聪这一致命的打击，并没有向命运低头，而是更加努力地创作音乐，凭着坚持不懈的精神，他创作了举世闻名的《命运交响曲》。这是他心灵的呼唤，是他灵魂的发泄。

                　　爱迪生，这位给人类世界带来光明的科学家，在他发明电灯的时候，屡次碰壁。面对2000多次的失败，他并没有放弃，仍然执着地追求着，废寝忘食地钻研着，终于，他凭着自己坚持不懈的精神，取得了成功，从此，人类的夜晚不再只有黑暗陪伴，而是变得更加美丽，更加明亮，更加繁华。

                　　蒲松龄，曾先后参加了四次科举，却从未及第，但他并未因此颓废，而是要立志完成一部“孤愤之书”，于是他在镇纸上刻着这样一幅对联：“有志者，事竞成，破釜沉舟，百二秦关终属楚；苦心人，天不负，卧薪尝胆，三千越甲可吞吴。”他以此自警自勉，最终，凭着自己坚持不懈的精神，完成了一部宏伟着作——《聊斋志异》。

                　　愚公移山、精卫填海，都告诉了我们这样一个道理：坚持就是胜利。

　　每一个人都见过成功的彩虹，都尝过成功的喜悦，而成功的秘诀是什么呢？那就是坚持不懈的精神。

　　从毛毛虫蜕变成蝴蝶，是一个艰难的、痛苦的过程，但它并没有因此而放弃，而是凭着坚持不懈的精神，最终赢得了美丽；蚌壳里钻进了一粒细小的沙粒，使它不断地分秘汁液，这种过程是一种折磨，是一种煎熬，但它并没有向困难低头，而是凭着坚持不懈的精神，一层一层地包裹着这粒细小的沙，最终它孕育出了绚丽夺目的珍珠。

　　事实证明，无论多么艰难的事情，只要你有着坚持不懈的精神，你就一定会战胜困难，收获成功的硕果。

　　海伦·凯勒，是个家喻户晓的人物，她是一个在无声的黑暗世界里摸索的少女，但她并没有因此而自暴自弃，而是以她惊人的毅力和坚持不懈的精神，掌握了许多的知识，创造了生命的奇迹。

　　贝多芬，这位着名的音乐家，创作了许许多多优秀的音乐作品。（励志文章 www.lz13.cn）风华正茂的他，面对失聪这一致命的打击，并没有向命运低头，而是更加努力地创作音乐，凭着坚持不懈的精神，他创作了举世闻名的《命运交响曲》。这是他心灵的呼唤，是他灵魂的发泄。

　　爱迪生，这位给人类世界带来光明的科学家，在他发明电灯的时候，屡次碰壁。面对2000多次的失败，他并没有放弃，仍然执着地追求着，废寝忘食地钻研着，终于，他凭着自己坚持不懈的精神，取得了成功，从此，人类的夜晚不再只有黑暗陪伴，而是变得更加美丽，更加明亮，更加繁华。

　　蒲松龄，曾先后参加了四次科举，却从未及第，但他并未因此颓废，而是要立志完成一部“孤愤之书”，于是他在镇纸上刻着这样一幅对联：“有志者，事竞成，破釜沉舟，百二秦关终属楚；苦心人，天不负，卧薪尝胆，三千越甲可吞吴。”他以此自警自勉，最终，凭着自己坚持不懈的精神，完成了一部宏伟着作——《聊斋志异》。

　　愚公移山、精卫填海，都告诉了我们这样一个道理：坚持就是胜利。
            </p></td>
        </tr>
    </table>
    <table width="100%" border="0" cellpadding="0" cellspacing="0" class="tablepage-right">
        <tr>
            <td></br>
                <span>用户:XXX</span></br></br>
                <span>粉丝：1500</span></br></br>
                <span>关注：1500</span></br></br>
                <span><input type="button" class="listbtn" value="加关注" name="add" onclick=""></span></br></br>
                <span>已关注</span></br></br>
            </td>
        </tr>
    </table>
</div>
</body>
</html>
