//Requirement: to print duplicates

package com.k2js.homework.practise;

class DuplicatePrint{
	
	static void duplicatePrint(String str){
		
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if (str.length()-str.replace(c+"","").length()>1){
				System.out.println("duplicate: "+c);
			}		
		}
		System.out.print(str);
	}
}

class DuplicatePrintTest{
	
	public static void main(String...xxyy){
		DuplicatePrint.duplicatePrint("babcdefd");
	}
}