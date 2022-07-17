package com.janeswaran.spring.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext(
				"com/janeswaran/spring/springcore/list/list-config.xml");
		College dept = (College) cont.getBean("college");
		System.out.println("Type of College: " + dept.getName());
		System.out.println("List of Departments: " + dept.getDepts());
	}

}
