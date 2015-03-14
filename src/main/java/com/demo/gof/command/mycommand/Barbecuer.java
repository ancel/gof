package com.demo.gof.command.mycommand;

public class Barbecuer {
	
	private int muttonNum = 100;
	private int chickenWingNum = 100;
	
	public int getMuttonNum() {
		return muttonNum;
	}

	public void setMuttonNum(int muttonNum) {
		this.muttonNum = muttonNum;
	}

	public int getChickenWingNum() {
		return chickenWingNum;
	}

	public void setChickenWingNum(int chickenWingNum) {
		this.chickenWingNum = chickenWingNum;
	}

	public void bakeMutton(){
		System.out.println("烤羊肉串");
	}
	
	public void bakeChickenWing(){
		System.out.println("烤鸡翅");
	}
}
