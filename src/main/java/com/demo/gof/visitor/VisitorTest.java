package com.demo.gof.visitor;

public class VisitorTest {
	public static void main(String[] args) {
		ObjectStructure os = new ObjectStructure();
		os.attach(new Man());
		os.attach(new Woman());
		
		Success s = new Success();
		os.display(s);
		
		Failing f = new Failing();
		os.display(f);
		
	}
}
