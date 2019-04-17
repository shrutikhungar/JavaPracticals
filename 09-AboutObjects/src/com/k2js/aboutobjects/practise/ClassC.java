//Requirement to access static variable from static context of other class

package com.k2js.aboutobjects.practise;

class C{
	//static variable
	static int i=10;
}

class CTest{
	
	//static method
	static void bMethod(){
		//static area
		//1.through className
		System.out.println("through className:"+C.i);
		//2.through ObjectRef having null stored
		C aObj1=null;
		System.out.println("through ObjectRef having null stored:"+aObj1.i);
		//3.through ObjectRef having  same class Object stored
		C aObj2=new C();
		System.out.println("through ObjectRef having same class Object stored:"+aObj2.i);
		//4.through ObjectRef having child class Object stored
		C aObj3=new C(){};
		System.out.println("through ObjectRef having child class Object stored:"+aObj3.i);
		//5.through direct same class object 
		System.out.println("through direct same class object:"+new C().i);
		//6.through direct child class object 
		System.out.println("through direct child class object:"+new C(){}.i);
	}
	
	public static void main(String...xxyy){
		//static-area
		CTest.bMethod();
	}
}