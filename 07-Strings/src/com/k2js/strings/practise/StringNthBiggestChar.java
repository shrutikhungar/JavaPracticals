//requirement: To print nth biggest char in a string

package com.k2js.strings.practise;

class StringNthBiggestChar{
	
	static char biggestChar(String str){
		char biggestChar='A';
		for(int i=0;i<=str.length()-1;i++){
			char c=str.charAt(i);	
			biggestChar=c>biggestChar?c:biggestChar;	
		}
		return biggestChar;
	}
	
	static void nthBiggestChar(String str,int nthBiggest){	
		char biggestChar=0;
		for(int i=0;i<nthBiggest;i++){
			biggestChar=StringNthBiggestChar.biggestChar(str);
			str=str.replace(biggestChar+"","");			
		}
		System.out.println(biggestChar);
	}
}

class StringNthBiggestCharTest{
	public static void main(String...str){
		StringNthBiggestChar.nthBiggestChar("abcd",3);
	}
}
	
		