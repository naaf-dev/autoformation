<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC demo - Home Page</title>
</head>

<body>
   <h2>Spring MVC demo - Home Page</h2>
   <img src="${pageContext.request.contextPath}/resources/images/spring-logo.png" />
   
   <hr>
   <a href="hello/showForm">Hello World Form</a>
    <br><br>
   
   <a href="student/showForm">Student Form</a>
   <br><br>
   
   <a href="customer/showForm">Customer Form</a>
   <br><br>
   
</body>

</html>