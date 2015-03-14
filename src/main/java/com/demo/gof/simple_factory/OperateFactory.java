package com.demo.gof.simple_factory;


/*
 * 直接在枚举中定义操作方法比较好
 */
public class OperateFactory {
	public static Operate createOperate(Operator operator){
		switch (operator) {
		case add:
			return new OperateAdd();
		case sub:
			return new OperateSub();
		case mul:
			return new OperateMul();
		case div:
			return new OperateDiv();
		default:
			return null;
		}
	}
	
	public static Operate createOperatorByStr(String str){
		if(str.equals("+")){
			return createOperate(Operator.add);
		}
		if(str.equals("-")){
			return createOperate(Operator.sub);
		}
		if(str.equals("*")){
			return createOperate(Operator.mul);
		}
		if(str.equals("/")){
			return createOperate(Operator.div);
		}
		
		return null;
		
	}
}
