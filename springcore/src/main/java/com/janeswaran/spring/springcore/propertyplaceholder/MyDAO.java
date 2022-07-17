package com.janeswaran.spring.springcore.propertyplaceholder;

public class MyDAO {
	
	private String dbServer;
	private int dbPort;
	
	MyDAO(String dbServer, int dbPort){
		this.dbServer= dbServer;
		this.dbPort = dbPort;
	}

	@Override
	public String toString() {
		return "MyDAO [dbServer=" + dbServer + ", dbPort=" + dbPort + "]";
	}
	
	
}
