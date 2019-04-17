//Requirement: Reverse the string and check palindrome or not

package com.k2js.string.practise;

class ReverseStr{
	
	static void reverselen(String str){
		int len=str.length();
		boolean palindromeflag=false;
		for(int i=0,j=len-1;i<len/2;i++,j--){
			char c1=str.charAt(i);
			char c2=str.charAt(j);
			palindromeflag=(c1==c2)?true:false;
			if(!palindromeflag)
				break;
		}
		System.out.println(((palindromeflag)?"":"not")+ "palindrome");
	}
}
class StrTest{
	public static void main(String...cc){
		ReverseStr.reverselen("JAVAJ");
	}
}
