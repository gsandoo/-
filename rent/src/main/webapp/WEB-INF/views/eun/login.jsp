<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="<%=request.getContextPath() %>/login_form.do">
		<table>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="mem_id"></td>
			</tr>
			
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="mem_pwd"></td>
			</tr>
			
			<tr>
				<td><button type="submit">로그인</button></td>
			</tr>
		</table>
	</form>
</body>
</html>