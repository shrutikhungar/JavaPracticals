/*Requirement: no repeat char
*/
package com.k2js.homework.practise;

class NoCharRepeat{
	
	static void noCharRepeat(String str){
		String s="";
		for(int i=0;i<=str.length()-1;i++){
			char c = str.charAt(i);
			if(!s.contains(c+""))
				System.out.print(c);
				s=new StringBuffer(s).append(c).toString();
		}
	}
}

class NoCharRepeatTest{
	
	public static void main(String...xxyy){
		NoCharRepeat.noCharRepeat("key2javaselenium");
	}
}