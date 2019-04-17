//Requirement: to create a selfish method which takes in random math char and not give any output.

package com.k2js.aboutconditions.practise;

class MathRandomSelfishVowel{
	
	static void vowelRandom(char c){
		if (c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
			System.out.println("Vowel: "+c);
		else 
			System.out.println("Consonant: "+c);
	}
}

class MathRandomSelfishVowelTest{
	
	public static void main(String...xxyy){
		MathRandomSelfishVowel.vowelRandom((char)(int)(Math.random()*26+65));
	}
}