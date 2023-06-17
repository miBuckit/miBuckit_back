package com.olTeam.mibuckit.test.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.olTeam.mibuckit.test.dto.TestInputReq;
import com.olTeam.mibuckit.test.dto.TestRetrieveReq;
import com.olTeam.mibuckit.test.dto.TestRetrieveRes;
import com.olTeam.mibuckit.test.dto.TestUpdateReq;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class TestService {
	
	private final SqlSessionTemplate sqlSession;
	
	/**
	 * @description : 
	 * @methodName : retrieveTest
	 * @author     : sjlee
	 * @date       : 2023. 6. 18.
	 * @param testPostManReq
	 * @return
	 */
	public TestRetrieveRes retrieveTest(TestRetrieveReq testRetrieveReq) {
		return sqlSession.selectOne("Test.retrieveTestNm", testRetrieveReq);
	}
	
	/**
	 * @description : 
	 * @methodName : InsertTest
	 * @author     : sjlee
	 * @date       : 2023. 6. 18.
	 * @param testInputReq
	 * @return
	 */
	public int InsertTest(TestInputReq testInputReq) {
		log.info("testInputReq" + testInputReq);
		return sqlSession.insert("Test.insertTestInfo", testInputReq);
	}

	/**
	 * @description : 
	 * @methodName : UpdateTest
	 * @author     : sjlee
	 * @date       : 2023. 6. 18.
	 * @param testUpdateReq
	 * @return
	 */
	public int UpdateTest(TestUpdateReq testUpdateReq) {
		return sqlSession.update("Test.updateTestInfo", testUpdateReq);
	}
}
