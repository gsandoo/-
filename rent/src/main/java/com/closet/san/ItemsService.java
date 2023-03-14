package com.closet.san;

import java.util.List;

public interface ItemsService {
	
	public int itemsEnroll(ItemsDTO dto);
	
	public List<ItemsDTO> selectItemsList();
	public List<ItemsDTO> getItemsPaging(Criteria cri);
}
