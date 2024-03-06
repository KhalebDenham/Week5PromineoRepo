package com.promineotech;

public class SpacedLogger implements LoggerWeek5{

	@Override
	public void log(String log) { //implemented methods from interface LoggerWeek5
		String spacedWord = " ";
		for (int i = 0; i < log.length(); i++) {
			spacedWord += log.charAt(i) + " " ;
		} 
		System.out.println(spacedWord);
		
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		String spacedWord = " ";
		for (int i = 0; i < error.length(); i++) {
			spacedWord += error.charAt(i) + " " ;
		} 
		System.out.println("Error: " + spacedWord);

}
}