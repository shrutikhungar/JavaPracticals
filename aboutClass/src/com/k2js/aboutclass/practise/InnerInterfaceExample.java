//Requirement: to access the elements of inner iterface 

package com.k2js.aboutclass.practise;

class InnerInterfaceExample{
	
	interface InnerInterface{
		
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
		InnerInterfaceExample.InnerInterface.m();
		InnerInterfaceExample.InnerInterface innerInterfaceObj=new InnerInterfaceExample.InnerInterface(){};
		innerInterfaceObj.n();
	}
}