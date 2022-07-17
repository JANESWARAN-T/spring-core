package com.janeswaran.spring.springcore.lc.springinterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hpatient implements InitializingBean,DisposableBean {
	private int id;
	private String name;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void Hola() {
		System.out.println("Inside Hola");
	}
	public void Tata() {
		System.out.println("Inside Tata");
	}

	@Override
	public String toString() {
		return "Hpatient [id=" + id + " name="+ name+ "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy()");
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
