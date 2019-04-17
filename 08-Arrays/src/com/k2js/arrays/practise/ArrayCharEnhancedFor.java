//requirement: to [H,e,l,l,o]

package com.k2js.arrays.practise;

class ArrayCharEnhancedFor{
	
	static void arrayCharEnhancedFor(char[] charArr){
		String s="";
		int counter=0;
		for(char c:charArr)
			s+=(counter++==0)?"[" + c + ",":(counter==charArr.length)?c+"]":c+"," ;
		System.out.println(s);
	}
}

class ArrayCharEnhancedForTest{
	public static void main(String...str){
		//one way of parsing char array
		ArrayCharEnhancedFor.arrayCharEnhancedFor("hello".toCharArray());
	}
}

