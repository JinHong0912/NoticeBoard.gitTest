package com.test.board.controller.board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.board.service.DevBoardService;

@Controller
@RequestMapping("")
public class DevBoardController {
	
	@Autowired
	DevBoardService devBoardService;
	
	@RequestMapping("/board")
	public ModelAndView devBoard() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/board/devBoardList");
		
		return mv;
	}
	
//	@RequestMapping("/board")
//	public ModelAndView devBoard() {
//		ModelAndView mv = new ModelAndView();
//		List<Map<String,Object>> mapAll = new ArrayList<>();
//		Map<String,Object> mvo = new HashMap<>();
//		mvo.put("userid", "aaa");
//		mvo.put("test", "asd");
//		
//		
//		return mv;
//		
//	}
}
