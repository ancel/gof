package com.demo.gof.prototype;

public class ConcretePrototype extends Prototype{

	@Override
	public Prototype myClone() {
		// TODO Auto-generated method stub
		ConcretePrototype cp = new ConcretePrototype();
		cp.setId(this.getId());
		Person p = new Person();
		p.setName(this.getPerson().getName());
		cp.setPerson(p);
		return cp;
	}

	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#clone()
	 * 浅复制
	 */
	@Override
	public Prototype clone(){
		// TODO Auto-generated method stub
		try {
			return (Prototype)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
}
