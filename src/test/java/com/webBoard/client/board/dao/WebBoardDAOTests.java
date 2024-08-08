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
	
	@Test
	public void testwbInsert() {
		WebBoardVO webboard = new WebBoardVO();
		webboard.setWbName("등록관리자");
		webboard.setWbTitle("등록 테스트 진행중");
		webboard.setWbContent("등록 테스트 진행중 입니다.");
		
		int count = wbDAO.wbInsert(webboard);
		log.info("입력된 행의 수: " + count);
	}
}
