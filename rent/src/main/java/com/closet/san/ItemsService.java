package com.closet.san;


import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;


public interface ItemsService {
	
	public int itemsEnroll(ItemsDTO dto);
	
	public List<ItemsDTO> selectItemsList(int cate_code);
	public List<ItemsDTO> getItemsPaging(Criteria cri);
	public int shareItems(ItemsDTO dto,MultipartFile file) throws IllegalStateException, IOException; 
	
	
}
