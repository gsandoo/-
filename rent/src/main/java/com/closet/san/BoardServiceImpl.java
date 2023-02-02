package com.closet.san;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
	@Inject
	private BoardDAO dao;
	@Override
	public List<BoardDTO> list() throws Exception{
		return dao.list();
		
	}
}
