<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기</title>
</head>
<body>
	<form method="post" action="insertBoard.do">
		<table border="1">
			<tr>
				<th>제목</th>
				<td><input type="text" name="bdTitle"></td>
			</tr>
			
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer"></td>
			</tr>
			
			<tr>
				<th>내용</th>
				<td><input type="text" name="content"></td>
			</tr>
			
			
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="글쓰기"/>
					<input type="button" value="취소하기" onclick="location.href='list.do'"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>