//Requirement: Replace the one string from another string

package com.k2js.string.practise;

class ReplaceStringFrom{
	
	static String replaceFromWith(String originalString,String replaceFrom,String replaceWith){
		String str=originalString.replaceAll(replaceFrom,replaceWith);
		return str;
	}
	//in replace we can pass charSequence and replaceAll we chave to pass String
	/*static String replaceFromWith(String originalString,StringBuilder replaceFrom,StringBuilder replaceWith){
		String str=originalString.replace(replaceFrom,replaceWith);
		return str;
	}*/
	
}

class ReplaceFrom{
	
	public static void main(String...ss){
		String st=ReplaceStringFrom.replaceFromWith("HelloWorld","lo","llo");
		System.out.println(st);
	}
}