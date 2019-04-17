//Requirement: To check if condition flow for increment operator

package com.k2js.aboutconditions.practise;

class A{
	
	public static void main(String...xxyy){
		int i=5;
		System.out.println("I am main method. i value is: "+i);
		if(i++==5) System.out.println("I am inside if. i value is: " + i);
		System.out.println("I am main method");
	}
}