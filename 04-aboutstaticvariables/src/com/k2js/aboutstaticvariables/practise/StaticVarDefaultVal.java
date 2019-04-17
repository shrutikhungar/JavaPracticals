//Requirement: To know the default value of static all kinds of primitive variable

package com.k2js.aboutstaticvariables.practise;

class PrimitiveDefaultVal{
	
	//values are initiated to 0, if not given 
	static byte b;
	static int i;
	static short s;
	static long l;
	static float f;
	static double d;
	static char c;
	static boolean boo;
}

class StaticVarDefaultValTest{
	
	public static void main(String...xxyy){
		System.out.println("Primitive value " + PrimitiveDefaultVal.b+ " for byte");
		System.out.println("Primitive value " + PrimitiveDefaultVal.i+ " for int");
		System.out.println("Primitive value " + PrimitiveDefaultVal.s+ " for short");
		System.out.println("Primitive value " + PrimitiveDefaultVal.l+ " for long");
		System.out.println("Primitive value " + PrimitiveDefaultVal.f+ " for float");
		System.out.println("Primitive value " + PrimitiveDefaultVal.d+ " for double");
		System.out.println("Primitive value " + (int)PrimitiveDefaultVal.c+ " for char");
		System.out.println("Primitive value " + PrimitiveDefaultVal.boo+ " for boolean");
	}
}
