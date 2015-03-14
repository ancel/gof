package com.demo.gof.command.mycommand;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Waiter {
	private List<Order> orders = new ArrayList<Order>();
	private Map<Class<? extends Barbecue>, Integer> store = BarbecueStore
			.getInstance().getStore();

	// 设置订单
	public void addOrder(Order order){
		Map<Class<? extends Barbecue>, Integer> orderData = order.getOrderData();
		for(Class<? extends Barbecue> clazz:orderData.keySet()){
			if(store.containsKey(clazz)){
				if(store.get(clazz)-orderData.get(clazz)>=0){
					store.put(clazz, store.get(clazz)+orderData.get(clazz));
					orders.add(order);
				}else{
					System.out.println("不够了");
				}
			}else{
				System.out.println("没存货");
			}
		}
	}

}
