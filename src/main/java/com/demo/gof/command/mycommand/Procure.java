package com.demo.gof.command.mycommand;

import java.util.Map;

//采购
public class Procure {
	public void procure(Map<Class<? extends Barbecue>, Integer> store){
		BarbecueStore.getInstance().setStore(store);
	}
}
