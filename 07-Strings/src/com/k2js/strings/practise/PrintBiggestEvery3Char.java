//requirement: to print highest of every 3 char

package com.k2js.homework.practise;

class PrintBiggestEvery3Char{
	
	static char printBiggestChar(String str){
		char biggestChar=str.charAt(0);
		for(int i=0;i<=str.length()-1;i++){
			char c = str.charAt(i);
			biggestChar=(c>biggestChar)?c:biggestChar;
		}
		return biggestChar;
	}
	
	static void printBiggestEvery3Char(String str){
		for(int i=0;i<=str.length()-1;i+=3){
			String partstr=(str.length()-i>=3)?str.substring(i,i+3):str.substring(i);
			char biggestChar=printBiggestChar(partstr);
			System.out.println(biggestChar);
		}		
	}
}

class PrintBiggestEvery3CharTest{
	public static void main(String...str){
		PrintBiggestEvery3Char.printBiggestEvery3Char("keys2javaselenium");
	}
}