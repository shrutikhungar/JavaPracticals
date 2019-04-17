//Requirement: To find out whether smallest string is present in Biggest string

package com.k2js.string.practise;

class BiggestSmallest{
	static boolean m(String s,CharSequence cs ){
		int l1=s.length();
		int l2=cs.length();
		CharSequence bigString=(l1 > l2)? s:cs;
		CharSequence smaller=(l1>l2)? cs:s;
		
		return ((String)bigString).contains(smaller);
		//one more way
		//return (bigString.toString()).contains(smaller);
		//one more way
		// return String.valueOf(bigString).contains(smaller);
	}
}

class SmallestTest{
	
	public static void main(String...cc){
		boolean b=BiggestSmallest.m("He","Hello");
		System.out.println(b);
	}
}