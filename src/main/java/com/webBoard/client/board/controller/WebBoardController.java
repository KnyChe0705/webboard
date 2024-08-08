package com.webBoard.client.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.webBoard.client.board.service.WebBoardService;
import com.webBoard.client.board.vo.WebBoardVO;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/webboard")
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

    @GetMapping("/wbWriteForm")
    public String wbWriteForm() {
        log.info("wbWriteForm 호출 성공");

        return "client/webboard/wbWriteForm";
    }

    @PostMapping("/wbInsert")
    public String wbInsert(WebBoardVO wbVO, RedirectAttributes ras) {
        log.info("wbInsert 호출 성공");

        int result = 0;
        String url = "";

        result = wbService.wbInsert(wbVO);
        if (result == 1) {
            url = "/webboard/wbList";
        } else {
            ras.addFlashAttribute("errorMsg", "입력에 문제가 있어 다시 진행해 주세요");
            url = "/webboard/wbWriteForm";
        }
        return "redirect:" + url;
    }
}