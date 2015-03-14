package com.demo.gof.flyweight;

/**
 * 享元模式
 * @author admin
 *
 */
public class FlyweightTest {
	public static void main(String[] args) {
		Integer a = 12;
		Integer b = 12;
		System.out.println(a == b);

		a = 13;
		//修改一个不会对另一个产生印象
		System.out.println(b);
		
		// 不超过127时若是常量池存在该数字，则引用指向第一次创建该数字的实例，
		// 超过之后引用指向的实例任何时候都会重新创建
		a = 128;
		b = 128;
		System.out.println(a == b);

	}
}
