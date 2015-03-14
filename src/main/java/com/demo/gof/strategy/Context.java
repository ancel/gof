package com.demo.gof.strategy;

public class Context {
	private CashSuper cash;

	public CashSuper getCash() {
		return cash;
	}

	public void setCash(CashSuper cash) {
		this.cash = cash;
	}

	public Context(CashSuper cash) {
		super();
		this.cash = cash;
	}
	
	public double getCash(double money){
		return cash.acceptCash(money);
	}
}
