package com.janeswaran.spring.springcore.shopping;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext shp = new ClassPathXmlApplicationContext("com/janeswaran/spring/springcore/shopping/shop-config.xml");
		ShoppingCart detail = (ShoppingCart) shp.getBean("ShoppingCart");
		System.out.println(detail);
	}

}
