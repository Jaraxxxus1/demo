<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<%--
  Created by IntelliJ IDEA.
  User: Sazonov
  Date: 03.07.2023
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Dear Employee please enter your name</h2>
<br>
<br>
<form:form action="showDetails" modelAttribute="employee">
    Name : <form:input path="name"/>
    <br>
    Surname : <form:input path="surname"/>
    <br>
    Salary : <form:input path="salary"/>
    <br>
    Department : <form:select path="department">
    <form:option value = "NONE" label = "Select"/>
    <form:option value= "IT" label= "IT"/>
    <form:option value= "human resources" label= "HR"/>
    <form:option value= "SALES" label= "SALES"/>
<%--    <form:options item ="${employee.departments}"/>--%>

</form:select>
    <br>
    <br>
    <input type="submit" value="OK">
</form:form>


</body>
</html>
