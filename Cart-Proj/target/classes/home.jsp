<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="blue">
<form action="home.do" method="post">
Enter Item Name: <input type="text" name="name"/>
Enter Quantity: <input type="text" name="quantity"/>
Enter Price: <input type="number" name="price"/>
<input type="submit" value="Buy"/>
</form>
</body>
</html>