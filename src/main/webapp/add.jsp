<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="add" method="post">
<h3>Enter the no...</h3>
<pre>
num1 <input type="text" name="1num">
num2 <input type="text" name="2num">
<input type="submit" value="add">
</pre>
</form>
<h1>The result is <% if(request.getAttribute("d")!=null){ out.println(request.getAttribute("d"));} %></h1>
</body>
</html>