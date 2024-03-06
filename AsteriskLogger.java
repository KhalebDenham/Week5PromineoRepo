package com.promineotech;

public class AsteriskLogger implements LoggerWeek5 {

	@Override
	public void log(String log) { //implemented methods from LoggerWeek5 interface
		// TODO Auto-generated method stub
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		System.out.println("****************" + "\nError: " + error +"***" + "\n****************");
	}

}
