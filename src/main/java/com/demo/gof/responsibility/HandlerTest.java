package com.demo.gof.responsibility;

//责任链模式
public class HandlerTest {
	public static void main(String[] args) {
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		Handler h3 = new ConcreteHandler3();
		
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		
		int[] requests = {3,5,7,10,15,17,25,26,32,36};
		for (int i : requests) {
			h1.handleRequest(i);
		}
	
	}
}
