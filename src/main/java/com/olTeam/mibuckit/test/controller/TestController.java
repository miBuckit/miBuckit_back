package com.olTeam.mibuckit.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.olTeam.mibuckit.test.dto.TestPostManReq;
import com.olTeam.mibuckit.test.dto.TestPostManRes;
import com.olTeam.mibuckit.test.service.TestService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class TestController {
	
	private TestService testService;
	
	@GetMapping("/test/post")
	public TestPostManRes testPostMan(@RequestBody TestPostManReq testPostManReq) {
		return testService.testPostMan(testPostManReq);
	}

	@GetMapping("/test/axios")
	public String testAxios() {
		return "test suc";
	}
}
