//Requirement: One time character should print

package com.k2js.string.practise;

class CharacPrint{
	
	static void charprint(String str){
		for(int i=0;i<str.length()-1;i++){
			char c=str.charAt(i);
			if(!str.substring(0,i).contains(c+"")){
				System.out.print(c);
			}
		}
	}
}
class CharacTest{
	
	public static void main(String...s){
		CharacPrint.charprint("key2javaselenium");
	}
}