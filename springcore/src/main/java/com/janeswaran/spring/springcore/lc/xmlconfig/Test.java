package com.janeswaran.spring.springcore.lc.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext pat = new ClassPathXmlApplicationContext("com/janeswaran/spring/springcore/lc/xmlconfig/xml-config.xml");
		Patient idp = (Patient) pat.getBean("lcm1"); //initiate method calling
		System.out.println(idp); 
		pat.registerShutdownHook(); //destroy method
	}

}
