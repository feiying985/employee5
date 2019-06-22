<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/saveEmployee" method="POST">
	    员工工号：<input type = "text" name = "employee_id"><br/>
	    员工姓名：<input type = "text" name = "name"><br/>
	    员工年龄：<input type = "text" name = "age"><br/>
	    员工性别：<input type="radio" value="1" name="sex">男 <input type="radio" value="0" name="sex">女<br/>
	    员工电话：<input type = "text" name = "telephone"><br/>
	    员工邮箱：<input type = "text" name = "email"><br/>
	    员工状态：<input type="radio" value="1" name="status">在职 <input type="radio" value="0" name="status">离职<br/>
	    <input type = "submit" value = "添加">
	</form>
</body>
</html>