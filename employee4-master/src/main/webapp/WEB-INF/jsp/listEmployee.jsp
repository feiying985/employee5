<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>员工信息</title>
</head>
<body>
	欢迎您：${user.user_name }！<br/>
    <table align="center" rules="all" frame="border">
        <tr>
            <td>工号</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>性别</td>
            <td>电话</td>
            <td>邮箱</td>
            <td>状态</td>
            <td></td>
            <td></td>
        </tr>
        <c:forEach items = "${listEmployee}" var = "item" >
            <tr>
                <td>${item.employee_id }</td>
                <td>${item.name }</td>
                <td>${item.age }</td>
                <td>
                    <c:if test = "${item.sex=='1' }">男</c:if>
                    <c:if test = "${item.sex=='0' }">女</c:if>
                </td>
                <td>${item.telephone }</td>
                <td>${item.email }</td>
                <td> 
                    <c:if test = "${item.status=='1' }">在职</c:if>
                    <c:if test = "${item.status=='0' }">离职</c:if>
                </td>
                <!-- 这里应该通过页面获取本行的employee_id??? -->
                <td><a href="/formUpdateEmployee.jsp?employee_id=${item.employee_id }">修改</a></td>
                <td><a href="/deleteEmployee?employee_id=${item.employee_id }">删除</a></td>
              </tr>
        </c:forEach>
    </table>
   
    <div align="center"><a href="formAddEmployee.jsp" >添加员工</a></div>
    
    <div align="center">
    <form action="/getByEmployee_id" method="POST" >
	    员工工号：<input type = "text" name = "employee_id" >
	    <input type = "submit" value = "查询">
	</form>
	</div>
	
	<div align="center"><a href="/quitHandle" >退出登录</a></div>
</body>
</html>
