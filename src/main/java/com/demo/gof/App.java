package com.demo.gof;

/**
 * Hello world!
 *
 */
public class App {
	
	/*
	 * 覆盖默认构造方法
	 */
	public App(String str){
		System.out.println(str);
	}
    public static void main( String[] args ){
    	new App("Hello World!");
        System.out.println( "Hello World!" );
    }
}
