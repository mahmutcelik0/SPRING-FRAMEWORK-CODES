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
	
	<form:form modelAttribute="country" action="showDropDownResult">
		<form:select path="countryName">
	
			<form:option value="Brazil" label="BRAZIL"/>
			<form:option value="Turkey" label="TURKEY"/>
			<form:option value="Germany" label = "GERMANY"/>
			<form:option value="England" label="ENGLAND"/>
		
		</form:select>
		
		<br><br>
		<input type="submit" value="SUBMIT"/>
		
	
	</form:form>
	
</body>
</html>