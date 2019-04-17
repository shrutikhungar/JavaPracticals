//Requirement: To access Interface elements through a class

package com.k2js.aboutclass.practise;

interface InterfaceAbstract{
	static int i=10;
	int j =20; //in interface variables are by default public static final
	
	static void m(){
		System.out.println("I am static method of interface");
	}
		
	default void n(){
		System.out.println("I am non-static method of interface");
	}
}

class InterfaceAbstractTest{
	
	public static void main(String...xxyy){
		System.out.println(InterfaceAbstract.i);
		System.out.println(InterfaceAbstract.j);
		InterfaceAbstract.m();
		new InterfaceAbstract(){}.n();
		
	}
}