package com.promineotech;

public class AppWeek5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpacedLogger spacedLog = new SpacedLogger();
		AsteriskLogger asteriskLog = new AsteriskLogger();
		System.out.println("Spaced Log: Error - ");
		spacedLog.error("Father");
		System.out.println("Spaced Log: Log - ");
		spacedLog.log("Father");
		
		System.out.println("Asterisk Log: Error - ");
		asteriskLog.error("Father");
		
		System.out.println("Asterisk Log: Log - ");
		asteriskLog.log("Father");
	}

}
