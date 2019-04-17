//Req: 

package com.k2js.constructors.practise;

class StrValue{
	String s;
}
class FindLength{
	public static void getStrLength(){
		StrValue strLenObj=new StrValue();
		System.out.println(strLenObj.s.length());
	}
}

class FindLengthTest{
	public static void main(String...xxyy){
		FindLength.getStrLength();
	}
}