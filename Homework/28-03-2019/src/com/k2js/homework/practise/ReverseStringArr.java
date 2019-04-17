//Requirement: to reverse string using array

package com.k2js.homework.practise;

import java.util.Arrays;

class ReverseStrArray{
	
	static void reverseStrArray(String str){
		/*method 1
		char[] charEle=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(charEle[i]);
		}*/
		
		//method 1
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
	}
}

class ReverseStrArrayTest{
	
	public static void main(String...xxyy){
		ReverseStrArray.reverseStrArray("Shruti");		
	}
}