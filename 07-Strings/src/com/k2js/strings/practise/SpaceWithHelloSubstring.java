//Requirement: to print the pattern:
//        H
//      H E
//    H E L
//  H E L L
//H E L L O

package com.k2js.string.practise;

class SpacesPattern{
	static void spacesPattern(String str){
		int posttoprint=str.length();
		for(int i=0;i<str.length();i++){
			for(int j=i;j<str.length()-1;j++){
				System.out.print(" ");
			}
			System.out.println(str.substring(0,i+1));
		}
	}
}
class SpacesTest{
	public static void main(String...cc){
		SpacesPattern.spacesPattern("Hello");
	}
}