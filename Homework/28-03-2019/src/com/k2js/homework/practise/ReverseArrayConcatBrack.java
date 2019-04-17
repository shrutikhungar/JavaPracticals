//Requirement: To reverse string and concat with []

package com.k2js.homework.practise;

class ReverseStringConcatBrack{
	
	static void reverseStrConcat(String str){
		int counter=0;
		String s="";
		for(int i=str.length()-1;i>=0;i--)
			s+=(counter++==0)?"["+str.charAt(i)+",":(counter==str.length())?str.charAt(i)+"]":str.charAt(i)+",";
		System.out.println(s);
	}
}

class ReverseStringConcatBrackTest{
	
	public static void main(String[] strArr){		
		ReverseStringConcatBrack.reverseStrConcat("Shruti");		
	}
}