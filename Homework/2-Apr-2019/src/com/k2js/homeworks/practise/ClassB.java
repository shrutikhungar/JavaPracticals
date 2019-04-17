//Requirement to access static variable from non static context

package com.k2js.aboutobjects.practise;

class B{
	//static variable
	static int i=10;
	
	//non-static method
	void aMethod(){
		//non-static area
		//1.through className
		System.out.println("through className:"+B.i);
		//2.through ObjectRef having null stored
		B aObj1=null;
		System.out.println("through ObjectRef having null stored:"+aObj1.i);
		//3.through ObjectRef having  same class Object stored
		B aObj2=new B();
		System.out.println("through ObjectRef having same class Object stored:"+aObj2.i);
		//4.through ObjectRef having child class Object stored
		B aObj3=new B(){};
		System.out.println("through ObjectRef having child class Object stored:"+aObj3.i);
		//5.through direct same class object 
		System.out.println("through direct same class object:"+new B().i);
		//6.through direct child class object 
		System.out.println("through direct child class object:"+new B(){}.i);
		//7.direct access
		System.out.println("direct access:"+i);
		//8.through this by storing this in objectRef
		B b=this;
		System.out.println("through this:"+b.i);
		//9.through this directly
		System.out.println("through this directly:"+this.i);
	}
}

class BTest{
	
	//non-static method
	void bMethod(){
		//non-static area
		//1.through className
		System.out.println("through className:"+B.i);
		//2.through ObjectRef having null stored
		B aObj1=null;
		System.out.println("through ObjectRef having null stored:"+aObj1.i);
		//3.through ObjectRef having  same class Object stored
		B aObj2=new B();
		System.out.println("through ObjectRef having same class Object stored:"+aObj2.i);
		//4.through ObjectRef having child class Object stored
		B aObj3=new B(){};
		System.out.println("through ObjectRef having child class Object stored:"+aObj3.i);
		//5.through direct same class object 
		System.out.println("through direct same class object:"+new B().i);
		//6.through direct child class object 
		System.out.println("through direct child class object:"+new B(){}.i);
	}
	
	public static void main(String...xxyy){
		//static-area
		new B().aMethod();
		new BTest().bMethod();
	}
}