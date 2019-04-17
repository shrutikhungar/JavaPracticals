//Requirement: To create different kind of classes

package com.k2js.aboutclass.practise;

//import

class NormalClass{
	
	public static final <T> void main(String...xxyy){
		System.out.println("This is example of Normal class");
	}
}

class UnboundedClass<T>{
	
	public static final <T> void main(String...xxyy){
		System.out.println("This is example of unbounded class");
	}
}
	
class BoundedClass<T extends Number>{
	
	public static final <T> void main(String...xxyy){
		System.out.println("This is example of bounded class");
	}
}	

