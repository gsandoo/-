package com.closet.san;

import java.util.List;

import com.closet.eun.MemberDTO;

public interface BoardDAO {
	
	String NAMESPACE = "BoardDAO.";
	
	
	
	// 게시판 글 가져오기
	public List<BoardDTO> selectList();
	
	// 게시판 글 상세보기
	public BoardDTO selectOne(int bdNum);
	public int insert(BoardDTO dto);
	public int update(BoardDTO dto);
	public int updateVisit(int num, BoardDTO dto);
	public int delete(int bdNum);
}
