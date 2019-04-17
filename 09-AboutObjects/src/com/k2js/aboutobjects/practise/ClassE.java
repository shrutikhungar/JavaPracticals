//Requirement to access non-static variable from static context of other class

package com.k2js.aboutobjects.practise;

class E{
	//non-static variable
	int i=10;
}

class ETest{
	
	//non-static method
	void eMethod(){
		//non-static area
		//1.through ObjectRef having  same class Object stored
		E eObj1=new E();
		System.out.println("through ObjectRef having same class Object stored:"+eObj1.i);
		//2.through ObjectRef having child class Object stored
		E eObj2=new E(){};
		System.out.println("through ObjectRef having child class Object stored:"+eObj2.i);
		//3.through direct same class object 
		System.out.println("through direct same class object:"+new E().i);
		//4.through direct child class object 
		System.out.println("through direct child class object:"+new E(){}.i);
	}
	
	//static method
	public static void main(String...xxyy){
		//static-area
		new ETest().eMethod();
		System.out.println();
		//1.through ObjectRef having  same class Object stored
		E eObj1=new E();
		System.out.println("through ObjectRef having same class Object stored:"+eObj1.i);
		//2.through ObjectRef having child class Object stored
		E eObj2=new E(){};
		System.out.println("through ObjectRef having child class Object stored:"+eObj2.i);
		//3.through direct same class object 
		System.out.println("through direct same class object:"+new E().i);
		//4.through direct child class object 
		System.out.println("through direct child class object:"+new E(){}.i);
	}
}