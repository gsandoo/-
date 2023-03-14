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
	<div class="logBtn">
		<c:choose>
			<c:when test="${empty mem_nick}">
					<a href="<%=request.getContextPath() %>/login.do">로그인</a>
			</c:when>
	
			<c:otherwise>
					<a href="<%=request.getContextPath() %>/logout.do">로그아웃</a>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>