//Requirement: To generate random char using math class and print whether its a vowel or consonent without return type. reserved method

package com.k2js.aboutconditions.practise;

class IfElseMathChar{
	static char c = (char)(int)(Math.random()*26+65);
	
	static void vowelOrNot(){
		if (IfElseMathChar.c == 'A' || IfElseMathChar.c == 'E' || IfElseMathChar.c == 'I' || IfElseMathChar.c == 'O' || IfElseMathChar.c == 'U')
			System.out.println("I am a vowel: "+IfElseMathChar.c);
		else
			System.out.println("I am a consonent: "+IfElseMathChar.c);
	}
}

class IfElseMathCharTest{
	public static void main(String...xxyy){
		IfElseMathChar.vowelOrNot();
	}
}