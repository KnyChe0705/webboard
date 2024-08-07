package com.webBoard.client.board.vo;

import lombok.Data;

@Data
public class WebBoardVO {
	private int wbNo;
	private String wbName;
	private String wbTitle;
	private String wbContent;
	private String wbPwd;
	private String wbDate;
	private int wbReadcnt;
}