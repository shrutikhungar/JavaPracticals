//Requirement:more than one static block

package com.k2js.aboutstaticvariables.practise;

class A{
	
	static {
		System.out.println("I am the first static block: "+A.i);
	}

	static int i = 2000;
	
	static {
		System.out.println("I am the second static block: "+A.i);
	}		
	
	
	public static void main(String...xxyy){
	}
}