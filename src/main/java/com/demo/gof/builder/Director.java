package com.demo.gof.builder;

/*
 * 指挥者，保证建造稳定
 */
public class Director {
	public void construct(Builder builder){
		builder.buildPartA();
		builder.buildPartB();
	}
}
