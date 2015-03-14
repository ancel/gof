package com.demo.gof.command.mycommand;

public abstract class Barbecue {
	protected int barbecueNum;

	public int getBarbecueNum() {
		return barbecueNum;
	}

	public void setBarbecueNum(int barbecueNum) {
		this.barbecueNum = barbecueNum;
	}

	public Barbecue(int barbecueNum) {
		super();
		this.barbecueNum = barbecueNum;
	}
	
}
