package com.demo.gof.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	private String subjectState;

	
	
	//增加观察者
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	
	//删除观察者
	public void detach(Observer observer){
		observers.remove(observer);
	}
	
	//通知
	public void nodify(){
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}
}
