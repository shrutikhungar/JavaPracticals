//Requirement:analyse both classes

package com.k2js.aboutstaticvariables.practise;

class SequenceOfStaticReInit{
	
	
	{
		System.out.println("Non static block");
		j=999;	System.out.println(SequenceOfStaticReInit.j);
	}
	
	SequenceOfStaticReInit(){
		System.out.println("constructor");
		j=199;	System.out.println(SequenceOfStaticReInit.j);
	}
	class innerSequenceOfStaticReInit{
		final static int j =90;
	}
	
	static {
		System.out.println("static block");
		SequenceOfStaticReInit.j=1000;
		System.out.println(SequenceOfStaticReInit.j);
	}
	
	void m(){
		int k;
		SequenceOfStaticReInit.j=20;
		System.out.println(SequenceOfStaticReInit.j);
	}
	static int j=2000;
	static void n(){
		SequenceOfStaticReInit.j=10;
		System.out.println(SequenceOfStaticReInit.j);
	}	
}
	
class SequenceOfStaticReInitTest{
	static int j;
	public static void main(String...xxyy){
		System.out.println("Main");
		System.out.println(SequenceOfStaticReInit.j);
		new SequenceOfStaticReInit().m();
		SequenceOfStaticReInit.n();
		System.out.println(SequenceOfStaticReInit.innerSequenceOfStaticReInit.j);
	}
}	

/*
1. JVM will load the class 
2. allocate memory for static int int
3. execute static block and initialize j=1000
*/