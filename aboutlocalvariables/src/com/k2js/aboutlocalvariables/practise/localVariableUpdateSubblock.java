//Requirement : To check the local variable value scope. Can be updated within the sub-blocks any number of times.

package com.k2js.aboutlocalvariables.practise;

class LocalvariableUpdateSubblock{
	public static void main(String...xxyy){
		int i =10;
		{
			int i=50;
			System.out.println(i);
		}
		a:{
			i=40;
			System.out.println(i);
		}
		System.out.println(i);
	}
}