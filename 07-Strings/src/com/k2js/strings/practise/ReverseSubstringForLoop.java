//REquirement: Reverse the string and print like
//o
//l o
//l l o
//e l l o
//h e l l o

package com.k2js.string.practise;

class ReverseSub{
	static void reverseSub(String str){
		for(int i=0;i<=str.length();i++){
			String s=str.substring(str.length()-i,str.length());
			System.out.println(s);
		}
	}
}
class RevStr{
	public static void main(String...ss){
		ReverseSub.reverseSub("Hello");
	}
}