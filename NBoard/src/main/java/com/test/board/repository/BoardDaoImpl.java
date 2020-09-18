package com.test.board.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.board.model.BoardVO;

@Repository
public class BoardDaoImpl implements BoardDao{

	@Autowired SqlSession session;
	
	final static String NAMESPACE = "mappers.BoardMapper";

	@Override
	public void setBoardContents(BoardVO bvo) {
		
		session.selectOne(NAMESPACE + ".setBoardContents", bvo);
	}
	
	
//	public void setBoardContents(BoardVO bvo) {
//		session.insert(NAMESPACE + ".setBoardContents", bvo);
//		
//	}

}
