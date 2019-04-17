//Requirement: To get a random number from 50 to 100 and find out whether that number of divisible by 5 or not

package com.k2js.aboutstaticvariables.practise;

class J_1{
	
	static String m(){
		int i=(int)(Math.random()*50+50);
		System.out.println(i);
		String divOrNot=(i%5==0)?"Divisible by 5":"Not Divisible by 5";
		return divOrNot;
	}
}

class J_1_Test{
	
	public static void main(String...xxyy){
		String divOrNot=J_1.m();
		System.out.println(divOrNot);
	}
}