package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DataBaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Database Fortune Service";
	}

}
