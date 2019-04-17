//Requirement : to create a class pen

package com.k2js.aboutobjects.practise;

class Pen{
	static int nibCount=1;
	static int capCount=1;
	static int refill=1;
	String color;
	int length;
}

class PenTest{
		
	public static void main(String...xxyy){
		//creating first pen object
		Pen penObj1=new Pen();
		penObj1.color="Pink";
		penObj1.length=10;	
		
		//creating second pen object
		Pen penObj2=new Pen();
		penObj2.color="Black";
		penObj2.length=15;	
		
		//Accessing values of first pen object
		System.out.println();
		System.out.println("***first pen***");
		System.out.println("Pen nibCount: "+Pen.nibCount);
		System.out.println("Pen capCount: "+Pen.capCount);
		System.out.println("Pen refill: "+Pen.refill);
		System.out.println("Pen color: "+penObj1.color);		
		System.out.println("Pen length: "+penObj1.length);		
		
		//Accessing values of second pen object
		System.out.println();		
		System.out.println("***second pen***");
		System.out.println("nibCount: "+Pen.nibCount);
		System.out.println("capCount: "+Pen.capCount);
		System.out.println("refill: "+Pen.refill);
		System.out.println("color: "+penObj2.color);		
		System.out.println("length: "+penObj2.length);		
	}
}