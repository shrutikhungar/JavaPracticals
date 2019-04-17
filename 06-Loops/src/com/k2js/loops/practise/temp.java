//Request

package com.k2js.loops.practise;

interface IntA{
	int c(int i);
}

class  {
	public static int a(int i){
		System.out.println("a");
		return 1;
	}
	
	public int b(int i){
		System.out.println("b");
		return 0;
	}
	
	public static void main(String...xxyy){
		IntA intObj=A::a;
		int a = intObj.c(10);
		IntA intObj1=new A()::b;
		int b =intObj1.c(11);
	}
}