<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<a href="/home"><h2>Home</h2></a><br><br>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Recipes ${recipe.externalId}</title>
</head>
<body>
	<h1>${recipe.title}</h1>
	<b>Problema:</b>
	<p>${recipe.problem}</p>
	<b>Solução:</b>
	<p>${recipe.solution}</p>
	<b>Autor:</b>
	<p>${recipe.author}</p>
</body>
</html>