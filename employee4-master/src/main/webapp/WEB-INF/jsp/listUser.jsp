<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户信息</title>
</head>
<body>
        <table align="center" rules="all" frame="border">
        <tr>
            <td>用户名</td>
            <td>密码</td>
            <td>用户类型</td>
            <td></td>
            <td></td>
        </tr>
        <c:forEach items = "${listUser}" var = "item" >
            <tr>
                <td>${item.user_name }</td>
                <td>${item.user_password }</td>
                <td> 
                    <c:if test = "${item.permission_level=='1' }">普通用户</c:if>
                    <c:if test = "${item.permission_level=='0' }">管理员</c:if>
                </td>
                
                <td><a href="/formUpdateUser.jsp">修改</a></td>
                <td><a href="/deleteUser?user_name=${item.user_name }">删除</a></td>
              </tr>
        </c:forEach>
    </table>
   
    <div align="center"><a href="/formAddUser.jsp" >添加用户</a></div>
    
</body>
</html>