<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2021/4/26
  Time: 10:31 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    // 作用域层级：page -> request -> session -> application
  pageContext.setAttribute("name01","陈亮01");    //保存的数据只在一个页面中有效
  request.setAttribute("name02","陈亮02");        //保存的数据只在一次请求中有效，请求转发会携带着这些数据
  session.setAttribute("name03","陈亮03");        //保存的数据只在一次会话中有效，作用域：和session的生命周期挂钩，关闭浏览器后会失效
  application.setAttribute("name04","陈亮04");    //保存的数据在整个服务器中有效，作用域：和服务器的生命周期挂钩，关闭服务器后失效
%>



<h1>取出的值为</h1>

<h3>${name01}</h3>
<h3>${name02}</h3>
<h3>${name03}</h3>
<h3>${name04}</h3>
<h3>${name05}</h3>

</body>
</html>
