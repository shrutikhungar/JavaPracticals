//requirement: to print characters array using  index

package com.k2js.arrays.practise;

class PrintCharArrayWithIndex{
	
	static void printCharArrayWithIndex(String str){
		for(int i=0;i<str.toCharArray().length;i++)
			System.out.println(str.toCharArray()[i]);
	}
}

class PrintCharArrayWithIndexTest{
	public static void main(String...str){
		PrintCharArrayWithIndex.printCharArrayWithIndex("hello");
	}
}