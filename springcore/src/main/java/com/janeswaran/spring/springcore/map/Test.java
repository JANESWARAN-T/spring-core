package com.janeswaran.spring.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Janeswaran
 *
 */
public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext text = new ClassPathXmlApplicationContext("com/janeswaran/spring/springcore/map/map-config.xml");
		
		Customer custom = (Customer) text.getBean("customer");
		System.out.println(custom);
	}

}
