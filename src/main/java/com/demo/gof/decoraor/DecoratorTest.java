package com.demo.gof.decoraor;


//装饰模式
public class DecoratorTest {
	public static void main(String[] args) {
		Person p = new Person("baby");
		TShirts shirt = new TShirts();
		Tie tie = new Tie();
		BigTrouser bt = new BigTrouser();
		
		
		shirt.decorate(p);
		tie.decorate(shirt);
		bt.decorate(tie);
		
		bt.show();
	}
}
