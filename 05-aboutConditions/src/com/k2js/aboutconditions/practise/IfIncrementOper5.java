//Requirement: To check double && conditio in if 

package com.k2js.aboutconditions.practise;

class IfElseAndCondition{
	
	public static void main(String...xxyy){
		System.out.println("I am inside main method");
		int i = 5;
		if(i++!5 && i++==6) //first condition is false, second will be check and true . Result true
			System.out.println("I am inside if condition "+ i);
		else if (i++==7) // program control wont come here
			System.out.println("I am inside else if condition"+ i);
		System.out.println("I am inside main method");
	}
}