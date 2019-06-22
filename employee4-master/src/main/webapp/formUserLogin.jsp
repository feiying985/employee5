<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="/loginHandle" method="post">
                用户名：<input type="text" name="user_name"><br/>
                密码：<input type="text" name="user_password"><br/>
         <input type="submit" value="登录">
    </form>
</body>
</html>