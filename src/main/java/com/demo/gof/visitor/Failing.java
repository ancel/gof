package com.demo.gof.visitor;

public class Failing extends Action{

	@Override
	public void getManConclusion(Man man) {
		// TODO Auto-generated method stub
		System.out.println("男人失败时，喝闷酒");
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		// TODO Auto-generated method stub
		System.out.println("女人失败时，抱头痛哭");		
	}

}
