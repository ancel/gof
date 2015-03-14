package com.demo.gof.prototype;


//原型模式
public class PrototypeTest {
	public static void main(String[] args) {
		ConcretePrototype cp1 = new ConcretePrototype();
		cp1.setId(23);
		Person p = new Person();
		p.setName("asdfasd");	
		cp1.setPerson(p);

		System.out.println(cp1.myClone().getId());
		System.out.println(cp1.clone().getId());
		if(cp1==cp1.clone()){
			System.out.println("cp1=cp1.clone()");
		}else{
			System.out.println("cp1!=cp1.clone()");
			
		}
		if(cp1==cp1.myClone()){
			System.out.println("cp1==cp1.myClone()");
		}else{
			System.out.println("cp1!=cp1.myClone()");

		}
		
		if(cp1.getPerson()==cp1.clone().getPerson()){
			System.out.println("cp1.getPersonerson()==cp1.clone().getPerson()");
		}else{
			System.out.println("cp1.getPerson()!=cp1.clone().getPerson()");

		}
		
		if(cp1.getPerson()==cp1.myClone().getPerson()){
			System.out.println("cp1.getPerson()==cp1.myClone().getPerson()");
		}else{
			System.out.println("cp1.getPerson()!=cp1.myClone().getPerson()");
		}
	}
}
