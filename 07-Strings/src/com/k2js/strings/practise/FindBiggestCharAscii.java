//Requirement: To find out the largest character using for loop,ascii value wise

package com.k2js.string.practise;

class LargestCharacter{
	
	static void LargestChar(String s){
		int greatestval=0;
		for(int i=0;i<s.length();i++){
			int curval=(int)s.charAt(i);
			if(curval > greatestval){
				greatestval=curval;
			}
		}
			char ch=(char)greatestval;
			System.out.println("biggest character is " + ch + " " + "ascii value is" + greatestval);
	}
}

class LargestTest{
	
	public static void main(String...ss){
		LargestCharacter.LargestChar("Key2JavaSelenium");
	}
}