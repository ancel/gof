package com.demo.gof.visitor;

public class Success extends Action{

	@Override
	public void getManConclusion(Man man) {
		// TODO Auto-generated method stub
		System.out.println("if one man was success,he must have a good woman");
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		// TODO Auto-generated method stub
		System.out.println("if one woman was success,she must have a bad man");		
	}

}
