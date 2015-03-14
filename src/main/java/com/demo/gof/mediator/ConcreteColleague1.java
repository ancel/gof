package com.demo.gof.mediator;

public class ConcreteColleague1 extends Colleague{

	public ConcreteColleague1(Mediator mediator) {
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
		System.out.println("colleague1 get message:"+message);
	}

}
