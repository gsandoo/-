package com.closet.san;


import java.util.List;


public interface ItemsService {
	
	public int itemsEnroll(ItemsDTO dto);
	
	public List<ItemsDTO> selectItemsList(int cate_code);
	public List<ItemsDTO> getItemsPaging(Criteria cri);
	public int saveImage(ItemsDTO dto); 
	
	
}
