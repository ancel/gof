package com.demo.gof.state;

public class SleepingState extends State{

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		System.out.println("现在是晚上"+w.getHour()+",该睡觉了");
	}

}
