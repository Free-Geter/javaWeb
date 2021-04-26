<html>
<body>
<%--在action中需要设置提交路径，需要找到项目的路径--%>
<%--${pageContext.request.contextPath}代表当前项目--%>
<form action="${pageContext.request.contextPath}/login" method="get">
    Usernam: <input type="text" name="username"> <br>
    Password: <input type="password" name="password"> <br>
    <input type="submit">
</form>
</body>
</html>
