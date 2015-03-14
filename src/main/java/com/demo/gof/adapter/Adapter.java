package com.demo.gof.adapter;

public class Adapter extends Target{
	
	private Adaptee adaptee = new Adaptee();
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
//		super.request();
		adaptee.specificRequest();
	}

}
