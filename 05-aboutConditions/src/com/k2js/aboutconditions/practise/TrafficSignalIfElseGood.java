//Requirement : Take Red Green Orange input from user and print Stop, Ready, Go 

package com.k2js.aboutconditions.practise;

class TrafficSignalIfElseSelf{
	
	static void trafficIfElseSelf(String signal){
		if (signal.equals("RED"))
			System.out.println("STOP");
		else if (signal.equals("ORANGE"))
			System.out.println("READY");
		else if(signal.equals("GREEN"))
			System.out.println("Go");
		else 
			System.out.println("Invalid Input");
	}
}

class TrafficSignalIfElseSelfTest{
	
	public static void main(String...xxyy){
		TrafficSignalIfElseSelf.trafficIfElseSelf("ORANGE");		
	}
}