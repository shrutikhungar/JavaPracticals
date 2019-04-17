//Requirement: Reverse a string 

package com.k2js.string.practise;

class ReverseString{
	static void reverse(String str){
		String s="";
		for(int i=str.length()-1;i>=0;i--){
			char c=str.charAt(i);
			System.out.print(c);
		}
	}
}

class ReverseTest{
	public static void main(String...ss){
		ReverseString.reverse("Selenium");
	}
}