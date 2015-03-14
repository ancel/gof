package com.demo.gof.combination;
/*
 * 公司抽象类或接口
 */
public abstract class Company {
	protected String name;

	public Company(String name) {
		this.name = name;
	}
	public abstract void add(Company c);
	public abstract void remove(Company c);
	public void display(int depth){//depth深度
		printName(depth, name);
	}
	public abstract void lineOfDuty();//履行职责
	
	
	//打印名称
	protected void printName(int depth,String name){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < depth; i++) {
			sb.append("-");
		}
		sb.append(name);
		System.out.println(sb.toString());
	}
}
