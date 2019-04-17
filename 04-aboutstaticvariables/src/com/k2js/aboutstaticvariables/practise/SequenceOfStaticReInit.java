//Requirement:analyse both classes

package com.k2js.aboutstaticvariables.practise;

class SequenceOfStaticReInit{
	static int k=10;		
	{
		System.out.println("Non static block");
		System.out.println(SequenceOfStaticReInit.j);
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
		System.out.println("static block1");
		SequenceOfStaticReInit.j=1000;
		System.out.println(SequenceOfStaticReInit.j);
	}
	
	void m(){
		System.out.println(SequenceOfStaticReInit.j);
		final int kk=10111;
		System.out.println(kk);
		SequenceOfStaticReInit.j=20;
		System.out.println(SequenceOfStaticReInit.j);
	}
	final static int j=1;
	static void n(){
		SequenceOfStaticReInit.j=10;
		System.out.println(SequenceOfStaticReInit.j);
	}	
	static {
		System.out.println("static block2");
		//SequenceOfStaticReInit.j=5000;
		System.out.println(j);
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