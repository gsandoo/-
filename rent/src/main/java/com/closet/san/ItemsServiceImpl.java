package com.closet.san;

import java.util.List;

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
	public ItemsDTO priceHigh(int cate_code) {
		// TODO Auto-generated method stub
		return dao.priceHigh(cate_code);
	}



	@Override
	public List<ItemsDTO> bottomsList() {
		// TODO Auto-generated method stub
		return dao.bottomsList();
	}



	@Override
	public List<ItemsDTO> onepieceList() {
		// TODO Auto-generated method stub
		return dao.onepieceList();
	}



	@Override
	public List<ItemsDTO> accsList() {
		// TODO Auto-generated method stub
		return dao.accsList();
	}


	@Override
	public List<ItemsDTO> topsList() {
		// TODO Auto-generated method stub
		return dao.topsList();
	}
	
	/*페이징*/
	@Override
	public List<ItemsDTO> getItemsPaging(Criteria cri) {
		
		return dao.getItemsPaging(cri);
	}


	@Override
	public ItemsDTO priceLow(int cate_code) {
		// TODO Auto-generated method stub
		return dao.priceLow(cate_code);
	}

}
