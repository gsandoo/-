package com.closet.san;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface ItemsService {
	
	public int itemsEnroll(ItemsDTO dto);
	
	public List<ItemsDTO> selectItemsList(int cate_code);
	public List<ItemsDTO> getItemsPaging(Criteria cri);
	public void saveImage(Map<String, Object> hmap) throws SQLException;
}
