//Requirement: no repeat char

package com.k2js.homework.practise;

class NoRepeatChar{
	
	static void noRepeatChar(String str){
		
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if (str.length()-str.replace(c+"","").length()>1){
				System.out.println("duplicate: "+c);
			}		
		}
		System.out.print(str);
	}
}

class NoRepeatCharTest{
	
	public static void main(String...xxyy){
		NoRepeatChar.noRepeatChar("Mannoj");
	}
}