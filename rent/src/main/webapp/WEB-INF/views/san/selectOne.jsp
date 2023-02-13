<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" >
	function delete_ok(){
		var message = confirm("삭제 시 복구 불가 합니다. 삭제 하시겠습니까?")
		if(message){
			location.href='delete.do?bdNum=${dto.bdNum}';
			return true;
		}else{
			return false;
		};
	}
</script>	

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
				<input type="button" value="수정" onclick="location.href='update.do?bdNum=${dto.bdNum}'"/>
				<input type="button" class="del_button" value="삭제" onclick="delete_ok()" />
				<input type="button" value="목록" onclick="location.href='list.do'"/>
			</td>
		</tr>
	</table>
		
</body>
</html>