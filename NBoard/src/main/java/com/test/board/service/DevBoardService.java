package com.test.board.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.board.repository.DevBoardDao;

@Service
public class DevBoardService{

	@Autowired
	DevBoardDao devBoardDao;
	
	public int test(int x, int y) {
		return x+y;
	}

	public Map<String,Object> selectDevBoardList(){
		return devBoardDao.selectDevBoardList();
	}
	
}
