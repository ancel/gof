package com.demo.gof.prototype;

public abstract class Prototype   implements Cloneable{
	private int id;
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public abstract Prototype myClone();
}
