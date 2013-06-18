<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>CreateRecipe</title>
</head>
<body>
	
	//<div align="right"> ${currentHour}:${currentMinute} <br> ${currentTime} </div>
	${currentHour}:${currentMinute}
	<form method="POST" action="/recipes">
	
	Titulo: <input type="text" name="title" /> <br>
	Problema <input type="text" name="problem" /> <br>
	Solucao <input type="text" name="solution"  /> <br>
	Autor <input type="text" name="author" />  <br>
	<input type="submit" value="Criar Nova Receita" />
	
</form>
</body>
</html>

