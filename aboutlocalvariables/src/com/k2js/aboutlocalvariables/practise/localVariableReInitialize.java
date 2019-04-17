//Requirement : To check the local variable value can be re-initialized any number of time within the block

package com.k2js.aboutlocalvariables.practise;

class localVariableReinitialization{
	
	public static void main(String...a){
			int i = 10;
			System.out.println(i);
			i=10*i;
			System.out.println(i);
			i=++i;
			System.out.println(i);
	}
}