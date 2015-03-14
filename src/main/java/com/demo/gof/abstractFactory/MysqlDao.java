package com.demo.gof.abstractFactory;

public class MysqlDao implements BaseDao{
	public void save(BaseEntity entity) {
		// TODO Auto-generated method stub
		System.out.println("mysql保存"+entity.getClass().getSimpleName());
	}

	public void update(BaseEntity entity) {
		// TODO Auto-generated method stub
		System.out.println("mysql更新"+entity.getClass().getSimpleName());		
	}
}
