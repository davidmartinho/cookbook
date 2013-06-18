<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Recipe List</title>
</head>
<body>

<a href="/home"><h2>Home</h2></a><br><br>
<c:forEach var="recipe" items='${recipes}'> <hr>
<a href="/recipes/${recipe.externalId}">${recipe.title} </a><br>
${recipe.creationTimestamp}<br>
<a href="/recipes/${recipe.externalId}/delete">apagar</a><br>
</c:forEach> 

</body>
</html>