//Requirement: To generate 5 random values from 65-123 and print ASCII values

package com.k2js.loops.practise;

class GenerateRandomPrintASCII{
	
	static void generateRandomPrintASCII(){
		for(int i=0;i<=5;i++){
			int num=(int)(Math.random()*58)+65;
			System.out.println("Number is: "+num+". Its Ascii value is: "+(char)num);
		}
	}
}

class GenerateRandomPrintASCIITest{
	
	public static void main(String...xxyy){
		GenerateRandomPrintASCII.generateRandomPrintASCII();
	}
}