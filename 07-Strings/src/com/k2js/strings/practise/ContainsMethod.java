//Requirement: to find out the string present or not using contains method

package com.k2js.string.practise;

class ContainsClass{
	
	static boolean m(String s){
		String s1="He";
		return s.contains(s1);
	}
}

class ContainTest{
	public static void main(String...ss){
		boolean b=ContainsClass.m("Hello");
		System.out.println(b);
	}
}