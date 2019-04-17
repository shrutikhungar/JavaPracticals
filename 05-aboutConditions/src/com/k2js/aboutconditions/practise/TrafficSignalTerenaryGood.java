//Requirement : Take Red Green Orange input from user and print Stop, Ready, Go using terenary operator

package com.k2js.aboutconditions.practise;

class TrafficSignalTerenarySelf{
	
	static void trafficTerenarySelf(String signal){
		String result=(signal.equals("RED"))?"STOP"
			:(signal.equals("ORANGE"))?"READY":(signal.equals("GREEN"))?"Go":"INVALID INPUT";
		System.out.println(result);
	}
}

class TrafficSignalTerenarySelfTest{
	
	public static void main(String...xxyy){
		TrafficSignalTerenarySelf.trafficTerenarySelf("GREEN");
	}
}