/*Requirement to print below

   H 
  HE
 HEL
*/

package com.k2js.homeworks.practise;

class PrintHelloPattern{
	
	static void printHelloPattern(String str){
		for(int i =0;i<=str.length()-1;i++){
			for(int space=0;space<=str.length()-i-2;space++)
				System.out.print(" ");	
			String substr=str.substring(0,i+1);
			System.out.print(substr);
			System.out.println();
		}
	}
}

class PrintHelloPatternTest{
	
	public static void main(String...xxyy){
		PrintHelloPattern.printHelloPattern("Hello");
	}
}