package com.closet.san;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

public interface ItemsDAO {
	String NAMESPACE = "ItemsDAO.";

	// 상품 등록
	public int itemsEnroll(ItemsDTO dto);
	
	
	public List<ItemsDTO> getItemsPaging(Criteria cri);
	public List<ItemsDTO> selectItemsList(int cate_code);
	public int shareItems(ItemsDTO dto, MultipartFile file) throws IllegalStateException, IOException; 

}
