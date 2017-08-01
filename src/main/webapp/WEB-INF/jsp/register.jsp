<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <script type="text/javascript" src="${pageContext.request.contextPath}/scripts/jquery-1.7.2.min.js"></script>


    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/emp/registerConfirm.html" method="post">
    用户名：<input title="请输入账号" type="text" id="id" name="id" value="请输入账号" onclick= "a123()"/>
    姓名：<input title="请输入姓名" type="text" id="name" name="name" value=""/>
    工资：<input title="请输入工资" type="text" id="sal" name="sal" value=""/>
    性别：<input title="请输入性别" type="text" id="sex" name="sex" value=""/>
    <%--密码：<input title="请输入密码" class="password" type="password" value="" />--%>
    <button onclick="submit">提交</button>

</form>

<script type="text/javascript">

    var a123= function (){
        if($("#id").val()=="请输入账号"){
            $("#id").val(null);
        }
    }

</script>

</body>
</html>
