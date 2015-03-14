package com.demo.gof.state;

public class Work {
	private double hour;
	private State currentState;
	private boolean taseFinished;


	public Work() {
		super();
		// TODO Auto-generated constructor stub
		currentState = new ForenoonState();
	}

	public boolean getTaseFinished() {
		return taseFinished;
	}

	public void setTaseFinished(boolean taseFinished) {
		this.taseFinished = taseFinished;
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	
	
	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public void writeProgram(){
		currentState.writeProgram(this);
	}
}
