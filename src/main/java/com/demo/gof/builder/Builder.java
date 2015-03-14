package com.demo.gof.builder;

public abstract class Builder {
	protected Product p = new Product();
	public abstract void buildPartA();
	public abstract void buildPartB();
	public Product getResult(){
		return p;
	}
}
