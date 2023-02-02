package com.closet.san;

import java.util.List;

public interface BoardDAO {
	
	//게시판
	public List<BoardDTO> list() throws Exception;
}
