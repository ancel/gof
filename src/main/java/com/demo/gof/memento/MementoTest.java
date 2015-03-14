package com.demo.gof.memento;


//备忘录模式
public class MementoTest {
	public static void main(String[] args) {
		Originator o = new Originator();
		o.setState("on");
		o.show();
		
		//保存状态
		Caretaker c = new Caretaker();
		c.setMemento(o.createMemento());
		
		//修改状态
		o.setState("off");
		o.show();
		
		//重新读入状态
		o.setMemento(c.getMemento());
		o.show();
	}
}
