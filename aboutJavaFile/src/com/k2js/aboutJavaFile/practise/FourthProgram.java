//Requirement: To write specific methods and call them through DevBTest class 

package com.k2js.aboutJavaFile.practise;

import static java.lang.System.out;
import static com.k2js.aboutJavaFile.practise.DevB.a;
import static com.k2js.aboutJavaFile.practise.DevB.b;

class DevB{

	public static void a(){
		out.print("*");
	}
	
	public static void a(String s){
		out.print(s);
	}
	
	public static String b(){
		return "#";
	}
	
	public static int a(int i, int b){
		return i+b;
	}
}

//Requirement: To call methods of DevB class for printing a pattern
//***##30##***
//*****

class DevBTest{

	public static void main(String...xxyy){		
		a();
		a();
		a();
		String hash=b();
		a(hash);
		a(hash);
		int sum=a(10,20);
		a((String.valueOf(sum)));		
		a(hash);
		a(hash);
		a();
		a();
		a();
		a("\n");
		a();
		a();
		a();
		a();
		a();
	}
}