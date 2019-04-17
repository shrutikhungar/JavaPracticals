//Requirement: to find out the difference between lower case character and upper case character

package com.k2js.string.practise;

class DiffUpperLower{
	
	static int LowerUpper(String s){
		char low=s.toLowerCase().charAt(0);
		System.out.println(low);
		char upp=s.toUpperCase().charAt(s.length()-1);
		System.out.println(upp);
		return low-upp;
		
	}
}

class DiffUpperTest{
	
	public static void main(String...ss){
		int diff=DiffUpperLower.LowerUpper("seleniuM");
		System.out.println(diff);
	}
}