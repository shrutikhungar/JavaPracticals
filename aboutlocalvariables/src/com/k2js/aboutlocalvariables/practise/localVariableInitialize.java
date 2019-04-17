//Requirement : To check the local variable should be initialized

package com.k2js.aboutlocalvariables.practise;

class localVariableTest{
	public static void main(String...a){
		int i=10;
		int j;
		j=20;
		int k;
		int l=k=30;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(l);
		System.out.println(k);
	}
}