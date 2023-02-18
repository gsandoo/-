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
	<table border="1">
		<tr>
			<th width="50">번호</th>
			<th width="100">작성자</th>
			<th width="200">게시글 제목</th>
			<th width="100">게시글 날짜</th>
			<th width="50">조회수</th>
		</tr>	
		<c:forEach items="${list}" var="BoardDTO">
			<tr>
				<td>${BoardDTO.bdNum}</td>
				<td>${BoardDTO.writer}</td>
				<td><a href="one.do?bdNum=${BoardDTO.bdNum}">${BoardDTO.bdTitle}</a></td>
				<td>${BoardDTO.regDate}</td>
				<td>${BoardDTO.viewCount}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan = "5" align = "right">
				<input type="button" value="글쓰기" onclick="location.href='insert.do'">
			</td>
		</tr>
	</table>
</body>
</html>