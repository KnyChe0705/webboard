package com.webBoard.client.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webBoard.client.board.service.WebBoardService;
import com.webBoard.client.board.vo.WebBoardVO;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;



@Controller
@RequestMapping("/webboard/*")
@Slf4j
public class WebBoardController {
	@Setter(onMethod_ = @Autowired)
	private WebBoardService wbService;
	
	
	@GetMapping("/wbList")
	public String wbList(@ModelAttribute WebBoardVO wbVO, Model model) {
		log.info("wbList 호출 성공");
		
		List<WebBoardVO> wbList = wbService.wbList(wbVO);
		model.addAttribute("wbList", wbList);
		
		return "client/webboard/wbList";
	}
}
