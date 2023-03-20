package com.closet.san;

import java.util.Date;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemsDTO {
	
	/* 상품 id */
	private int items_id;
	
	/* 상품 이름 */
	private String items_name;
	
	/* 가격*/
	private int items_price;
	
	/*재고*/
	private int items_stock;
	
	/* 할인율*/
	private double items_discount;
	
	/*작성자*/
	private String writer;
	
	/*등록 날짜*/
	private Date reg_date;
	
	/* 변경 날짜*/
	private Date update_date;
	
	/* 상품 분류 */
	private int cate_code;
	
	/* 상품 설명*/
	private String items_content;

	/* 상품 이미지 */
	private MultipartFile items_img;
	
	/* 셰어링, MILC */
	private String sort;
	
	
}
