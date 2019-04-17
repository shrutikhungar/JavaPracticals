//Requirement: To generate math random number pass through a method and return vowel or consonent

package com.k2js.aboutconditions.practise;

class MathRandomIfGood{
	
	static String goodIfVowelOrNot(char c){
		if(c=='A' || c=='A' || c=='A' || c=='A' || c=='A')
			return ("Vowel: "+c);
		else 
			return ("Consonant: "+c);
	}
}

class MathRandomIfGoodTest{
	
	public static void main(String...xxyy){
		char c=(char)(int)(Math.random()*26+65);
		String res=MathRandomIfGood.goodIfVowelOrNot(c);
		System.out.println(res);
	}
}