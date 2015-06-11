<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/6/11
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="decorator"
           uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<spring:message var="siteTitle" code="site.title"/>
<%
    String cp = request.getContextPath();
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport"
          content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no">

    <%--<meta http-equiv="Cache-Control"--%>
    <%--content="no-cache,no-store,must-revalidate"/>--%>
    <%--<meta http-equiv="Pragma" content="no-cache"/>--%>
    <%--<meta http-equiv="Expires" content="0"/>--%>

    <title><decorator:title/> - ${siteTitle}</title>
    <link rel="stylesheet" href="<%=cp%>/css/site.css">
    <link rel="stylesheet" href="<%=cp%>/css/site-resp.css">
    <decorator:head/>
</head>
<body>
<div id="header">
    <div class="c">
        <table class="layout">
            <tr>
                <td>
                    <label class="brand">HEADER</label>
                </td>
                <td class="min">
                    Home
                </td>
                <td class="min">
                    Applications
                </td>
                <td class="min">
                    Contact Us
                </td>
            </tr>
        </table>
    </div>
</div>
<div id="content">
    <div class="c"><decorator:body/></div>
</div>
<div id="footer">
    <div class="c">
        <spring:message code="site.foot.note"/>
    </div>
</div>
</body>
</html>
