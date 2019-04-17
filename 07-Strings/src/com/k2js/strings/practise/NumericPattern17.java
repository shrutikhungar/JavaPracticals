//Requirement: to print this pattern:
// 1
// 2  3
// 3  4  5


package com.k2js.string.practise;

class NumericPattern{
	
	public static void main(String...cc){
		for(int i=1;i<=5;i++){
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
				System.out.println("");
		}
	}
}
