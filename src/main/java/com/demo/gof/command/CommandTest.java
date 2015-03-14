package com.demo.gof.command;

//命令模式
public class CommandTest {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		Invoker ik = new Invoker();
		
		ik.setCommand(command);
		ik.executeCommand();
		
	}
}
