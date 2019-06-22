<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="/saveUser" method="POST">
	    用户名：<input type = "text" name = "user_name"><br/>
	    密码：<input type = "text" name = "user_password"><br/>
	    权限：<input type="radio" value="1" name="permission_level">普通用户<input type="radio" value="0" name="permission_level">管理员<br/>
	    <input type = "submit" value = "添加">
	</form>
</body>
</html>