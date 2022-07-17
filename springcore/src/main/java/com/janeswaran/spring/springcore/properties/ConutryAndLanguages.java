package com.janeswaran.spring.springcore.properties;

import java.util.Properties;

public class ConutryAndLanguages {

	private Properties CandL;

	public Properties getCandL() {
		return CandL;
	}

	public void setCandL(Properties candL) {
		CandL = candL;
	}

	@Override
	public String toString() {
		return "ConutryAndLanguages [CandL=" + CandL + "]";
	}
}
