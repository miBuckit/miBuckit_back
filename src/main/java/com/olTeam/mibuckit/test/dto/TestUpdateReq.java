package com.olTeam.mibuckit.test.dto;

import com.olTeam.mibuckit.cmm.audit.Audit;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class TestUpdateReq extends Audit {
	private int testId;
	private String testNm;
	private String testPw;
}
