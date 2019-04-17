//Requirement: find out the first and last character

package com.k2js.string.practise;

class FindChar{
	static void chars(String s){
		 s="Hello";
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(i==0 || i==s.length()-1){
				System.out.println(c);
			}
			
		}
	}
}

class FindTest{
	
	public static void main(String...ss){
		FindChar.chars("Hello");
	}
}