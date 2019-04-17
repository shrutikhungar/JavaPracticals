//Requirement: Find out capital small special characters using Ternary

package com.k2js.string.practise;

class CapitalSmallA{
	static void capitalSmall(String s){
		int cc=0,nc=0,sc=0,spc=0;int result=0;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			result=(c>='A' && c>='Z')?cc++:(c>='0' && c<='9')?nc++:(c>='a' && c<='z')?sc++:spc++;
		}
		System.out.println("Capital"+ cc++);
		System.out.println("number"+ nc++);
		System.out.println("small" + sc++);
		System.out.println("special character"+ spc++);
		
	}
}

class SpecialTest{
	public static void main(String...s){
		CapitalSmallA.capitalSmall("Keys2JavaSelenium");
	}
}