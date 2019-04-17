//Requirement: HAS A Relationship

package com.k2js.constructors.practise;

class Add{
	static Comparable c= 40;
	Object o=50;
}

class Aadd{
	static void add(){
		int sum=(Integer)Add.c+ + (Integer)(new Add().o);
		System.out.println(sum);
	}
}

class AaddTest{
	public static void main(String...xxyy){
		Aadd.add();
		
	}
}