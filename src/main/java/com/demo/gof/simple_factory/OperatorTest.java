package com.demo.gof.simple_factory;


//简单工厂
public class OperatorTest {
	public static void main(String[] args) {
		Operate op = OperateFactory.createOperatorByStr("+");
		op.setNumA(60);
		op.setNumB(19.12);
		System.out.println(op.getResult());
	}
}
