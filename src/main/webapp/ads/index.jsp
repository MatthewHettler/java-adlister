<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Ads</title>
</head>
<body>
<h1>Ad Listings:</h1>

<c:forEach var="ads" items="${ads}">
    <div class="ads">
        <h2>${ads.title}</h2>
        <p>${ads.description}</p>
    </div>
</c:forEach>

</body>
</html>