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
	<section>
		<div>
			<a href="<%=request.getContextPath() %>/join.do">ȸ������</a>
			<a href="<%=request.getContextPath() %>/list.do">������</a>
			<c:if test="${empty mem_nick}" >
				<a href="<%=request.getContextPath() %>/login.do">�α���</a>
			</c:if>
			<c:if test="${!empty mem_nick}" >
				<a href="<%=request.getContextPath() %>/logout.do">${mem_nick } �� �α׾ƿ�</a>
			</c:if>
			<a href="<%=request.getContextPath() %>/mypage.do">����������</a>
		</div>
	</section>
</body>
</html>