package com.demo.gof.factory_method;

import com.demo.gof.simple_factory.Operate;
import com.demo.gof.simple_factory.OperateDiv;

public class DivFactory implements IFactory{

	public Operate createOperate() {
		// TODO Auto-generated method stub
		return new OperateDiv();
	}

}
