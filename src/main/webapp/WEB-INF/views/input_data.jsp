<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>input_data</title>
</head>
<body>
	<h1>input_data</h1>
	
	<form action='input_pro' method='post'>
      data1 : <input type='text' name='data1'/><br/>
      data2 : <input type='text' name='data2'/><br/>
      data3 : <input type='text' name='data3'/><br/>
      <button type='submit'>확인</button>
   </form>

</body>
</html>