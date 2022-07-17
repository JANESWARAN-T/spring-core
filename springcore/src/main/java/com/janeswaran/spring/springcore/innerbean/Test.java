package com.janeswaran.spring.springcore.innerbean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext inner = new ClassPathXmlApplicationContext(
				"com/janeswaran/spring/springcore/innerbean/innerbean-config.xml");
		Employee get = (Employee) inner.getBean("employee");
		System.out.println(get);
		Employee get1 = (Employee) inner.getBean("employee");
		System.out.println(get1.hashCode());
	}

}
