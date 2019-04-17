//Requirement: To generate random char using math class and print whether its a vowel or consonent with return type. kind method

package com.k2js.aboutconditions.practise;

class IfElseMathChar{
	static char c =(char)(int)(Math.random()*26+65);
	
	static String checkVowelOrNot(){
	
		if (IfElseMathChar.c=='A' || IfElseMathChar.c=='E' || IfElseMathChar.c=='I' || IfElseMathChar.c=='O' || IfElseMathChar.c=='U')	
			return ("Vowel :"+c);
		else 
			return ("Consonant: "+c);
	}
}

class IfElseMathCharTest{
	
	public static void main(String...xxyy){
		String vowelOrNot=IfElseMathChar.checkVowelOrNot();
		System.out.println(vowelOrNot);
	}
}