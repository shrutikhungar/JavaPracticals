//Requirement: to get the middle number of a integer 3-digit number

package com.k2js.aboutstaticvariables.practise;

class F_1{
	static Number n =157;
}

class G_1{
	
	static int fetchMiddleNum(){
		int midDigit=((Integer)F_1.n/10)%10;
		return midDigit;
	}
}

class F_G_1_Test{
	
	public static void main(String...xxyy){
		int midDigit= G_1.fetchMiddleNum();
		System.out.println("Middle Digit: " +midDigit);
	}
}