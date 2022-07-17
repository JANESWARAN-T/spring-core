package com.janeswaran.spring.springcore.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext stu = new ClassPathXmlApplicationContext("com/janeswaran/spring/springcore/ref/ref-config.xml");
		Student marks = (Student) stu.getBean("student");
		System.out.println(marks);
	}

}
