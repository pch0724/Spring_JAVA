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
		
		data1 : <form:input path="data1" type = "text"/><br />
				<form:errors path="data1" style="color:red"/><br />

		data2 : <form:input path="data2" type = "text"/><br />
				<form:errors path="data2" style="color:red"/><br />

		data3 : <form:input path="data3" type = "text"/><br/>
				<form:errors path='data3' style="color:red"/><br/>
				
		data4 : <form:input path="data4" type = "text"/><br/>
				<form:errors path='data4' style="color:red"/><br/>
				
		data5 : <form:input path='data5' type = "text"/><br/>
				<form:errors path='data5' style="color:red"/><br/>
		
		data6 : <form:input path="data6" type = "text"/><br/>
				<form:errors path='data6' style="color:red"/><br/>
				
		data7 : <form:input path="data7" type = "text"/><br/>
				<form:errors path='data7' style="color:red"/><br/>

		<form:button type = "submit">확인</form:button>
	</form:form>
	
</body>
</html>