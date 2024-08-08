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
	
	@Override
	public int wbInsert(WebBoardVO wbVO) {
	    int result = 0;

	    // wbNo가 0으로 설정된 상태에서 wbInsert를 호출하는 것이 맞다면 아래 설정 부분 제거
	    // wbVO.setWbNo(0);

	    // 실제 데이터베이스에 삽입을 시도합니다.
	    result = wbDAO.wbInsert(wbVO);

	    // 삽입이 성공적으로 이루어진 경우 result는 1 이상의 값을 가질 것입니다.
	    return result;
	}

}