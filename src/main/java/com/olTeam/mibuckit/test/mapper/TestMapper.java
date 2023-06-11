package com.olTeam.mibuckit.test.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.olTeam.mibuckit.test.dto.TestPostManReq;
import com.olTeam.mibuckit.test.dto.TestPostManRes;

@Mapper
public interface TestMapper {
	TestPostManRes retrieveUser(TestPostManReq testPostManReq);
}
