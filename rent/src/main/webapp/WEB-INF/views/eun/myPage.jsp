<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="mem_id" value="${mem_id }" readonly></td>
			</tr>
			
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="mem_pwd"></td>
			</tr>
			
			<tr>
				<td><button type="submit">로그인</button></td>
			</tr>
		</table>
		
</body>
</html>