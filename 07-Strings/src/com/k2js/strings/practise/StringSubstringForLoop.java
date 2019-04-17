//Requirement: to print this pattern

//h
//h e
//h e l
//h e l l
//h e l l o

package com.k2js.string.practise;

class StringSub{
	
	static void stringSub(String str){
		for(int i=0;i<=str.length()-1;i++){
			String s=(str.substring(0,i+1));
			System.out.println(s);
			
		}
	}
}

class StringT{
	public static void main(String...ss){
		StringSub.stringSub("Hello");
	}
}