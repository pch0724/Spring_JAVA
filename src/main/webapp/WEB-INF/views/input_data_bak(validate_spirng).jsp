<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix='spring' uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>input_data</title>
</head>
<body>
	<h1>input data</h1>
	<form action="input_pro" method = "post">
	
		data1 : <input type="text" name ='data1'/><br />
		<!-- 유효성 검사 결과 -->
		<!-- dataBean에 위배된 정보가 들어오면 result에 담겨진 정보를 가져옴 -->
		<spring:hasBindErrors name="dataBean">
			<c:if test="${errors.hasFieldErrors('data1') }">
				${errors.getFieldError('data1').defaultMessage }<br />
			</c:if>
		</spring:hasBindErrors>
		
		data2 : <input type="text" name ='data2'/><br />
		<!-- 유효성 검사 결과 -->
		<!-- dataBean에 위배된 정보가 들어오면 result에 담겨진 정보를 가져옴 -->
		<spring:hasBindErrors name="dataBean">
			<c:if test="${errors.hasFieldErrors('data2') }">
				${errors.getFieldError('data2').defaultMessage }<br />
			</c:if>
		</spring:hasBindErrors>
		
		<button type = "submit">확인</button>
		
	</form>
</body>
</html>