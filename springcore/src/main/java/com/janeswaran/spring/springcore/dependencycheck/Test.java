package com.janeswaran.spring.springcore.dependencycheck;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext pat = new ClassPathXmlApplicationContext("com/janeswaran/spring/springcore/dependencycheck/check-config.xml");
		Prescription idp = (Prescription) pat.getBean("meds"); 
//		Prescription idpn = (Prescription) pat.getBean("list"); 
		System.out.println(idp); 
//		System.out.println(idpn); 
		 
	}
}
