//Requirement: to find out the indexOf and LastIndexOf using method overloading method signature is different.

package com.k2js.string.practise;

class SecondLetterIndexOf{
	
	static int SecondLetter(String s,char c){
		int firstChar=s.indexOf(c);
		return s.indexOf(c,firstChar+1);
	}
}

class SecondTest{
	
	public static void main(String...cc){
		int i=SecondLetterIndexOf.SecondLetter("Hello",'l');
		System.out.println(i);
	}
}