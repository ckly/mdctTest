<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="refresh" content="5">
<title>Insert title here</title>
<%@ include file="../include/header.jsp" %>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<table>
	<tr>
		<th>NM</th>
		<th>KOR</th>
		<th>ENG</th>
		<th>MAT</th>
		<th>SCI</th>
		<th>MUS</th>
		<th>GYM</th>
		<th>ART</th>
		<th>TOT</th>
	</tr>
	
	
	<c:forEach var="list" items="${list}">
	<tr>
		<td>${list.nm}</td>
		<td>${list.kor}</td>
		<td>${list.eng}</td>
		<td>${list.mat}</td>
		<td>${list.sci}</td>
		<td>${list.mus}</td>
		<td>${list.gym}</td>
		<td>${list.art}</td>
		<td>${list.tot}</td>
		<tr>
	</c:forEach>
		
	
	
</table>
</body>
</html>