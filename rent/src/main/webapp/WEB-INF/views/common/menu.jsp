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
	<section class="menu_navi" id="common_navi">
		<ul>
			<li><a href="#">의류</a></li>
			<li><a href="share.do">셰어링</a></li>
			<li><a href="#">렌탈 안내</a></li>
			<c:if test="${empty mem_nick}" >
				<li><a href="<%=request.getContextPath() %>/join.do">회원가입</a></li>
			</c:if>
			<c:if test="${!empty mem_nick}" >
				<li><a href="<%=request.getContextPath() %>/mypage.do">마이페이지</a></li>
			</c:if>
		</ul>
	</section>
</body>
</html>