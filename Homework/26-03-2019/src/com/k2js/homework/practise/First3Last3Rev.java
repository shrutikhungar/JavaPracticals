//Requirement: to find first 3 letter and last 3 letter of string and reverse and concatenate

package com.k2js.homework.practise;

class StringFirstandLast3Rev{
	
	static String stringFirstandLast3Rev(String str){
		String fstThreeLetter=new StringBuffer(str.substring(0,3)).reverse()+"";
		String lstThreeLetter=new StringBuffer((str.substring(str.length()-3,str.length()))).reverse()+"";
		
		System.out.println(fstThreeLetter + "" +lstThreeLetter );
		System.out.println(fstThreeLetter.concat(lstThreeLetter));
		//return fstHalfStr.equals(new StringBuffer(secHalfStr).reverse().toString())?"Palindrome":"not Palindrome";
		return "";
		
	}
}

class StringFirstandLast3RevTest{
	
	public static void main(String...xxyy){
		String res = StringFirstandLast3Rev.stringFirstandLast3Rev("Magicshow");
		System.out.println(res);
	}
}