//Requirement: Find out the first 3 characters and last 4 characters of a string

package com.k2js.string.practise;

class FirstLastCharacter{
	
	static String FirstLast(String str){
		//int s=str.length();
		String sb="";
		if(str.length()<3){
			System.out.println("length is less than 3 characters");
		}
		else 
			sb=str.substring(0,3).concat(str.substring(str.length()-3));
		
			return sb;
	
	}
}

class FirstLastTest{
	
	public static void main(String...cc){
		String str1=FirstLastCharacter.FirstLast("Javaselenium");
		System.out.println(str1);
	}
}

