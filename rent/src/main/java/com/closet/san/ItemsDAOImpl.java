package com.closet.san;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ItemsDAOImpl implements ItemsDAO {

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
	

}
