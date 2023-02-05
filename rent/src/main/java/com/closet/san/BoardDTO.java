package com.closet.san;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {
	
	private int bdNum;
	private String bdTitle;
	private String content;
	private String writer;
	private Date regDate;
	private int viewCount;

}
