package com.closet.san;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j;

@Service
public class ItemsServiceImpl implements ItemsService{

private static final Logger log = LoggerFactory.getLogger(BoardDAOImpl.class);

	
	@Autowired
	private ItemsDAO dao;
	
	@Override
	public int itemsEnroll(ItemsDTO dto) {
		// TODO Auto-generated method stub
		log.info("SERVICE ITEMS ENROLL");
		
		return dao.itemsEnroll(dto);
	}

	

	@Override
	public List<ItemsDTO> selectItemsList(int cate_code) {
		// TODO Auto-generated method stub
		return dao.selectItemsList(cate_code);
	}

	/*페이징*/
	@Override
	public List<ItemsDTO> getItemsPaging(Criteria cri) {
		
		return dao.getItemsPaging(cri);
	}
	
	
	@Override
	public void saveImage(Map<String, Object> hmap) throws SQLException {
	     dao.saveImage(hmap);
	}

}
