<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상세 글 페이지</h1>
	
		<table border="1">
		<tr>
			<th>작성자</th>
			<td>${dto.writer}</td>
		</tr>
		<tr>
			<th>글 제목</th>
			<td>${dto.bdTitle}</td>
		</tr>
		<tr>
			<th>글 내용</th>
			<td>
				<textarea rows="10" cols="60" readonly="readonly">
					${dto.content} 
				</textarea>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="right">
				<input type="button" value="수정" onclick="location.href='update.do?bdNum=${dto.bdNum}'">
				<input type="button" value="삭제" onclick="location.href=''">
				<input type="button" value="목록" onclick="location.href='list.do'">
			</td>
		</tr>
	</table>
		
</body>
</html>