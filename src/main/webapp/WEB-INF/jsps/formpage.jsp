<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<body>

<f:form action="register" method="post" modelAttribute="student">

Enter Roll :<f:input path="roll" /><br><br>
Enter Name :<f:input path="name" /><br><br>
Enter Marks :<f:input path="marks" /><br><br>

<input type="submit" value="Register">

</f:form>

<br><br>

<a href="getStudentDetails">Click</a>





</body>
</html>