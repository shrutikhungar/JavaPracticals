//Requirement: to access different static data type values in a method find the bigger of them and return the value

package com.k2js.aboutstaticvariables.practise;

class D_1{
	static Number n=15;
}

class E_1{
	static Object o=22;
}

class D_E_1{
	
	static int m(){
		int firstNum=(Integer)D_1.n;
		int secNum=(Integer)E_1.o;
		int bigger=firstNum>secNum?firstNum:secNum;
		return bigger;
	}
}

class D_E_1_Test{
	
	public static void main(String...xxyy){
		int bigger=D_E_1.m();
		System.out.println(bigger);
	}
}

