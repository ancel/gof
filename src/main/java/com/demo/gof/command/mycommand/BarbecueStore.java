package com.demo.gof.command.mycommand;

import java.util.Map;

public class BarbecueStore {
	
	public static BarbecueStore barbecueStore;
	private Map<Class<? extends Barbecue>, Integer> store;
	
	public void updateStore(Class<? extends Barbecue> clazz, Integer count){
		if(store.containsKey(clazz)){
			store.put(clazz, store.get(clazz)+count);
		}else{
			store.put(clazz, count);
		}
	}

	public Map<Class<? extends Barbecue>, Integer> getStore() {
		return store;
	}

	public void setStore(Map<Class<? extends Barbecue>, Integer> store) {
		this.store = store;
	}
	
	public static BarbecueStore getInstance(){
		if(barbecueStore==null){
			barbecueStore = new BarbecueStore();
		}
		return barbecueStore;
	}
	
}
