//Requirement:

package com.k2js.aboutstaticvariables.practise;

class A{
	
	static{
		System.out.println("I am a static block. "+A.i);
	}
	static int i=1000;
	
	public static void main(String...xxyy){
		System.out.println("I am a main method. "+A.i);
	}
}