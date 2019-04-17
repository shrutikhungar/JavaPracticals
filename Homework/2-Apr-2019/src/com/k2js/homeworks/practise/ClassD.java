//Requirement to access non-static variable from static and non-static context 

package com.k2js.aboutobjects.practise;

class D{
	//non-static variable
	 int i=10;
	
	//static method
	static void dMethod(){
		//static area
		//1.through ObjectRef having  same class Object stored
		D dObj1=new D();
		System.out.println("through ObjectRef having same class Object stored:"+dObj1.i);
		//2.through ObjectRef having child class Object stored
		D dObj2=new D(){};
		System.out.println("through ObjectRef having child class Object stored:"+dObj2.i);
		//3.through direct same class object 
		System.out.println("through direct same class object:"+new D().i);
		//4.through direct child class object 
		System.out.println("through direct child class object:"+new D(){}.i);
	}
	
	//non-static method
	void dMethod1(){
		//static area
		//1.through ObjectRef having  same class Object stored
		D dObj1=new D();
		System.out.println("through ObjectRef having same class Object stored:"+dObj1.i);
		//2.through ObjectRef having child class Object stored
		D dObj2=new D(){};
		System.out.println("through ObjectRef having child class Object stored:"+dObj2.i);
		//3.through direct same class object 
		System.out.println("through direct same class object:"+new D().i);
		//4.through direct child class object 
		System.out.println("through direct child class object:"+new D(){}.i);
		//5.directly through variable name
		System.out.println("drectly through variable name:"+i);
		//6.through this stored in obj ref
		D dObj3=this;
		System.out.println("through this stored in Obj Ref:"+this.i);
		//7.through this directly
		System.out.println("drectly through this:"+this.i);
	}
}

class DTest{
	
	public static void main(String...xxyy){
		//static-area
		D.dMethod();
		System.out.println();
		new D().dMethod1();
	}
}