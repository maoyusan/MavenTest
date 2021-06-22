<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/19
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/test2" method="get">
    用户名 <input type="text" name="username"> <br/>
    密码 <input type="password" name="password"><br/>
    <input type="checkbox" name="hobby" value="唱歌">唱歌
    <input type="checkbox" name="hobby" value="跳舞">跳舞
    <input type="submit">
</form>
</body>
</html>
