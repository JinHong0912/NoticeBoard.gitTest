package com.test.board.repository;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class DevBoardDao{

	@Autowired SqlSession session;
	
	final static String NAMESPACE = "mappers.DevBoardMapper";
	
	public Map<String,Object> selectDevBoardList(){
		return session.selectOne(NAMESPACE + ".selectDevBoardList");
	}
}
