<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>input_data</title>
</head>
<body>
	<h1>input data</h1>
	
	<form:form action="input_pro" method="post" modelAttribute="dataBean">
		data1 : <form:input type="text" path="data1"/><br />
				<form:errors path ="data1"/><br />
		data2 : <form:input type="text" path="data2"/><br />
				<form:errors path ="data2"/><br />
		<form:button type = "submit">확인</form:button>
	</form:form>
	
</body>
</html>