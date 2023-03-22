package com.closet.san;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface ItemsDAO {
	String NAMESPACE = "ItemsDAO.";

	// 상품 등록
	public int itemsEnroll(ItemsDTO dto);
	
	
	public List<ItemsDTO> getItemsPaging(Criteria cri);
	public List<ItemsDTO> selectItemsList(int cate_code);
	public int saveImage(ItemsDTO dto); 

}
