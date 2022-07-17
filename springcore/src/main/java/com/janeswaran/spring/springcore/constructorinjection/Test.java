package com.janeswaran.spring.springcore.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cons = new ClassPathXmlApplicationContext("com/janeswaran/spring/springcore/constructorinjection/cons-config.xml");
		Employee Emp = (Employee) cons.getBean("emp");
		System.out.println(Emp);
//		Address adr= (Address) cons.getBean("address");
//		System.out.println(adr);
	}

}
