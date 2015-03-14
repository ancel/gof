package com.demo.gof.state;

public class NoonState extends State{

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getHour()<13){
			System.out.println("现在是中午"+w.getHour()+",饿了");
		}else{
			w.setCurrentState(new AfterNoonState());
			w.writeProgram();
		}
	}


}
