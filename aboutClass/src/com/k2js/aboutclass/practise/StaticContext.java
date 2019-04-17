//Requirement: To include all various possible static elements in a class

package com.k2js.aboutclass.practise;

//import

class StaticContext{
	//this or static block will execute first whichever comes first
	static int i = 10;
	
	//this or static block will execute first whichever comes first
	static {
		System.out.println("I am static block");
	}
	
	public static void main(String...xxyy){
		System.out.println("I am static main method");
	}
	
	static class A{
		
		public static void main(String...xxyy){
			System.out.println("I am inner static class main method");
		}
	}
	
	interface B{
		
		public static void main(String...xxyy){
			System.out.println("I am auto-static inner interface main method");
		}			
	}
	
	enum C{
		;
		public static void main(String...xxyy){
			System.out.println("I am inner auto-static enum main method");
		}
	}
}