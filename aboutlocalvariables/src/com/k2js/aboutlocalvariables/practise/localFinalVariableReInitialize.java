//Requirement : To check the local variable value can be re-initialized any number of time within the block

package com.k2js.aboutlocalvariables.practise;

class localStaticVariableReinitialization{
	
	public static void main(String...a){
			final int i = 10;
			System.out.println(i);
			i=10*i;
			System.out.println(i);
	}
}