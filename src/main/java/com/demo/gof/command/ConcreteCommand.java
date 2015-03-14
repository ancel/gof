package com.demo.gof.command;

public class ConcreteCommand extends Command{

	public ConcreteCommand(Receiver receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.action();
	}

}
