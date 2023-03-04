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
		<div>
			<a href="<%=request.getContextPath() %>/join.do">회원가입</a>
			<a href="<%=request.getContextPath() %>/list.do">고객센터</a>
			<c:if test="${empty mem_nick}" >
				<a href="<%=request.getContextPath() %>/login.do">로그인</a>
			</c:if>
			<c:if test="${!empty mem_nick}" >
				<a href="<%=request.getContextPath() %>/Enroll.do">${mem_nick } 님 상품등록</a>
				<a href="<%=request.getContextPath() %>/logout.do">${mem_nick } 님 로그아웃</a>
				<a href="<%=request.getContextPath() %>/mypage.do">마이페이지</a>
			</c:if>
		</div>
	</section>
</body>
</html>