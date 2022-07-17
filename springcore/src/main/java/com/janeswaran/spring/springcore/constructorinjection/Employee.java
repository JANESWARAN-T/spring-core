package com.janeswaran.spring.springcore.constructorinjection;

public class Employee {
	
	private int id;
	private Address addr;
	private Batch btc;
	
	Employee(int id, Address addr, Batch btc){
		this.id=id;
		this.addr=addr;
		this.btc=btc;
	}

	public int getId() {
		return id;
	}

	public Address getAddr() {
		return addr;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Address=" + addr + ", Batch=" + btc + "]";
	}



	

}
