//Requirement: To get a random number from Math class starting from A to C/dand converting it into char

package com.k2js.aboutstaticvariables.practise;

class Alphabet{
	static char c =	(char)(int)(Math.random()*4+65);
	
	static void findAlpha(){		
		if (Alphabet.c=='A'){
			System.out.println("Apple: "+Alphabet.c);
		} else if (Alphabet.c=='B'){
			System.out.println("Ball: "+Alphabet.c);
		} else if (Alphabet.c=='C'){
			System.out.println("Cat: "+Alphabet.c);
		} else			System.out.println("Other: "+Alphabet.c);
	}
}

class AlphabetTest{
	
	public static void main(String...xxyy){
		Alphabet.findAlpha();
	}
}