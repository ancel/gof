package com.demo.gof.combination;
/*
 * 财务部门，叶子节点
 */
public class FinanceDepartment extends Company{

	public FinanceDepartment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Company c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Company c) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void lineOfDuty() {
		// TODO Auto-generated method stub
		System.out.println(name+"公司财务收支管理");
	}

}
