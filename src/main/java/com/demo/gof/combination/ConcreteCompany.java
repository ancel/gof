package com.demo.gof.combination;

import java.util.ArrayList;
import java.util.List;
/*
 * 具体公司，树枝节点
 */
public class ConcreteCompany extends Company{
	
	
	public ConcreteCompany(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private List<Company> children = new ArrayList<Company>();
	@Override
	public void add(Company c) {
		// TODO Auto-generated method stub
		children.add(c);
	}

	@Override
	public void remove(Company c) {
		// TODO Auto-generated method stub
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		super.display(depth);
		for (Company c : children) {
			c.display(depth+2);
		}
	}

	@Override
	public void lineOfDuty() {
		// TODO Auto-generated method stub
		for (Company c : children) {
			c.lineOfDuty();
		}
	}
	
	

}
