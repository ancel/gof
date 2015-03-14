package com.demo.gof.command.mycommand;

import java.util.Map;

public class Order {
	private int id;
	private Map<Class<? extends Barbecue>, Integer> orderData;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<Class<? extends Barbecue>, Integer> getOrderData() {
		return orderData;
	}

	public void setOrderData(Map<Class<? extends Barbecue>, Integer> orderData) {
		this.orderData = orderData;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderData=" + orderData + "]";
	}



	
}
