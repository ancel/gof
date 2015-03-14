package com.demo.gof.responsibility;

public class ConcreteHandler3 extends Handler{


	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if(request>=20&request<30){
			super.handleRequest(request);
		}else{
			super.nextHandler(request);
		}
	}

}
