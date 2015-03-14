package com.demo.gof.mediator;

public abstract class Colleague {
	protected Mediator mediator;

	public Colleague(Mediator mediator) {
		super();
		this.mediator = mediator;
	}
	
	public void send(String message) {
		// TODO Auto-generated method stub
		mediator.send(message, this);
	}
	public abstract void notify(String message);
}
