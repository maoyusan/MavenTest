<html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>
<h2>Hello World!</h2>
<form action="index.jsp" method="get">
    <input type="text" name="username" value="${param.username}">
    <input type="submit">

</form>
<c:if test="${param.username=='admin'}" var="isAdmin">
    <c:out value="管理员欢迎您"/>
    <c:out value="isAdmin"/>
</c:if>


</body>

</html>
