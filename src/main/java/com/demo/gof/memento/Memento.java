package com.demo.gof.memento;

/*
 * 备忘录
 */
public class Memento {
	private String state;

	public Memento(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
