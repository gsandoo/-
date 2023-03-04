<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/eun/eun.css" />
</head>
<body>
	<section class="main_con">
		<img class="main_img" alt="" src="<%=request.getContextPath() %>/resources/img/eun/main.jpg">
		<jsp:include page="../common/menu.jsp"/>
	
		<hr>
		<h1>인기 카테고리</h1>
		<hr>
		
		<a href="#">상의</a>
		<a href="#">하의</a>
		<a href="#">원피스</a>
		<a href="#">악세서리</a>
	</section>
	
</body>
</html>