//Requirement: to access the elements of inner iterface 

package com.k2js.aboutclass.practise;

class InnerInterfaceExample{
	
	interface InnerInterface{
		int i=10;
		public static void m(){
			System.out.println("Hello");
		}
		
		default void n(){  //non static method mandatorily should mention default keyword
			System.out.println("World");
		}
	}
}

class InnerInterfaceExampleTests{
	public static void main(String...xxyy){
		new InnerInterfaceExample.InnerInterface(){}.n();
		InnerInterfaceExample.InnerInterface.m();
		System.out.println(InnerInterfaceExample.InnerInterface.i);
		
	}
}