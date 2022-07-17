package com.janeswaran.spring.springcore.constructorinjection;

public class Batch {
	
	private int syear;
	private int eyear;
	public int getSyear() {
		return syear;
	}
	public int getEyear() {
		return eyear;
	}
	public void setSyear(int syear) {
		this.syear = syear;
	}
	public void setEyear(int eyear) {
		this.eyear = eyear;
	}
	@Override
	public String toString() {
		return "Batch [syear=" + syear + ", eyear=" + eyear + "]";
	}
}
