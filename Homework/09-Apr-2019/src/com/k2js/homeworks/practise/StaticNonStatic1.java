//Requirement: to add instance variable , static variable and local variable

package com.k2js.homeworks.practise;

class StaticNonStatic1{
	int a=1;
	static int b=20;
	
	int a(){
		return 30;
	}
	
	static int b(){
		return 30;
	}
	
	static void add(int a,int b){
		System.out.println((a+new StaticNonStatic1().a+new StaticNonStatic1().a()) + (b+StaticNonStatic1.b+StaticNonStatic1.b()));
	}
	
	void sub(int a,int b){
		System.out.println((a+this.a+this.a()) - (b+StaticNonStatic1.b+StaticNonStatic1.b()));
	}	
}

class StaticNonStatic1Test{
	
	public static void main(String...xxyy){
		StaticNonStatic1.add(10,20);
		new StaticNonStatic1().sub(30,40);
	}
}