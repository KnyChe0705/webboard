package com.webBoard.client.board.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.webBoard.client.board.vo.WebBoardVO;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class WebBoardDAOTests {
	@Setter(onMethod_ = @Autowired)
	private WebBoardDAO wbDAO;
	
	
	/*
	@Test
	public void testwbList() {
		WebBoardVO wbVO = null;
		List<WebBoardVO> list = wbDAO.wbList(wbVO);
		for(WebBoardVO vo : list) {
			log.info(vo.toString());
		}
	}*/
}
