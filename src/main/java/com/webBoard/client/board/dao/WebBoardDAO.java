package com.webBoard.client.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.webBoard.client.board.vo.WebBoardVO;

@Mapper
public interface WebBoardDAO {
	public List<WebBoardVO> wbList(WebBoardVO wbVO);
	public int wbInsert(WebBoardVO wbVO);
}