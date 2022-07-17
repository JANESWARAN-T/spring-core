package com.janeswaran.spring.springcore.propertyplaceholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext path = new ClassPathXmlApplicationContext("com/janeswaran/spring/springcore/propertyplaceholder/prop-file.xml");
		MyDAO var = (MyDAO) path.getBean("dao");
		System.out.println(var);
	}
	
}
