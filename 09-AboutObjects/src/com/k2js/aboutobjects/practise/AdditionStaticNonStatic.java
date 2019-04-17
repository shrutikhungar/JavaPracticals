//Requirement: to add static and non static variable inside static and non static method of same class

package com.k2js.aboutobjects.practise;

class AddStaticNonStaticSameClass{
	//static variable
	static int i=10;
	//non-static variable
	int j=20;
	
	//static method
	static void staticMeth(){
		System.out.println(AddStaticNonStaticSameClass.i + new AddStaticNonStaticSameClass().j);	
	}
	
	//non-static method
	void nonStaticMeth(){
		System.out.println(AddStaticNonStaticSameClass.i - this.j); //this will be replaced by "new AddStaticNonStatic()"
	}
}

class AddStaticNonStaticSameClassTest{
	
	public static void main(String...xxyy){
		//calling static method from static area
		AddStaticNonStaticSameClass.staticMeth();
		//calling non-static method from static area
		new AddStaticNonStaticSameClass().nonStaticMeth(); 
	}
}
