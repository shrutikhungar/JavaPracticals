//1. Identification of static members from top to bottom\
//2. Execution of static members from top to bottom
//3. Execution of main method

package com.k2js.allprograms.practise;

class StaticExecutionFlow{
	
	static int i = 100; //1. JVM will assign default value at the time of identification i=0 [state is RIWO read indirectly write only]
	
	//2. 
	static {
		m1();
		System.out.println("First static block.");
	}
	
	//3. 
	public static void main(String...xxyy){
		m1();
		System.out.println("Inside main method of outer class.");
	}
	
	//4. 
	public static void m1(){
		System.out.println(j);
	}
		
	//5. 
	static {
		System.out.println("Second static block.");
	}
	
	//6. 
	static int j =200;
}

//O/P:
//0
//Inside main method of outer class
//Second static block
//200
//Inside main method of outer class

//1. JVM will assign default value at the time of identification i=0 [state is RIWO read indirectly write only] //no print in console
//2. JVM will assign default value at the time of identification j=0 [state is RIWO read indirectly write only] //no print in console
//3. JVM will read value of i as 100 //no print
//4. execution of static block: m1() --> j will be printed 0
//5. Inside main method of outer class, Second static block is printed
//6. int j =200 assigned
//7. m1() is caled from main 