<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<label>HELLO WORLD VIEW PAGE</label>
	
	<!-- action durumunda controller classındaki processForm metodu çalışır -->
	
	
	<form action="processingDataToModel" method="GET"> 
	
	<!-- input girildiğinde girilen veri param.studentName olarak kaydedilir. Diğer kısımlarda kullanılabilir ${param.studentName} -->
	
		<input type="text" name="studentName" placeholder="What's your name?"/>
		<input type="submit"/>
	</form>
	 
	 
	
</body>
</html>