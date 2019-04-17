//Requirement: to find out the which letter is bigest in a word using max function.

package com.k2js.string.practise;

class StringCharacterPrint{
	
	static void stringCharacter(String s){
		int length=s.length();
		System.out.println("length is" +length);
		
		char firstChar=s.charAt(0);
		char middleChar=s.charAt(s.length()/2);
		char lastChar=s.charAt(s.length()-1);
		char biggestChar=StringCharacterPrint.biggestChar(firstChar,middleChar,lastChar);
		System.out.println("biggest char at" + biggestChar);
	}
	
	static char biggestChar(char firstChar,char middleChar,char lastChar){
		char biggestChar=(char)(Math.max(Math.max(firstChar,middleChar),lastChar));
		return biggestChar;
	}
}

class StringCharacterPrintTest{
	
	public static void main(String...cc){
		StringCharacterPrint.stringCharacter("Hello selenium");
	}
}	