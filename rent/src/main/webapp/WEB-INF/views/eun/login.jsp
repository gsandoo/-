<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="<%=request.getContextPath() %>/login_form.do">
		<table>
			<tr>
				<th>���̵�</th>
				<td><input type="text" name="mem_id"></td>
			</tr>
			
			<tr>
				<th>��й�ȣ</th>
				<td><input type="password" name="mem_pwd"></td>
			</tr>
			
			<tr>
				<td><button type="submit">�α���</button></td>
			</tr>
		</table>
	</form>
</body>
</html>