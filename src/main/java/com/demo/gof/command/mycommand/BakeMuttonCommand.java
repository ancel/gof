package com.demo.gof.command.mycommand;
//烤鸡翅命令
public class BakeMuttonCommand extends BaubecueCommand{

	public BakeMuttonCommand(Barbecuer barbecuer) {
		super(barbecuer);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void execCommand() {
		// TODO Auto-generated method stub
		barbecuer.bakeMutton();
	}

}
