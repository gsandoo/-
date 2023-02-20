package com.closet.san;

import java.util.List;



public interface BoardBiz {

	public List<BoardDTO> selectList();
	public BoardDTO selectOne(int bdNum);
	public int insert(BoardDTO dto);
	public int update(BoardDTO dto);
	public int delete(int bdNum);
	public int updateVisit(int writerid, BoardDTO dto);
	
	
}
