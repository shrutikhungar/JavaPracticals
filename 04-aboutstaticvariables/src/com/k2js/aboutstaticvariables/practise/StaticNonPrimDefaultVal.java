//Requirement: To know the default value of static all kinds of primitive variable

package com.k2js.aboutstaticvariables.practise;

class StaticNonPrimDefaultVal{
	
	//values are initiated to 0, if not given 
	static Byte b;
	static Integer i;
	static Short s;
	static Long l;
	static Float f;
	static Double d;
	static Character c;
	static Boolean boo;
	static CharSequence cs;
	static java.io.Serializable sb;
	static java.util.List li;
	static StaticNonPrimDefaultVal obj; 
	static Integer[] integerArray;
	static int[] intArray;
}

class StaticNonPrimDefaultValTest{
	
	public static void main(String...xxyy){
		System.out.println("Non Primitive default value " + StaticNonPrimDefaultVal.b+ " for Byte");
		System.out.println("Non Primitive default value " + StaticNonPrimDefaultVal.i+ " for Integer");
		System.out.println("Non Primitive default value " + StaticNonPrimDefaultVal.s+ " for Short");
		System.out.println("Non Primitive default value " + StaticNonPrimDefaultVal.l+ " for Long");
		System.out.println("Non Primitive default value " + StaticNonPrimDefaultVal.f+ " for Float");
		System.out.println("Non Primitive default value " + StaticNonPrimDefaultVal.d+ " for Double");
		System.out.println("Non Primitive default value " + StaticNonPrimDefaultVal.c+ " for Characater");
		System.out.println("Non Primitive default value " + StaticNonPrimDefaultVal.boo+ " for Boolean");
		System.out.println("Non Primitive default value " + StaticNonPrimDefaultVal.cs+ " for CharSequence");
		System.out.println("Non Primitive default value " + StaticNonPrimDefaultVal.sb+ " for Serializable");
		System.out.println("Non Primitive default value " + StaticNonPrimDefaultVal.li+ " for List");
		System.out.println("Non Primitive default value " + StaticNonPrimDefaultVal.obj+ " for own class");
		System.out.println("Non Primitive default value " + StaticNonPrimDefaultVal.integerArray+ " for Integer Array");
		System.out.println("Non Primitive default value " + StaticNonPrimDefaultVal.intArray+ " for int Array");
	}
}
