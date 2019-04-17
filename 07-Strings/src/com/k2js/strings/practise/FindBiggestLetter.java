//Requirement: To find out the biggest letter

package com.k2js.string.practise;

class PrintBiggestLetter{
	static void biggest(String s){
		int length=s.length();
		System.out.println(length);
		
		char c=s.charAt(0);
		char c1=s.charAt(s.length()/2);
		char c2=s.charAt(s.length()-1);
		char biggChar=PrintBiggestLetter.findBiggestChar(c,c1,c2);
		System.out.println(biggChar);
		//return biggChar;
	}
	
	static char findBiggestChar(char c,char c1,char c2){
		char a=(c > c1 && c >c2)? c :(c1>c && c1 > c2)? c1:c2;
		return a;
	}
}

class MainTest{
	
	public static void main(String...ss){
		PrintBiggestLetter.biggest("Hello");
		//System.out.println(abc);
	}
}