//Requirement: to add 4 numbers (static and non static variables) from static and non static context

package com.k2js.homeworks.practise;

class Prac5{
	Object o="50";
	
	static Comparable o(Object o){
		return 40;
	}
	
	static Prac5 pracObj=new Prac5();
	
	static void add(){
		var v1=20;
		var v2=10;		
		int i=Integer.parseInt(Prac5.pracObj.o+"");
		int j=Integer.valueOf(Prac5.o(null)+"");
		System.out.println(v1+v2+i+j);
	}
}

class Prac5Test{
	
	public static void main(String...xxyy){
		Prac5.add();
	}
}

