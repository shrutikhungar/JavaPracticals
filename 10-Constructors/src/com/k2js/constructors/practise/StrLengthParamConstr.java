//Requirement: to find the length of a string using parameterized constructors

package com.k2js.constructors.practise;

class StrValue{
	String s;
	StrValue(String s){
		this.s=s;
	}
}

class FindLength{
	public static void findlength(){
		StrValue strObj=new StrValue("Keys2JavaSelenium");
		System.out.println(strObj.s.length());
	}
}

class FindLengthTest{
	public static void main(String...xxyy){
		FindLength.findlength();
	}
}