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
	<jsp:include page="../common/loginBtn.jsp"/>

	<section class="main_con">
		<img class="main_img" alt="" src="<%=request.getContextPath() %>/resources/img/eun/main.jpg">
		<jsp:include page="../common/menu.jsp"/>
	
		<hr>
		<h1 class="most_cate">인기 카테고리</h1>
		<hr>
		
		<div class="main_navi" id="common_navi">
			<ul>
				<li><a href="#">상의</a></li>
				<li><a href="#">하의</a></li>
				<li><a href="#">원피스</a></li>
				<li><a href="#">패션잡화</a></li>
			</ul>
		</div>

	</section>
	
</body>
</html>