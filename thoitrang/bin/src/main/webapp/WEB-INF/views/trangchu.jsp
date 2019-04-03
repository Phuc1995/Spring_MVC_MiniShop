<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.hoangphuc.entity.NhanVien"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resources/Styles/styles.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h3>Hello Phuc</h3>
<body>
<c:out value=""></c:out>
	<a id="test" href="chitiet">Qua trang chi tiet</a>
	<form action="chitiet" method="post">
		<input type="text" name="tennhanvien"></br>
		<input type="text" name="diachi"></br>
		<input type="text" name="tuoi"></br>
		<input type="submit" value="Post du lieu">
	</form>
	
	
	
	
 

</body>
</html>