<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'success.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script>
	
	$(document).ready(function(){
//点击关闭按钮关闭弹出层
  $(".close-btn").click(function(){
   $("layer").hide();
  });
 
//只有再手机号和验证码验证为有效后，点击领取按钮跳出弹出层事件才生效
  $('[name=btn]').click(function(){
     if(!validate()){
    return false;
    }
    $(".layer").show();
  });
 
//验证
function validate(){
//正则表达式，十一位数字的电话号码
  var phoneReg = /^(0|86|17951)?(13[0-9]|15[012356789]|17[0-9]|18[0-9]|14[57])[0-9]{8}$/;
//如果手机号码输入为空，则再输入框后插入错误信息
if($('[name=phonenumber]').val==''){
    $('[name=phonenumber]').after(errMsg('手机号码不能为空！'));
　　　　return false;
　　}
//验证输入的电话号码是否是11位数字
if(!phoneReg.test($('[name=phonenumber]').val())){
$('[name=phonenumber]').after(errMsg('请输入正确的手机号码！'));
　　　　return false；
}
 
//验证码不为空验证
if($('[name=verify]').val==''){
    $('[name=verify]').after(errMsg('验证码不能为空！'));
　　　　return false;
}
$('.error').remove();
return true;}
//点击发送验证码按钮，进行倒计时
$('.verify_code').on('',function(){
 if(!this.b){
  setTimer();
  this.b=true;
}
})
 
//倒计时
function setTimer(){
　　var time=60;
  var timers=setInterval(function(){
  time--;
if(time <= 0){
  time=0;
  console.log(time);
  $('.verify_code').eq(0)[0].b=false;
  $('.verify_code').val('获取验证码');
  clearInterval(timers);
return false;
  
}
$('.verify_code).val( time+ '秒后重新获取')；
}，1000）
}
 
 
//错误信息显示
function errMsg(html){
　　$('.error').remove();
　　var str='<div class="error">*'+html+'</div>';
  return str;
}
 
});
	
	
	</script>
  </head>
  
  <body>
    <center>
    <form>
    
    <div>
  <input type="text" name="phonenumber" placeholder="请输入您的手机号码" />
  <input type="text" name="verify" placeholder="请输入验证码" /><input type="button" value="发送验证码" class="verify_code" />
  <input type="button" name="btn" placeholder="立即领取" class="btn" />
</div>
<!--弹出层-->
<div class="layer" style="display:none">
    <p>领取成功</p>
    <img src="img/close-btn.png" class="close-btn">
</div>
    
    </form>
    
    </center>
  </body>
</html>
