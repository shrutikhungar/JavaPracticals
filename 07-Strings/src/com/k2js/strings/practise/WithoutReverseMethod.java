//requriement: Without using reverse method find out palindrome

package com.k2js.string.practise;

class Palindrome{
	static void palindrome(String str){
		int len=str.length();

		int halflength=len/2;
		boolean palindromFlag=true;
		String firsthalf=str.substring(0,len-halflength);
		String secondHalf=str.substring(len-halflength);
	for(int i =0;i<firsthalf.length()-1;i++){
		char c1=firsthalf.charAt(i);
		char c2=secondHalf.charAt(secondHalf.length()-1-i);
			if(c1!=c2){
				palindromFlag=false;
				break;
			}
		}
		System.out.println(palindromFlag?"Palindrome":"not Palindrom");
	}
}
class PalinTest{
	public static void main(String...ss){
		Palindrome.palindrome("JAVAJ");
	}
}	