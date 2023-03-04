<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section>

		<a href="#">의류</a>
		<a href="#">셰어링</a>
		<a href="#">렌탈 안내</a>
		<c:if test="${empty mem_nick}" >
			<a href="#">회원가입</a>
		</c:if>
		<c:if test="${!empty mem_nick}" >
			<a href="#">마이페이지</a>
		</c:if>

	</section>
</body>
</html>