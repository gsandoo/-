package com.closet.san;

import java.util.List;

public interface ItemsDAO {
	String NAMESPACE = "ItemsDAO.";

	// 상품 등록
	public int itemsEnroll(ItemsDTO dto);
	
	
	
	public List<ItemsDTO> getItemsPaging(Criteria cri);
	public List<ItemsDTO> topsList();
	public List<ItemsDTO> bottomsList();
	public List<ItemsDTO> onepieceList();
	public List<ItemsDTO> accsList();

	public ItemsDTO priceHigh(int cate_code);
	public ItemsDTO priceLow(int cate_code);

}
