package com.closet.san;

import java.util.List;

public interface ItemsService {
	
	public int itemsEnroll(ItemsDTO dto);
	public ItemsDTO priceHigh(int cate_code);
	public ItemsDTO priceLow(int cate_code);
	public List<ItemsDTO> topsList();
	public List<ItemsDTO> bottomsList();
	public List<ItemsDTO> onepieceList();
	public List<ItemsDTO> accsList();
	public List<ItemsDTO> getItemsPaging(Criteria cri);
}
