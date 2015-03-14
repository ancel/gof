package com.demo.gof.state;

public class AfterNoonState extends State{

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getHour()<17){
			System.out.println("现在是下午"+w.getHour()+",状态不错，继续努力");
		}else{
			w.setCurrentState(new EveningState());
			w.writeProgram();
		}
	}


}
