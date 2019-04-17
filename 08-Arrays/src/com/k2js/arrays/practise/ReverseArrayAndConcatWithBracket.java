//requirement: to reverse array and concatenate with bracket [o,l,l,e,H]

package com.k2js.arrays.practise;

class ReverseArrayAndConcatwithBracket{
	
	static void reverseArrayAndConcat(char[] c){
		String s="";
		int counter=0;
		for(int i=c.length-1;i>=0;i--)
			s+=(counter++==0)?"[" + c[i] + ",":(counter==c.length)?c[i]+"]":c[i]+"," ;
		  //s+=(counter++==0)?"[" + c[i] + ",":(counter==c.length)?c[i] + "]": c[i] + ",";
		System.out.println(s);
	}
}

class ReverseArrayAndConcatwithBracketTest{
	public static void main(String...str){
		//one way of parsing char array
		ReverseArrayAndConcatwithBracket.reverseArrayAndConcat("hello".toCharArray());
	}
}

