package com.closet.san;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ItemsDAOImpl implements ItemsDAO {
	private static final Logger log = LoggerFactory.getLogger(ItemsDAOImpl.class);

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public int itemsEnroll(ItemsDTO dto) {
		int res= 0;
		
		try {
			res = sqlSession.insert(NAMESPACE+"ItemsEnroll",dto);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return res;
		
	}

	@Override
	public List<ItemsDTO> getItemsPaging(Criteria cri) {
		int pageNum = cri.getPageNum();
		int amount = cri.getAmount();
		List<ItemsDTO> list = new ArrayList<ItemsDTO>();
		try {
			list=sqlSession.selectList(NAMESPACE + "selectList",pageNum );
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}		
		return list;
		
	}

	@Override
	public List<ItemsDTO> selectItemsList(int cate_code) {
		
		log.info("카테고리 페이지 이동");
		
		// TODO Auto-generated method stub
		List<ItemsDTO> list = new ArrayList<ItemsDTO>();
		try {
			list=sqlSession.selectList(NAMESPACE + "selectItemsList",cate_code); 
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return list;
	}
	
	@Override
	public void saveImage(Map<String, Object> hmap) throws SQLException {
	    sqlSession.insert(NAMESPACE +"saveImage",hmap);
	}
}
