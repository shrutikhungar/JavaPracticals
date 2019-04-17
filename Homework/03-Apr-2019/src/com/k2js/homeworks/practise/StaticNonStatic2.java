//Requirment: to add local instance static variable in different class

package com.k2js.homeworks.practise;

class StaticNonStatic2{
	int i=10;
	static int j=20;
}

class StaticNonStatic2Logic{
	int i=5;
	static int j=7;
	
	void add(int i,int j){
		System.out.println((i+new StaticNonStatic2().i+this.i) + (j+StaticNonStatic2.j+StaticNonStatic2Logic.j));
	}
	
	static void sub(int i,int j){
		System.out.println((i+new StaticNonStatic2().i+new StaticNonStatic2Logic().i) - (j+StaticNonStatic2.j+StaticNonStatic2Logic.j));
	}
		
}

class StaticNonStatic2Test{
	public static void main(String...xxyy){
		new StaticNonStatic2Logic().add(1,2);
		StaticNonStatic2Logic.sub(3,4);
	}
}