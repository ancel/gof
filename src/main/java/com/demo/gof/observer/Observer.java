package com.demo.gof.observer;

public abstract class Observer {
	protected String name;
	protected String observerState;
	protected Subject subject;
	public abstract void update();
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
}
