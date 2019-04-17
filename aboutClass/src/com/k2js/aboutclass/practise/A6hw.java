//Requirement: To access local class 

package com.k2js.aboutclass.practise;

class A6hw{
	
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