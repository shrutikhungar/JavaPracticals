//Requirement: to find first 3 letter and last 3 letter of string and reverse and concatenate

package com.k2js.strings.practise;

class StringFirstandLast3Rev{
	
	static String stringFirstandLast3Rev(String str){
		String fstThreeLetter=str.substring(0,2);
		String lstThreeLetter=str.substring(str.length()-2,str.length());
		
		System.out.println(fstThreeLetter + ": " +lstThreeLetter );
		//return fstHalfStr.equals(new StringBuffer(secHalfStr).reverse().toString())?"Palindrome":"not Palindrome";
		
	}
}

class StringFirstandLast3RevTest{
	
	public static void main(String...xxyy){
		String res = StringFirstandLast3Rev.stringFirstandLast3Rev("Magicshow");
		System.out.println(res);
	}
}