package com.demo.gof.strategy;


//策略模式
public class StrategyTest {
	public static void main(String[] args) {
		Context context = new Context(new CashRebate("0.7"));
		System.out.println(context.getCash(400L));
		
		context = new Context(new CashReturn("300", "50"));
		System.out.println(context.getCash(800L));
	}
}
