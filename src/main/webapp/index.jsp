<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "Adlister" %>
    </title>
    <%@ include file="partials/head.jsp" %>
    <%@ include file="partials/styling.jsp" %>
</head>
<body>
<%@ include file="partials/navbar.jsp" %>
<c:if test="true">
    <h1>Home Page</h1>
</c:if>
<c:if test="false">
    <h1>Something Went Wrong!</h1>
</c:if>
<%@ include file="partials/scripts.jsp" %>
</body>
</html>

