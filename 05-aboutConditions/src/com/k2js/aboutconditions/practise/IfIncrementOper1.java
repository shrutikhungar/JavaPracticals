//Requirement: To check if else condition flow for increment operator

package com.k2js.aboutconditions.practise;

class IfElseFlow{
	
	public static void main(String...xxyy){
		System.out.println("I am main starting");
		int i=5;
		if (i++==5)
			if (i++==5)
				System.out.println("I am inner if: "+i);
			else 
				System.out.println("I am inner else: "+i);
		System.out.println("I am main ending: "+i);
	}
}