<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정</title>
</head>
<body>
	<form method="post" action="updateBoard.do">
		<input type="hidden" name="bdNum" value="${dto.bdNum}" />
		<table border="1">
			<tr>
				<th>제목</th>
				<td><input type="text" name="bdTitle" placeholder="${dto.bdTitle}"></td>
			</tr>
			
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer" placeholder="${dto.writer}" readonly="readonly"></td>
			</tr>
			
			<tr>
				<th>내용</th>
				<td><input type="text" name="content" placeholder="${dto.content}"></td>
			</tr>
			
			
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="글 수정"/>
					<input type="button" value="취소하기" onclick="location.href='list.do'"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>