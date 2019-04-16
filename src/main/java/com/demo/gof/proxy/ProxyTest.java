package com.demo.gof.proxy;


//代理，调用代理的方法，帮被代理者做事儿
public class ProxyTest {
	public static void main(String[] args) {
		Pursuit gg = new Pursuit();
		gg.setName("锅锅");
		Girl mm = new Girl();
		mm.setName("美眉");
		Proxy p = new Proxy();
		p.setGg(gg);
		p.setMm(mm);
		p.giveDolls();
		p.giveFlowwers();
	}
}
