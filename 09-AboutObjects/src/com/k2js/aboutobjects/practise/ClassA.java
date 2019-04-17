//Requirement to access static variable from static context

package com.k2js.aboutobjects.practise;

class A{
	//static variable
	static int i=10;

	static void aMethod(){
		//static area
		//1.through className
		System.out.println("through className:"+A.i);
		//2.through ObjectRef having null stored
		A aObj1=null;
		System.out.println("through ObjectRef having null stored:"+aObj1.i);
		//3.through ObjectRef having  same class Object stored
		A aObj2=new A();
		System.out.println("through ObjectRef having same class Object stored:"+aObj2.i);
		//4.through ObjectRef having child class Object stored
		A aObj3=new A(){};
		System.out.println("through ObjectRef having child class Object stored:"+aObj3.i);
		//5.through direct same class object 
		System.out.println("through direct same class object:"+new A().i);
		//6.through direct child class object 
		System.out.println("through direct child class object:"+new A(){}.i);
		//7.direct access
		System.out.println("direct access:"+i);
	}
	
	
}

class ATest{
	//static area
	public static void main(String...xxyy){
		//static area
		//1.through className
		System.out.println("through className:"+A.i);
		//2.through ObjectRef having null stored
		A aObj1=null;
		System.out.println("through ObjectRef having null stored:"+aObj1.i);
		//3.through ObjectRef having  same class Object stored
		A aObj2=new A();
		System.out.println("through ObjectRef having same class Object stored:"+aObj2.i);
		//4.through ObjectRef having child class Object stored
		A aObj3=new A(){};
		System.out.println("through ObjectRef having child class Object stored:"+aObj3.i);
		//5.through direct same class object 
		System.out.println("through direct same class object:"+new A().i);
		//6.through direct child class object 
		System.out.println("through direct child class object:"+new A(){}.i); 
	}
}