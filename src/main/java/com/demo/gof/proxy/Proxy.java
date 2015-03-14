package com.demo.gof.proxy;

public class Proxy implements GiveGift{
	
	
	
	Pursuit gg;
	Girl mm;
	
	
	public Girl getMm() {
		return mm;
	}


	public void setMm(Girl mm) {
		this.mm = mm;
		gg.setGirl(this.mm);
	}


	public Pursuit getGg() {
		return gg;
	}
	public void setGg(Pursuit gg) {
		this.gg = gg;
	}
	
	
	public void giveDolls() {
		// TODO Auto-generated method stub
		gg.giveDolls();
	}
	public void giveFlowwers() {
		// TODO Auto-generated method stub
		gg.giveFlowwers();
	}
	
}
