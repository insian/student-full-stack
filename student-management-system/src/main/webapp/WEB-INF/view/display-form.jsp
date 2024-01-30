<%@page import="com.example.demo.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<table class="table table-striped">
		<tr>
			<th>Student ID</th>
			<th>Student Name</th>
			<th>Stream</th>
		</tr>
		
		<%
		Student[] students  = (Student[])request.getAttribute("students");
		for(Student s:students){
			out.println("<tr><td>"+s.getStudentId()+"</td><td>"+s.getName()+"</td><td>"+s.getStream()+"</td><tr>");
		}
		%>
		
	</table>
</body>
</html>