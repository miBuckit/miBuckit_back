package com.olTeam.mibuckit.test.dto;

import com.olTeam.mibuckit.cmm.audit.Audit;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class TestInputReq extends Audit {
	private String testNm;
	private String testId;
	private String testPw;
}
