package com.demo.gof.command.mycommand;

//烤鸡翅
public class BakeChickenWing extends BaubecueCommand{

	public BakeChickenWing(Barbecuer barbecuer) {
		super(barbecuer);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void execCommand() {
		// TODO Auto-generated method stub
		barbecuer.bakeChickenWing();
	}

}
