package com.test.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.board.model.BoardVO;
import com.test.board.repository.BoardDao;
import com.test.board.service.BoardService;

@Controller
public class NewBoard {
	
	@Autowired BoardService boardService;
	
	@RequestMapping("home")
	public ModelAndView viewboardList(Model model , BoardVO bvo) {

		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("/Newboard");
		mav.addObject("List",);
		
		
		
		
		return mav;
		
	}
}
