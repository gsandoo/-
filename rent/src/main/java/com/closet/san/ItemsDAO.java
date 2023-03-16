package com.closet.san;

import java.util.List;

public interface ItemsDAO {
	String NAMESPACE = "ItemsDAO.";

	// 상품 등록
	public int itemsEnroll(ItemsDTO dto);
	
	
	public List<ItemsDTO> getItemsPaging(Criteria cri);
	public List<ItemsDTO> selectItemsList(int cate_code);

}
