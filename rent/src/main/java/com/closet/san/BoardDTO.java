package com.closet.san;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {
	
	private int bdNum;
	private String bdTitle;
	private String content;
	private String writer;
	private String regDate;
	private int viewCount;

}
