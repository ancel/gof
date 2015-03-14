package com.demo.gof.state;

public class RestState extends State{

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		System.out.println("现在是晚上"+w.getHour()+",下班回家");
	}

}
