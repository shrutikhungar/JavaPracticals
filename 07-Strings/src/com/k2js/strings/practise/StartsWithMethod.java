//Requirement: To find out String is Palindrome or not

package com.k2js.string.practise;

class Palindrome{
	
	static String Palindromem(String str1){
		//first half
		String fhalf=str1.substring(0,str1.length()/2);
		//last half
		String shalf=str1.substring(str1.length()/2);
		return fhalf.equals(new StringBuffer(str1).reverse().toString())?"Palindrome":"NotPalindrome";
	}
}

class PalidromeTest{
	
	public static void main(String...ss){
		String s=Palindrome.Palindromem("HelloolleH");
		System.out.println(s);
	}
}