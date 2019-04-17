//Requirement: to create a class to access static variable in all possible was

package com.k2js.aboutstaticvariables.practise;

class DiffWaysToAccessStaticVar{
	
	//static variable
	static int i = 1000;
	
	static{
		//static area
		//static block same class: Direct access
		System.out.println(i);
	}
	
	//non-static block same class: using this keyword
	{
		//non static area
		System.out.println(this.i);
	}
}

class DiffWaysToAccessStaticVarTest{
	
	public static void main(String...xxyy){
		
		//static area
		//Recommended. By classname
		System.out.println(DiffWaysToAccessStaticVar.i);
		
		//Not Recommended. By objectname
		System.out.println(new DiffWaysToAccessStaticVar().i);
		
		//Not Recommended. by null object reference
		DiffWaysToAccessStaticVar DiffWaysToAccessStaticVarObj=null;
		System.out.println(DiffWaysToAccessStaticVarObj.i);
		
		//Not Recommended. by object reference
		DiffWaysToAccessStaticVar DiffWaysToAccessStaticVarObj1=new DiffWaysToAccessStaticVar();
		System.out.println(DiffWaysToAccessStaticVarObj1.i);
		
		//Not Recommended. in child class i can be accessed with super keyword
		DiffWaysToAccessStaticVar DiffWaysToAccessStaticVarObj2=new DiffWaysToAccessStaticVar(){
			public String toString(){
				return ("I am a toString()"+super.i);
			}
		};
		System.out.println(DiffWaysToAccessStaticVarObj2);
	}
}