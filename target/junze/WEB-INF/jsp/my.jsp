<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<script type="text/javascript" src="${ctx}/scripts/jquery-1.7.2.min.js"></script>
<title>Insert title here</title>
</head>
<body>

html
	<c:if test="${true}">success</c:if>
	<form action="/login">
		用户名：<input title="" type="text" id="user" name="user" value="请输入账号"  onclick= "a123()"/>
		密码：<input title="请输入密码" class="password" type="password" value="" />
		<div id="div" onclick="a123()">123 </div>
		
		<button onclick="submit">提交</button>
	</form>
	
	当前时间<h2 >${date}</h2>
	
	<script type="text/javascript">
	var a123= function (){
		if($("#user").val()=="请输入账号"){
		$("#user").val(null);
		}
		var text= $("#div").text();
		//alert(text);
		var html =$("#div").html();
		//alert(html);
	}
	/* function password (){
		
		$(".password").val(null);
	} */
	function submit(){
		var form = $(":form");
		alert();
	}
	</script>
	
</body>
</html>