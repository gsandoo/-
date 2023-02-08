package com.closet.san;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardBizImpl implements BoardBiz {

	
	@Autowired
	private BoardDAO dao;
	
	
	@Override
	public List<BoardDTO> selectList() {
		// TODO Auto-generated method stub
		return dao.selectList();
	}
	
	@Override
	public BoardDTO selectOne(int bdNum) {
		// TODO Auto-generated method stub
		return dao.selectOne(bdNum);
	}

	@Override
	public int insert(BoardDTO dto) {
		// TODO Auto-generated method stub
		return dao.insert(dto);
	}


	@Override
	public int update(BoardDTO dto) {
		// TODO Auto-generated method stub
		return dao.update(dto);
	}

	@Override
	public int delete(int bdNum) {
		// TODO Auto-generated method stub
		return 0;
	}

	



}
