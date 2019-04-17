//Requirement: To find whether string is palindrome or not

package com.k2js.homework.practise;

class StringHalfPalindrome{
	
	static void stringHalfPalindrome(String str){
		String firstHalfStr=str.substring(0,str.length()/2);
		String secHalfStr=str.substring(str.length()/2);
		String secondhalfStrRev=new StringBuffer(secHalfStr).reverse().toString();
		System.out.println(firstHalfStr);
		System.out.println(secondhalfStrRev);
		String res=(firstHalfStr.equals(secondhalfStrRev))?"Pal":"Not Pal";
		System.out.println(res);
	}
}

class StringHalfPalindromeTest{
	
	public static void main(String...xxyy){
		StringHalfPalindrome.stringHalfPalindrome("NITTIN");
	}
}