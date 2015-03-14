package com.demo.gof.proxy;

public class Pursuit implements GiveGift{

	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Girl girl;
	
	public Girl getGirl() {
		return girl;
	}

	public void setGirl(Girl girl) {
		this.girl = girl;
	}

	public void giveDolls() {
		// TODO Auto-generated method stub
		System.out.println(name+"送"+girl.getName()+"洋娃娃");
	}

	public void giveFlowwers() {
		// TODO Auto-generated method stub
		System.out.println(name+"送"+girl.getName()+"花");
	}

}
