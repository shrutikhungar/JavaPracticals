//Requirment : to add 4 number static and non static from static and non static methods

package com.k2js.homeworks.practise;

class Prac4{
	static CharSequence cs1="40";
	CharSequence cs2=new StringBuffer("50");
	
	static CharSequence cs(Object o){
		return new StringBuilder("30");
	}
	
	CharSequence cs(String s){
		return "20";
	}
	
	int cs(Number n){
		Object obj=null;
		int i40=Integer.valueOf((Prac4.cs1).toString());
		int i50=Integer.parseInt((this.cs2).toString());
		int i30=Integer.valueOf(Prac4.cs(obj)+"");
		int i20=Integer.valueOf(String.valueOf(this.cs("t")));
		return (i40+i50+i30+i20);	
	}
	
	static int cs(Comparable c){
		int i40=Integer.valueOf(Prac4.cs1+"");
		int i50=Integer.parseInt((new Prac4().cs2).toString());
		int i30=Integer.parseInt(Prac4.cs((Object)10)+"");
		int i20=Integer.parseInt(new Prac4().cs("t")+"");
		return i40+i50+i30+i20;
	}
}

class Prac4Test{
	public static void main(String...xxyy){
		System.out.println(new Prac4().cs((Number)10));
		System.out.println(Prac4.cs((Comparable)10));
	}
}