<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원목록</title>
<%@ include file="../include/header.jsp" %>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<h2>회 원 목 록</h2>
<table >
	<tr>
		<th>아이디</th>
		<th>이   름</th>
		<th>패스워드</th>
		<th>이메일</th>
		<th>가입일</th>
	</tr>
	<c:forEach var="list" items="${list}">
		<tr>
			<td>${list.userid}</td>
			<td>${list.username}</td>
			<td>${list.pw}</td>
			<td>${list.email}</td>
			<td>${list.regdate}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>