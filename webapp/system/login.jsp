<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
	
%>
<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="ie6 ielt8"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="ie7 ielt8"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="ie8"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html class="no-js"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>登录</title>
	<link href="<%=basePath%>/static/css/normalize.css" rel="stylesheet" type="text/css" />
	<link href="<%=basePath%>/static/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
	<script src="<%=basePath%>/static/js/jquery/jquery.1.10.1.min.js"></script>
	<script src="<%=basePath%>/static/js/jquery/jquery.ui.1.10.3.min.js"></script>
	<script src="<%=basePath%>/static/js/modernizr.custom.20819.js"></script>
	<script src="<%=basePath%>/static/js/application-985b892b.js"></script>
</head>
  <body class='login'>
    <div class='wrapper'>
      <div class='row'>
        <div class='col-lg-12'>
          <div class='brand text-center'>
            <h1>
              <div class='logo-icon'>
                <i class='icon-beer'></i>
              </div>
            </h1>
          </div>
        </div>
      </div>
      <div class='row'>
        <div class='col-lg-12'>
          <form action="<%=basePath%>/system/login/submit" method="post">
            <fieldset class='text-center'>
              <legend>---登录---</legend>
              <div class='form-group'>
                <input class='form-control' name="user" placeholder='用户名' type='text'>
              </div>
              <div class='form-group'>
                <input class='form-control' name="password" placeholder='密码' type='password'>
              </div>
              <div class='text-center'>
                <div class='checkbox text-left'>
                  <label>
                    <input type='checkbox'>记住我
                  </label>
                </div>
                <div class='text-right'>
                	<a href="forgot_password.html">忘记密码?</a>
                </div>
                <button class="btn btn-default" type="submit">登录</button>
                <br>
              </div>
            </fieldset>
          </form>
        </div>
      </div>
    </div>
</body>
</html>
