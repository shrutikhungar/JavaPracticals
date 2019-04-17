//Requirement: To access static and non static methods of outer class

package com.k2js.aboutclass.practise;

class A5hw{
	static void m(){
		System.out.println("I am a static method of outer class");
	}
	
	void n(){
		System.out.println("I am a non-static method of outer class");
	}
}

class A5hwTest{
	public static void main(String...xxyy){
		A5hw.m();
		new A5hw().n();
	}
}