//req

package com.k2js.homeworks.practise;

class A{
	static{
		A.i=20;
		System.out.println(i);
	}
	static int i=10;
}

class ATest{
	public static void main(String...xxyy){
		System.out.println(A.i);
	}
}