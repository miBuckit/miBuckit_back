package com.olTeam.mibuckit.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.olTeam.mibuckit.test.dto.TestPostManReq;
import com.olTeam.mibuckit.test.dto.TestPostManRes;

@RestController
public class TestController {
	
	@GetMapping("/test/post")
	public TestPostManRes testPostMan(@RequestBody TestPostManReq testPostManReq) {
		TestPostManRes testPostManRes = new TestPostManRes();
		testPostManRes.setId("test");
		testPostManRes.setName("ehoh01");
		testPostManRes.setTlno(testPostManReq.getTlno());
		return testPostManRes;
	}
}
