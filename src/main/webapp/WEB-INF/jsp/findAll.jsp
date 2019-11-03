<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>findById</title>
</head>
<body>
<c:forEach items="${requestScope.adminAll}" varStatus="i" var="admin">
    <td>${admin.admin_id}${i.index}</td>
    <td>${admin.admin_name}</td>
    <td>${admin.admin_password}</td><br>
</c:forEach>
</body>
</html>
