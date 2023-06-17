package com.olTeam.mibuckit.cmm.audit;

import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public abstract class Audit {
	private LocalDateTime dataInptDttm;
	private LocalDateTime dataUpdDttm;
}
