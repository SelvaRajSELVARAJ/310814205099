<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
<form action="RegisterServlet">
<centre><h1>Register to database</h1></centre>
Name<input type="text" name="name"><br><br>
Email<input type="email" name="email"><br><br>
Password <input type="password" name="password"><br><br>
<button type="submit">Register</button><br><br>

</form>
<a href="home.jsp">Return Home</a>

</body>
</html>