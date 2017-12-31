<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>用户登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);
    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/static/lib/jquery/jquery-3.2.1.min.js"></script>
    <link href="<%=request.getContextPath()%>/static/css/login/style.css" rel='stylesheet' type='text/css'/>
    <link href="<%=request.getContextPath()%>/static/lib/layui/css/layui.css" rel='stylesheet' type='text/css'/>
    <script type="text/javascript" src="<%=request.getContextPath()%>/static/lib/layui/layui.all.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/static/js/business/login/login.js"></script>
</head>
<body>

<!--SIGN UP-->
<div class="login-form">
    <div class="avtar">
        <img src="<%=request.getContextPath()%>/static/image/login/avtar.png"/>
    </div>
    <input id="userName" type="text" class="text" value=" " >
    <div class="key">
        <input id="userPwd" type="password" value="" >
    </div>
    <div class="signin">
        <input type="submit" onclick="login()" value="登录">
    </div>
</div>
<div class="copy-rights">
    <p>Copyright &copy; 2018.Sinoku All rights reserved.</p>
</div>
</body>
</html>