//Requirement: To create a non-Static class and access those element in another non static class

package com.k2js.aboutclass.practise;

//import

class NonStaticContext{
	
	int i = 10;
	
	{
		//A non-static block executes when the object is created, before the constructor
		System.out.println("I am a non-static block.");
	}
	
	public void m(){
		System.out.println("I am a non-static outer class method.");
	}
	
	NonStaticContext(){
		System.out.println("I am a outer class constructor.");
	}
	
	class A{
		
		void m(){
			System.out.println("I am a non-static inner class method.");
		}
	}
}

class NonStaticContextTest{
	
	public static void main(String...xxyy){
		NonStaticContext nscObj=new NonStaticContext();
		NonStaticContext nscObj1=new NonStaticContext();
		System.out.println("I am a variable of non-static class: " + nscObj.i);
		nscObj.m();
		nscObj.new A().m();
	}
}