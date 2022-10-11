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

	<form:form modelAttribute="radiobuttonresult" action="showRadioButtonResult">
		CHOOSE YOUR FAVORITE LANGUAGE: <br>
		JAVA <form:radiobutton path="language" value="JAVA"/>
		C# <form:radiobutton path="language" value="C#"/>
		PHP <form:radiobutton path="language" value="PHP"/>
		JS <form:radiobutton path="language" value="JS"/>

	<input type="submit" value="SUBMIT"/>
	
	</form:form>
	
</body>
</html>