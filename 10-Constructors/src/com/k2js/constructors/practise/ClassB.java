//Requirement to analyse a constructor

package com.k2js.constructors.practise;

class B{
	int i;
	String s;

	B(int i){
		
	}

	B(String s){
		this.s=s;
	}

	B(String s,int i){
		this(s);
	}
	
	B(int i,String s){
	}
	
	B(){
	}

	public static void main(String...xxyy){
		new B("Hello",1);
	}
}