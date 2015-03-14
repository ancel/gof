package com.demo.gof.visitor;

public class Woman extends Person{

	@Override
	public void accept(Action visitor) {
		// TODO Auto-generated method stub
		visitor.getWomanConclusion(this);
	}

}
