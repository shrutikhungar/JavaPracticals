//Requirement: To access local class 

package com.k2js.aboutclass.practise;

class A6hw{
	
	int i = 10;
	static j = 20;
	
	static{
		System.out.println("I am a static block of outer class");
	}
	
	static{
		System.out.println("I am a static block of outer class");
	}
	
	static void m(){
		System.out.println("I am a static method of outer class");
	}
	
	static void m(){
		
		class InnerLocalA6hw{
			
			void m(){
				System.out.println("I am a method of local class");
			}
			final static int i = 10;
			int j = 20;			
		}
		System.out.println(InnerLocalA6hw.i);
		System.out.println(new InnerLocalA6hw().j);
		new InnerLocalA6hw().m();
	}
}

class A6hwTest{
	
	public static void main(String...xxyy){
			A6hw.m();			
	}
}