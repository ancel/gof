package com.demo.gof.simple_factory;

public abstract class Operate {
	protected double numA;
	protected double numB;
	public abstract double getResult();
	public double getNumA() {
		return numA;
	}
	public void setNumA(double numA) {
		this.numA = numA;
	}
	public double getNumB() {
		return numB;
	}
	public void setNumB(double numB) {
		this.numB = numB;
	}
	
}
