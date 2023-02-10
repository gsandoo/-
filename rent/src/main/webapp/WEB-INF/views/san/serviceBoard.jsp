<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/serviceBoard.css">

<meta charset="UTF-8">
<title>고객센터 게시판</title>
</head>
<body>
	<div class ="title">고객센터 게시판 목록</div>
	<div class = "table" >
		<div id = "board-menu">
			<div class="bdnum">번호</div>
			<div class="writer">작성자</div>
			<div class="bdtitle">게시글 제목</div>
			<div class="regDate">게시글 날짜</div>
			<div class="viewCount">조회수</div>
		</div>	
		<c:forEach items="${list}" var="BoardDTO">
			<div id = "board-content">
				<div class="bc-bdnum">${BoardDTO.bdNum}</div>
				<div class="bc-writer">${BoardDTO.writer}</div>
				<div class="bc-bdtitle"><a href="one.do?bdNum=${BoardDTO.bdNum}">${BoardDTO.bdTitle}</a></div>
				<div class="bc-regDate">${BoardDTO.regDate}</div>
				<div class="bc-viewCount">${BoardDTO.viewCount}</div>
			</div>
		</c:forEach>
		<div id="write">
			<div class ="write-space">
				<input class="write-btn" type="button" value="글쓰기" onclick="location.href='insert.do'">
			</div>
		</div>
	</div>
</body>
</html>