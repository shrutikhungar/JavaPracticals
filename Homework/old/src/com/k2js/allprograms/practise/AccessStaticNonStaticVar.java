//Requirement: To access static and non static variable

package com.k2js.allprograms.practise;

class AccessVariable{
	
	//instance var
	int i = 20;
	float f=3.0f;
	
	//static variable
	static int j = 40;
	static double d=11.3;
	
	AccessVariable(){
		//instance area
		System.out.println(new AccessVariable().i);
		System.out.println(AccessVariable.d);
	}
	
	{
		//instance area
		System.out.println(AccessVariable.d);
	}
	
	static{
		//static area
		
	}
	
	void m(){
		//instance area
		final static int x=10;
		System.out.println(i);
		System.out.println(f);
		System.out.println(AccessVariable.j);
		System.out.println(AccessVariable.d);
	}
	
	static void n(){
		//static area
		System.out.println(new AccessVariable().i);
		System.out.println(new AccessVariable().f);
		System.out.println(AccessVariable.j);
		System.out.println(AccessVariable.d);
	}
	
	public static void main(String...xxyy){
		//static area
		
		
	}
}