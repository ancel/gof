package com.demo.gof.adapter;

/*
 * 适配器模式主要用于后期维护修改
 */
public class AdapterTest {
	public static void main(String[] args) {
		Target t = new Adapter();
		t.request();
	}
}
