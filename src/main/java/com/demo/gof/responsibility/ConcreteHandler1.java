package com.demo.gof.responsibility;

public class ConcreteHandler1 extends Handler{


	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if(request>=0&request<10){
			super.handleRequest(request);
		}else{
			super.nextHandler(request);
		}
	}

}
