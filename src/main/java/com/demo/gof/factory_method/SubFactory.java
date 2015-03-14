package com.demo.gof.factory_method;

import com.demo.gof.simple_factory.Operate;
import com.demo.gof.simple_factory.OperateSub;

public class SubFactory implements IFactory{

	public Operate createOperate() {
		// TODO Auto-generated method stub
		return new OperateSub();
	}

}
