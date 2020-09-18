package com.test.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.board.model.BoardVO;
import com.test.board.repository.BoardDao;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired BoardDao boardDao; 
	@Override
	public void setBoardContents(BoardVO bvo) {
		boardDao.setBoardContents(bvo);
		
	}

	
	//@Autowired BoardDao boardDao; 
	
//	public void setBoardContents(BoardVO bvo) {
//		// TODO Auto-generated method stub
//	//	boardDao.setBoardContents(bvo);
//		
		
	}
	
