<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/6/10
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String cp = request.getContextPath();
%>
<html>
<head>
    <title>Home</title>
</head>
<body>
Hello <b>${who}</b>, welcome to <b>${siteTitle}</b>!
<br/>
${timestamp}
<hr/>
This link need login: <a href="<%=cp%>/profile">My Profile</a>
</body>
</html>
