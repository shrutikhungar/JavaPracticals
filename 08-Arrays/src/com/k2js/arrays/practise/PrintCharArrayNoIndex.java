//requirement: to print characters array using no index

package com.k2js.arrays.practise;

class PrintCharArrayWithoutIndex{
	
	static void printCharArrayWithoutIndex(String str){
		for(char c:str.toCharArray())
			System.out.println(c);
	}
}

class PrintCharArrayWithoutIndexTest{
	public static void main(String...str){
		PrintCharArrayWithoutIndex.printCharArrayWithoutIndex("hello");
	}
}