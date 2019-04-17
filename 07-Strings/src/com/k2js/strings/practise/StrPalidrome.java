//Requirement: to find first 3 letter and last 3 letter of string and reverse and concatenate

package com.k2js.strings.practise;

class StrPalindrome{
	
	static void strPalindrome(String str){
		
		int l=str.length();
		boolean flag=false;
		for(int i =0,j=l-1;i<l/2;i++,j--){
			char c1=str.charAt(i),c2=str.charAt(j);
			flag=(c1==c2)?true:false;
			if(!flag)break;
		}
			System.out.println(((flag)?"":"not")+"Palindrome");		
	}
}

class StrPalindromeTest{
	
	public static void main(String...zzyy){
		StrPalindrome.strPalindrome("HELLOLLEH");
	}
}
