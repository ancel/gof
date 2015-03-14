package com.demo.gof.strategy;

/**
 * 打折
 * @author Administrator
 * 
 */
public class CashRebate extends CashSuper {

	private double moneyRebate = 1l;

	public CashRebate(String moneyRebate) {
		super();
		this.moneyRebate = Double.parseDouble(moneyRebate);
	}

	public double getMoneyRebate() {
		return moneyRebate;
	}

	public void setMoneyRebate(double moneyRebate) {
		this.moneyRebate = moneyRebate;
	}

	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		return money*this.moneyRebate;
	}

}
