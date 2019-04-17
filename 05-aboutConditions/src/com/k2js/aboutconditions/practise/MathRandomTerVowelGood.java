//Requirement: To generate math random number pass through a method and return vowel or consonent using terenary 

package com.k2js.aboutconditions.practise;

class RandomTerenaryVowelGood{
	
	static String randomTerenaryVowelGood(char c){
		String stringvowel= (c=='A' || c=='E' || c=='I' || c=='O' || c=='U')?"Vowel":"Consonant";
		return stringvowel;
	}
}

class RandomTerenaryVowelGoodTest{
	
	public static void main(String...xxyy){
		String str = RandomTerenaryVowelGood.randomTerenaryVowelGood((char)(int)(Math.random()*26+65));		
		System.out.println(str + ":" + (char)(int)(Math.random()*26+65));
	}
}	