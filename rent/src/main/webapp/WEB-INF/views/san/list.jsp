<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객센터 게시판</title>
</head>
<body>
	<form method="post" action="<%=request.getContextPath() %>/list_form.do">
		<table>
			<tr>
				<th>제목</th>
				<td><input type="text" name="bdTitle"></td>
			</tr>
			
			<tr>
				<th>내용</th>
				<td><input type="text" name="content"></td>
			</tr>
			
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer"></td>
			</tr>
			<tr>
				<td><button type="submit">가입하기</button></td>
			</tr>
		</table>
	</form>
</body>
</html>