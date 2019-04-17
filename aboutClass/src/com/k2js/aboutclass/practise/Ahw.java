//requirement: To create class with static and non static variable, static and non static blocks

package com.k2js.aboutclass.practise;

class Ahw{
	static int i = 10;
	int j =20;
	
	static {
		System.out.println("I am a static block of outer class.");
	}
	{
		System.out.println("I am a non-static block of outer class.");
	}
}

class AhwTest{
	public static void main(String...xxyy){
		System.out.println(Ahw.i);
		System.out.println(new Ahw().j);
	}
}