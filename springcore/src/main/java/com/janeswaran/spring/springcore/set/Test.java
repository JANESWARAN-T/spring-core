package com.janeswaran.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/janeswaran/spring/springcore/set/set-config.xml");
		
		Cardealer dealer = (Cardealer) context.getBean("cardealer");
		
		System.out.println("CarDealer Name: "+dealer.getName());
		System.out.println("Set of Models: "+dealer.getModel());
	}

}
