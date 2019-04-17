//Requirement: addition of static and non static variable in static and non static context

package com.k2js.aboutobjects.practise;

class StaticNonStaticVarAdd{
	static int i=10;
	int j=20;
}

class StaticNonStaticVarAddLogic{
	int i=30;
	static int j=40;
	
	//non-static meth
	void nonStaticMeth(int i,int j){
		System.out.println((i+this.i+StaticNonStaticVarAdd.i) - (j+StaticNonStaticVarAddLogic.j+new StaticNonStaticVarAdd().j));		
	}
	
	//static meth
	static void staticMeth(int i,int j){
		System.out.println((i+new StaticNonStaticVarAddLogic().i+StaticNonStaticVarAdd.i) + (j+StaticNonStaticVarAddLogic.j+new StaticNonStaticVarAdd().j));		
	}		
}

class StaticNonStaticVarAddLogicTest{
	public static void main(String...xxyy){
		//calling non static meth		
		new StaticNonStaticVarAddLogic().nonStaticMeth(11,22);
		StaticNonStaticVarAddLogic.staticMeth(33,44);		
	}
}