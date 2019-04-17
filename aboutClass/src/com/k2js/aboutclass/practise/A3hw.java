//Requirement: To access constructor from a outer class 

package com.k2js.aboutclass.practise;

class A3hw{
	A3hw(){
		System.out.println("I am a constructor of outer class");
	}
}

class A3hwTest{
	public static void main(String...xxyy){
		System.out.println(new A3hw());
	}
}