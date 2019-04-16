package com.demo.gof.mediator;

/*
 * 中介者模式，调用用户自己的方法，中介帮你送达
 */
public class MediatorTest {
	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		
		ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
		ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
		
		mediator.setColleague1(colleague1);
		mediator.setColleague2(colleague2);
		
		colleague1.send("你吃过饭了没？");
		colleague2.send("没有呢，你打算请客？");
		colleague1.send("好啊，麦当劳走起");
		colleague2.send("gogogo");
	}
}
