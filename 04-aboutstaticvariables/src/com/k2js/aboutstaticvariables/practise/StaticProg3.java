//Requirement: To find whether the number of sum is even or odd

package com.k2js.aboutstaticvariables.practise;

class H_1{
	static Number n =154;
}

interface I_1{
	Comparable c=224;
}

class H_I_1{
	
	static String m(){
		String evenOdd;
		int sum =(Integer)H_1.n%10+(Integer)I_1.c%10;	
		evenOdd=(sum%2)==0?"even":"odd";
		return evenOdd;
	}
}

class H_I_1_Test{
	
	public static void main(String...xxyy){
		String evenOdd=H_I_1.m();
		System.out.println("Number is" " + evenOdd);
	}
}