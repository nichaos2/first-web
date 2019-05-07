<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login here | From JSP</title>
</head>
<body>

<!-- How to run -->
<!-- Right click on the project > Run as > build...  -->
<!-- in goal put clean install tomcat7:run -->
<!-- in browser localhost:8080/login.do -->


<!-- GET method in the same page -->
<form action="/login.do" method="get">
Enter your name: <input type="text" name="name"/>
Enter your password: <input type="password" name="password"/>
<input type="submit" value="login GET"/>
</form>

<!--  POST with user validation service -->
</br>
<p> <font color = "red"> ${errorMsg}</font>
</br>
You entered name is ${name} </br>
and password ${password} 
</br>
My parameters are: ${param}
</p>

<form action="/login.do" method="post">
Enter your name: <input type="text" name="name"/>
Enter your password: <input type="password" name="password"/>
<input type="submit" value="login POST"/>

</br> Use nik pass
</form>

</body>
</html>