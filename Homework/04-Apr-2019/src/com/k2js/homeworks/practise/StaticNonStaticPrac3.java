//requirement: to add static and non static variable values from static and non static context

package com.k2js.homeworks.practise;

class Prac3{
	Object o="30";
	
	static Number n(Prac3 pracObj){
		return 20;
	}
	static void add(String s){
		int i=Integer.parseInt((new Prac3().o).toString());
		int j=(Prac3.n(null)).intValue();
		System.out.println(i+j);
	}
	
	void add(){
		//30-20;
		int i=Integer.valueOf((this.o).toString());
		int j=(Integer)(Prac3.n(null));
		System.out.println(i+j);
	}
	
}

class Prac3Test{
	public static void main(String...xxyy){
		Prac3.add("t");
		new Prac3().add();
	}
}