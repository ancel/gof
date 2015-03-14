package com.demo.gof.responsibility;

public class ConcreteHandler2 extends Handler{



	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if(request>=10&request<20){
			super.handleRequest(request);
		}else{
			super.nextHandler(request);
		}
	}

}
