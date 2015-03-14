package com.demo.gof.command.mycommand;

public abstract class BaubecueCommand {
	protected Barbecuer barbecuer;

	public BaubecueCommand(Barbecuer barbecuer) {
		this.barbecuer = barbecuer;
	}
	
	protected abstract void execCommand();

	public Barbecuer getBarbecuer() {
		return barbecuer;
	}

	public void setBarbecuer(Barbecuer barbecuer) {
		this.barbecuer = barbecuer;
	}
	
	
}
