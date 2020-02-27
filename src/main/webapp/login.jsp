<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <%@ include file="partials/head.jsp" %>
    <%@ include file="partials/styling.jsp" %>
</head>
<body>
<%@ include file="partials/navbar.jsp" %>
<h1>Login Page</h1>

<center>
    <form action="login.jsp" method="post">
        <br/>Username:<label>
        <input type="text" name="username">
    </label>
        <br/>Password:<label>
        <input type="password" name="password">
    </label>
        <br/><input type="submit" value="Submit"></form>
</center>

<% String username = request.getParameter("username");
    String password = request.getParameter("password");
    if ((username != null && password != null)) {
        if ((username.equals("admin") && password.equals("password"))) {
            response.sendRedirect("profile.jsp");
        } else {
            response.sendRedirect("login.jsp");
        }
    }
%>
<%@ include file="partials/scripts.jsp" %>
</body>
</html>


