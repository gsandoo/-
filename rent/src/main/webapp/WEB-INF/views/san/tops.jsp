<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/san/category.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상의 페이지</h1>
	<c:set var="list" value="${ItemsDTO}"/>
	<div id="filter">
		<button class="filter-btn" >필터</button>
		<form class="filter-visible">
			<button id="price-high"class="fil-btn" onclick="location.href='high.do?cate_code=${ItemsDTO.cate_code}'">
				 가격 높은 순	
			</button>
			<button id="price-low" class="fil-btn" onclick="location.href='low.do?cate_code=${list.cate_code}'">
				가격 낮은 순
			</button>
			<button id="view-count" class="fil-btn" onclick="location.href='view.do?cate_code=${list.cate_code}'">
				조회수 높은 순
			</button>
		</form>
	</div>
		<div class="items-block">
			<div class="itemsspot">
				<c:forEach items="${list}" var="ItemsDTO" begin="0" end="2">
					<div class="items">
						<div>${ItemsDTO.items_name}</div>
						<div>${ItemsDTO.items_content}</div>
						<div>${ItemsDTO.writer}</div>
						<div>${ItemsDTO.items_price}</div>
					</div>			
				</c:forEach>
			</div>
		</div>
		<div class="items-block">
			<div class="itemsspot">
				<c:forEach items="${list}" var="ItemsDTO" begin="3" end="5">
					<div class="items">
						<div>${ItemsDTO.items_name}</div>
						<div>${ItemsDTO.items_content}</div>
						<div>${ItemsDTO.writer}</div>
						<div>${ItemsDTO.items_price}</div>
					</div>			
				</c:forEach>
			</div>
		</div>
		<div class="items-block">
			<div class="itemsspot">
				<c:forEach items="${list}" var="ItemsDTO" begin="6" end="8">
					<div class="items">
						<div>${ItemsDTO.items_name}</div>
						<div>${ItemsDTO.items_content}</div>
						<div>${ItemsDTO.writer}</div>
						<div>${ItemsDTO.items_price}</div>
					</div>			
				</c:forEach>
			</div>
		</div>
	
	<a href="more.do">더보기</a>
	
	<script>
		$(document).ready(function () {
		  $(".filter-btn").click(function () {
		    $(".filter").css("height", '20%' );
		    $(".filter-visible").css("visibility", 'visible' );
		  });
		  
		});
	
	</script>
</body>
</html>