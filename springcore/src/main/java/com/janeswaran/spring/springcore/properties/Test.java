package com.janeswaran.spring.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext cl = new ClassPathXmlApplicationContext(
				"com/janeswaran/spring/springcore/properties/prop-config.xml");

		ConutryAndLanguages candl = (ConutryAndLanguages) cl.getBean("countryandlanguage");
		System.out.println(candl);

	}

}
