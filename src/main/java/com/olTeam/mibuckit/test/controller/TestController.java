package com.olTeam.mibuckit.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.olTeam.mibuckit.test.dto.TestInputReq;
import com.olTeam.mibuckit.test.dto.TestRetrieveReq;
import com.olTeam.mibuckit.test.dto.TestRetrieveRes;
import com.olTeam.mibuckit.test.dto.TestUpdateReq;
import com.olTeam.mibuckit.test.service.TestService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class TestController {
	
	private TestService testService;
	
	@GetMapping("/test/get")
	public TestRetrieveRes testGetMapping(TestRetrieveReq testPostManReq) {
		return testService.retrieveTest(testPostManReq);
	}
	
	@PostMapping("/test/post")
	public int InsertTest(@RequestBody TestInputReq testInputReq) {
		return testService.InsertTest(testInputReq);
	}

	@PutMapping("/test/put")
	public int UpdateTest(@RequestBody TestUpdateReq testUpdateReq) {
		return testService.UpdateTest(testUpdateReq);
	}
	
}

