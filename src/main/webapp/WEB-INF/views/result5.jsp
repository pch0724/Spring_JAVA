<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result</title>
</head>
<body>
	<h1>result5</h1>
	<!-- data1, data2의 값은 DataBean1의 객체 bean1에 저장되어 있으므로... -->
	<h3>bean1.data1 : ${requestScope.bean1.data1 }</h3>
	<h3>bean1.data2 : ${requestScope.bean1.data2 }</h3>
</body>
</html>