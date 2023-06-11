package com.olTeam.mibuckit.test.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.olTeam.mibuckit.test.dto.TestPostManReq;
import com.olTeam.mibuckit.test.dto.TestPostManRes;

import lombok.RequiredArgsConstructor;

@Service("TestService")
@RequiredArgsConstructor
@Transactional
public class TestService {
	
	// private final SqlSessionTemplate sqlSession;
	
	public TestPostManRes testPostMan(TestPostManReq testPostManReq) {
		TestPostManRes testPostManRes = new TestPostManRes();
		// TestPostManRes testPostManRes = sqlSession.selectOne("User.retrieveUser", testPostManReq);
		return testPostManRes;
	}
}
