//requirement: To print every 3 character in reverse

package com.k2js.strings.practise;

class StringEvery3CharReverse{
	
	static void stringEvery3CharReverse(String str){
		
		for(int i=0; i<str.length()-1 ; i+=3){
			String substr=(str.length()-i>=3)?str.substring(i,i+3):str.substring(i);
			System.out.println(new StringBuffer(substr).reverse());
			
		}
	}
}

class StringEvery3CharReverseTest{
	public static void main(String...xxyy){
		StringEvery3CharReverse.stringEvery3CharReverse("keys2javaselenium");
	}
}