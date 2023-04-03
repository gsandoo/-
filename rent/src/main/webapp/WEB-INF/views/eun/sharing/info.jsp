<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="dto" value="${dto }"/>

	<section>
		
	</section>
	
		<form method="post" action="sharing.do" enctype="multipart/form-data">
			<div>상품 이미지 업로드</div>
			
			<input type="file" name="imgFile" >
			<div>상품명</div>
			<input type="text" name="items_name"/>
			<div>상품내용</div>
			<input type="text" name="items_content"/>
			<div>상품가격</div>
			<input type="number" name="items_price"/>
			<div>상품수량</div>
			<input type="text" name="items_name"/>
			<div>작성자</div>
			<input type="text" name="writer" value="작성자" readonly="readonly"/>
			<div>상품분류</div>
			<input type="radio" name="cate_code" value=1/>상의
			<input type="radio" name="cate_code" value=2/>하의
			<input type="radio" name="cate_code" value=3/>원피스
			<input type="radio" name="cate_code" value=4/>악세서리

			<input type="submit" value="제출"/> 
		</form>

<script type="text/javascript">
	function toBase64(event) {
		var reader = new FileReader();
		reader.readAsDataURL(event.target.files[0]);
		reader.onload = function(event) {
			var base64 = event.target.result;// img -> base64
		};
	}
</script>
</body>
</html>