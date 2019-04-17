//Requirement: to access different static data type values in a method and add them

package com.k2js.aboutstaticvariables.practise;

class A_1{
	static Comparable c="20";
}

interface B_1{
	static java.io.Serializable c=new StringBuffer("30");
}

enum C_1{
	;
	static Number c=10;
}

class ABC_1{
	
	static int m(){
		int sum = Integer.valueOf(A_1.c.toString()) + Integer.parseInt(String.valueOf((StringBuffer)B_1.c)) + (Integer)C_1.c;
		return sum;
	}
}

class ABC_1_Test{
	
	public static void main(String...xxyy){
		int sum=ABC_1.m();
		System.out.println(sum);
	}
}