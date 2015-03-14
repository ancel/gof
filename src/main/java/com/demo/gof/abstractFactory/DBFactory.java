package com.demo.gof.abstractFactory;

public abstract class DBFactory {
	public static final String PACKAGE_URL = "com.demo.gof.abstractFactory" ;
	public static final String DB_DAO = "MysqlDao";
	
	public static BaseDao createDBDao() throws Exception{
		return (BaseDao)Class.forName(PACKAGE_URL+"."+DB_DAO).newInstance();
	}
}
