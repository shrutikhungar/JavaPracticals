//requirement: to reverse array

package com.k2js.arrays.practise;

class ReverseArray{
	
	static void reverseArray(char[] c){
		for(int i=c.length-1;i>=0;i--)
			System.out.println(c[i]);
		System.out.println();
	}
}

class ReverseArrayTest{
	public static void main(String...str){
		//one way of parsing char array
		ReverseArray.reverseArray("hello".toCharArray());
		//Another way of parsing char array
		ReverseArray.reverseArray(new char[]{'h','e','l'});
	}
}