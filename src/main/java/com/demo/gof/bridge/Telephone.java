package com.demo.gof.bridge;

public abstract class Telephone {
	private Soft soft;

	public Soft getSoft() {
		return soft;
	}

	public void setSoft(Soft soft) {
		this.soft = soft;
	}
	public void run(){
		soft.run();
	}
}
