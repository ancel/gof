package com.demo.gof;

import java.util.ArrayList;
import java.util.List;
/*
 * 测试当一个list重复放入一个引用时，会将前面放入的也修改
 */
public class TestList {
	class Person{
		private String name;
		

		public Person(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
	}
	
	public static void main(String[] args) {
		TestList tl = new TestList();
		List<Person> list = new ArrayList<Person>();
		Person p  = tl.new Person("xiaolong");
		list.add(p);
		p.setName("wanghb");
		list.add(p);
		p.setName("xuwei");
		list.add(p);
		
		for (Person person : list) {
			System.out.println(person.getName());
		}
	}
}
