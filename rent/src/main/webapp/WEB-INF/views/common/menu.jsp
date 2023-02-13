<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
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
				<a href="<%=request.getContextPath() %>/logout.do">${mem_nick } 님 로그아웃</a>
			</c:if>
			<a href="<%=request.getContextPath() %>/mypage.do">마이페이지</a>
		</div>
	</section>
</body>
</html>