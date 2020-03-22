<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student confirmation</title>
</head>
<body>
   the student is confirmed : ${student.firstName} ${student.lastName}
   <br><br>
   student country : ${student.country}
   <br><br>
   student's favorite language: ${student.favoriteLanguage}
   <br><br>
   Operating Systems: 
   <ul>
      <c:forEach var="tmp" items="${student.operatingSystems}">
         <li>${tmp}</li>
      </c:forEach>
   
   </ul>
   
   
</body>
</html>