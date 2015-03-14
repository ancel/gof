package com.demo.gof.combination;
/*
 * 人力资源部门，叶子节点
 */
public class HrDepartment extends Company{

	public HrDepartment(String name) {
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
		System.out.println(name+"员工招聘培训管理");
	}

}
