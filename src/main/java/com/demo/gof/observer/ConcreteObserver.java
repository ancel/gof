package com.demo.gof.observer;

public class ConcreteObserver extends Observer{

	public ConcreteObserver(String name, Subject subject) {
		super();
		this.name = name;
		this.subject = subject;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		observerState = subject.getSubjectState();
		System.out.println(name+"的状态是"+observerState);
		
	}
}
