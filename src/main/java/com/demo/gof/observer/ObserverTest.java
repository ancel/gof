package com.demo.gof.observer;

//观察者模式
public class ObserverTest {
	public static void main(String[] args) {
		Subject cs = new ConcreteSubject();
		cs.attach(new ConcreteObserver("X", cs));
		cs.attach(new ConcreteObserver("Y", cs));
		cs.attach(new ConcreteObserver("Z", cs));
		
		cs.setSubjectState("laile");
		cs.nodify();
	}
}
