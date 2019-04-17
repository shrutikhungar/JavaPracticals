//Requirement: to add static and non static variable inside static and non static method of different class

package com.k2js.aboutobjects.practise;

class AddStaticNonStaticDiffClass{
	//static variable
	static int i=10;
	//non-static variable
	int j=20;
}

class AddStaticNonStaticDiffClassTest{		
	//static method
	static void staticMeth(){
		System.out.println(AddStaticNonStaticDiffClass.i +new AddStaticNonStaticDiffClass().j);	
	}
	
	//non-static method
	void nonStaticMeth(){
		System.out.println(AddStaticNonStaticDiffClass.i - new AddStaticNonStaticDiffClass().j);
	}
	
	//static main method
	public static void main(String...xxyy){
		//calling static method from static area
		AddStaticNonStaticDiffClassTest.staticMeth();
		//calling non-static method from static area
		new AddStaticNonStaticDiffClassTest().nonStaticMeth();		
	}
}
