package com.demo.gof.state;

/*
 * 状态模式
 * 使用状态链
 */
public class StateTest {
	public static void main(String[] args) {
		Work w = new Work();
		w.setHour(9);
		w.writeProgram();
		w.setHour(12.5);
		w.writeProgram();
		w.setHour(14);
		w.writeProgram();
		w.setHour(18);
		w.writeProgram();
		//w.setTaseFinished(true);
		w.setHour(20);
		w.writeProgram();
		w.setHour(22);
		w.writeProgram();
	}
}
