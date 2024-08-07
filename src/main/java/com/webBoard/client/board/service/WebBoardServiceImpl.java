package com.webBoard.client.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webBoard.client.board.dao.WebBoardDAO;
import com.webBoard.client.board.vo.WebBoardVO;

import lombok.Setter;

@Service
public class WebBoardServiceImpl implements WebBoardService {
	@Setter(onMethod_ = @Autowired)
	private WebBoardDAO wbDAO;
	
	@Override
	public List<WebBoardVO> wbList(WebBoardVO wbVO){
		List<WebBoardVO> list = null;
		list=wbDAO.wbList(wbVO);
		return list;
	}
}