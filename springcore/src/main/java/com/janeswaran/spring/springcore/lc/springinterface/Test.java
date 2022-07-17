package com.janeswaran.spring.springcore.lc.springinterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext pat = new ClassPathXmlApplicationContext("com/janeswaran/spring/springcore/lc/springinterface/config.xml");
		Hpatient idp = (Hpatient) pat.getBean("springinterface"); //initiate method calling
		System.out.println(idp); 
		pat.registerShutdownHook(); //destroy method
	}
}
