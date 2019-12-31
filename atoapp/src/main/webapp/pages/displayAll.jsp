<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Owners</title>
</head>
<body>
	<h1> Owners List</h1>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Gender</th>
			<th>Email</th>
			<th>Mobile No.</th>
			<th>DOB</th>
			<th>SSN</th>
		</tr>
		<c:forEach var="t" items="${list}">
			<tr>
				<td>${t.getOwner_fname()}</td>
				<td>${t.getOwner_lname()}</td>
				<td>${t.getOwner_gender()}</td>
				<td>${t.getOwner_gmail()}</td>
				<td>${t.getOwner_phno()}</td>
				<td>${t.getOwner_dob()}</td>
				<td>${t.getOwner_ssn()}</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="storeOwnerDetails">Add New Owner</a>
</body>
</html>