package com.demo.gof.abstractFactory;

/**
 * 反射+抽象工厂调用操作
 * 
 * @author Administrator
 * 
 */
public class AbstractFactoryTest {

	public static void main(String[] args) throws Exception {

		// 最好将具体数据库的配置放入配置文件中去
		BaseDao db = DBFactory.createDBDao();
		User user = new User();
		db.save(user);
		Department de = new Department();
		db.update(de);

	}
}
