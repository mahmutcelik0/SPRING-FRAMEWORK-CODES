<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="showBetterDropDownResult" modelAttribute="betterCountry" >
		<form:select path="countryName">
			<form:options items="${betterCountry.countryItems}" />
		</form:select>
		
		<br><br>
		<input type="submit" value="SUBMIT"/>	
	</form:form>

</body>
</html>