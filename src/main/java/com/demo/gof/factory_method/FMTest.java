package com.demo.gof.factory_method;

import com.demo.gof.simple_factory.Operate;

public class FMTest {
	public static void main(String[] args) {
		IFactory add = new AddFactory();
		Operate op = add.createOperate();
		op.setNumA(123L);
		op.setNumB(23L);
		System.out.println(op.getResult());
	}
}
