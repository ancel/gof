package com.demo.gof.state;

public class EveningState extends State{

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getTaseFinished()){
			w.setCurrentState(new RestState());
			w.writeProgram();
		}else{
			if(w.getHour()<21){
				System.out.println("现在是晚上"+w.getHour()+",疲惫至极");
			}else{
				w.setCurrentState(new SleepingState());
				w.writeProgram();
			}
		}
		
	}


}
