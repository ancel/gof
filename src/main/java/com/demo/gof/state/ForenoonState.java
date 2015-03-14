package com.demo.gof.state;

public class ForenoonState extends State{

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getHour()<12){
			System.out.println("现在是早上"+w.getHour()+",精神百倍");
		}else{
			w.setCurrentState(new NoonState());
			w.writeProgram();
		}
	}

}
