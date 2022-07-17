package com.janeswaran.spring.springcore.shopping;

public class Item {

	private int id;
	private String name;
	private Double price;
	private int quat;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuat() {
		return quat;
	}

	public void setQuat(int quat) {
		this.quat = quat;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "$, quat=" + quat + "]";
	}
}
