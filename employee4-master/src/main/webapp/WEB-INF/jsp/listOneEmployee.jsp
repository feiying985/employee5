<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <table align="center" rules="all" frame="border">
            <tr>
                <td>工号</td>
                <td>姓名</td>
                <td>年龄</td>
                <td>性别</td>
                <td>电话</td>
                <td>邮箱</td>
                <td>状态</td>
            </tr>
            <tr>
                <td>${employee.employee_id }</td>
                <td>${employee.name }</td>
                <td>${employee.age }</td>
                <td>
                    <c:if test = "${employee.sex=='1' }">男</c:if>
                    <c:if test = "${employee.sex=='0' }">女</c:if>
                </td>
                <td>${employee.telephone }</td>
                <td>${employee.email }</td>
                <td> 
                    <c:if test = "${employee.status=='1' }">在职</c:if>
                    <c:if test = "${employee.status=='0' }">离职</c:if>
                </td>
            </tr>
    </table>
    <p align="center"><a href="/getAllEmployee" >员工信息列表</a></p>
</body>
</html>