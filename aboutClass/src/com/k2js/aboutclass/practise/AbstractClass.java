//Requirement: To access abstract class elements through a class

package com.k2js.aboutclass.practise;

abstract class AbstractClassExample{
	
	static int i=10;
	int j =20; 
	
	static void m(){
		System.out.println("I am static method of abstract class");
	}
		
	void n(){
		System.out.println("I am non-static method of abstract class");
	}
}

class AbstractClassExampleTest{
	
	public static void main(String...xxyy){
		System.out.println(AbstractClassExample.i);
		System.out.println(new AbstractClassExample(){}.j);
		AbstractClassExample.m();
		new AbstractClassExample(){}.n();
	}
}