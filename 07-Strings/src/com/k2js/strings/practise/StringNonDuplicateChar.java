//requirement: To print non duplicate characters

package com.k2js.strings.practise;

class StringNonDuplicate{
	
	static void stringNonDuplicate(String str){
		int count=1;
		for(int i=0;i<=str.length()-1;i++ ){
			char c = str.charAt(i);
			if(!str.substring(0,i).contains(c+"")){
				int diff=str.length()-str.replace(c+"","").length();
				if(diff==1){
					System.out.print(c);
				}
			}					
		}
	}
}

class StringNonDuplicateTest{
	public static void main(String...str){
		StringNonDuplicate.stringNonDuplicate("keys2selenium");
	}
}