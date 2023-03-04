package com.closet.san;

public interface ItemsDAO {
	String NAMESPACE = "ItemsDAO.";

	// 상품 등록
	public int itemsEnroll(ItemsDTO dto);
	
	
}
