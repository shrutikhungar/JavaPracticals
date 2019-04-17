//Requirement: to explain all kinds of inner classes in an outer class

package com.k2js.aboutclass.practise;

class AllInnerClasses{
	public static void main(String...xxyy){
		System.out.println("I am outer class main method");
	}
	
	public static class A{
		public static void main(String...xxyy){
			System.out.println("I am static method of static nested inner class");	
		}
		
		public void m(){
			System.out.println("I am non-static method of static nested inner class");	
		}
	}
	
	class B{
		public void m(){
			System.out.println("I am non-static method of non-static inner class");	
		}
	}
	
	class C{
		public void m(){
			class D{
				void m(){
					System.out.println("I am a local inner class method");	//can not be called outside class C. Anything created 
				}
			}
		D objD= new D();
		objD.m();
		}
	}
}