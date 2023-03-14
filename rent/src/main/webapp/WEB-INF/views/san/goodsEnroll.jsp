<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품등록 화면</title>
 <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/serviceBoard.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
	<div class ="title">${writer}님의 옷장을 공유해주세요</div>
	<div>
		<form action="goodsEnroll.do" method="post" enctype="multipart/form-data" >
			<div>
				<div>
					<div>
						<label>상품 사진을 등록해주세요</label>
					</div>
					<!-- 여기 이미지 input 넣어주세요 -->
					<div class="items_img">
						<input type="file" multiple="multiple" id ="fileItem" name='uploadFile' style="height: 30px;">	
					</div>
				</div>			
				<div>
					<div>
						<label>상품명</label>
					</div>
					<input name="items_name" type="text"/>
				</div>
			</div>
			<div>
				<div>
					<div>
						<label>상품 설명</label>
					</div>
					<input name="items_content" type="text"/>
				</div>
			</div>	
			<div>
				<div>
					<div>
						<label>상품가격</label>
					</div>
					<input name="items_price" type="number"/>
					<span>원</span>
				</div>
			</div>
			<div>
				<div>
					<div>
						<label>재고</label>
					</div>
					<input name="items_stock" min="1" maxlength="10" type="number"/>
				</div>
			</div>
			<div>
				<div>
					<div>
						<label>할인율</label>
					</div>
					<input name="items_discount"  type="number"/>
				</div>
			</div>
			<div>
				<div>
					<div>
						<label>작성자</label>
					</div>
					<input type="text" name="writer"  value="${writer}" readonly="readonly">
				</div>
			</div>
			<div>
				<div>
					<div>
						<label>상품분류</label>
					</div>
					<span>
						<input type="checkbox" name="cate_code" value="1">상의
						<input type="checkbox" name="cate_code" value="2">하의
						<input type="checkbox" name="cate_code" value="3">원피스						
						<input type="checkbox" name="cate_code" value="4">잡화
					
					</span>	
				
				</div>
			</div>		
			<div>
				<input type="submit" value="클로젯 공유 하기"/>
				<input type="button" value="취소하기" onclick="location.href='list.do'"/>
			</div>
		</form>
		
	</div>
	
	<script>
	/* 이미지 업로드 */
	/* $("input[type='file']").on("change", function(e){
		
		let formData = new FormData();
		let fileInput = $('input[name="uploadFile"]');
		let fileList = fileInput[0].files;
		let fileObj = fileList[0];

		console.log("fileObj : " + fileObj);
		console.log("fileName : " + fileObj.name);
		console.log("fileSize : " + fileObj.size);
		console.log("fileType(MimeType) : " + fileObj.type);
		console.log("fileList : " + fileList);

		if(!fileCheck(fileObj.name, fileObj.size)){
			return false;
		}*/
		/*append(key,value)값 - key는 input file 태그의 name 과 일치해야 함*/
		/* for(let i = 0; i < fileList.length; i++){
			formData.append("uploadFile", fileList[i]);
		}
		
		console.log("formData : " + formData);

		$.ajax({
			url: 'uploadAjaxAction.do',
	    	processData : false,
	    	contentType : false,
	    	data : formData,
	    	type : 'POST',
	    	dataType : 'json',
	    	success: function(result){
	    		console.log("성공");
	    	},
	    	error: function(result){
	    		console.log("실패");
	    	}
		});	
	}); */
	
	/*jpg,png 만 허용*/
	/* var, method related with attachFile */
	/* let regex = new RegExp("(.*?)\.(jpg|png)$"); 
	let maxSize = 1048576; //1MB	
	
	function fileCheck(fileName, fileSize){

		if(fileSize >= maxSize){
			alert("파일 사이즈 초과");
			return false;
		}
			  
		if(!regex.test(fileName)){
			alert("해당 종류의 파일은 업로드할 수 없습니다.");
			return false;
		}
		
		return true;		
		
	} */
	</script> 
		
</body>
</html>