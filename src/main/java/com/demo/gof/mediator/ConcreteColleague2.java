package com.demo.gof.mediator;

public class ConcreteColleague2 extends Colleague{

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
/*	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		mediator.send(message, this);
	}*/
	@Override
	public void notify(String message) {
		// TODO Auto-generated method stub
		System.out.println("colleague2 get message:"+message);
	}
}
