package com.demo.gof.responsibility;

public abstract class Handler {

	//继任者
	protected Handler successor;

	
	
	public Handler getSuccessor() {
		return successor;
	}

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

	public void handleRequest(int request){
		System.out.println(request+"被"+this.getClass().getSimpleName()+"处理了");
	}
	
	public void nextHandler(int request){
		if(successor!=null){
			successor.handleRequest(request);
		}else{
			System.out.println(request+"没人有权限处理");
		}
	}
}
