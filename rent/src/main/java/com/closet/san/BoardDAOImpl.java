package com.closet.san;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static String namespace = "com.closet.san";
	
	//게시물 목록
	@Override
	public List<BoardDTO> list() throws Exception{
		return sqlSession.selectList( namespace+".list");
		
	}
	
}
