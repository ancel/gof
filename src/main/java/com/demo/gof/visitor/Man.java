package com.demo.gof.visitor;

public class Man extends Person{

	@Override
	public void accept(Action visitor) {
		// TODO Auto-generated method stub
		visitor.getManConclusion(this);
	}

}
