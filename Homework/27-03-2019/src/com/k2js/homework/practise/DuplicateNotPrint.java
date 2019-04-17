//Requirement: to not print duplicates

package com.k2js.homework.practise;

class DuplicateNoPrint{
	
	static void duplicateNoPrint(String str){
		
		char c;
		String temp="";
		for(int i=0;i<str.length();i++){
			c=str.charAt(i);
			if (str.length()-str.replace(c+"","").length()>1)
				str=str.replace(c+"","");		
		}
		System.out.print(str);
	}
}

class DuplicateNoPrintTest{
	
	public static void main(String...xxyy){
		DuplicateNoPrint.duplicateNoPrint("babcdefd");
	}
}