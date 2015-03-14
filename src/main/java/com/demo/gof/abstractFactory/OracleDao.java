package com.demo.gof.abstractFactory;

public class OracleDao implements BaseDao{

	public void save(BaseEntity entity) {
		// TODO Auto-generated method stub
		System.out.println("Oracle保存"+entity.getClass().getSimpleName());
	}

	public void update(BaseEntity entity) {
		// TODO Auto-generated method stub
		System.out.println("Oracle更新"+entity.getClass().getSimpleName());		
	}

}
