//Requirement: To find out the first index Of and  last indexof using method overloading when method signature is different

package com.k2js.string.practise;

class FirstIndexOf{
	
	static void getPosition(String s,char c){
		int firstIndex=s.indexOf(c);
		System.out.println(firstIndex);
		int lastIndex=s.lastIndexOf(c);
		System.out.println(lastIndex);
	}
}

class FirstTest{
	
	public static void main(String...ss){
		FirstIndexOf.getPosition("Hello",'l');
		//System.out.println(result);
	}
}