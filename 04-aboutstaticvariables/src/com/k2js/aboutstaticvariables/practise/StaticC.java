//Requirement:more than one static block

package com.k2js.aboutstaticvariables.practise;

class C{
	
	static {
		System.out.println("I am the first static block: "+C.i);
	}

	static {
		System.out.println("I am second static block: "+C.i);
		System.out.println("I am the second static block: "+C.j);
	}		
	
	static int i = 2000;
	static int j = 1000;
	
	public static void main(String...xxyy){
		System.out.println("I am main: "+C.i);
		System.out.println("I am main: "+C.j);
	}
}