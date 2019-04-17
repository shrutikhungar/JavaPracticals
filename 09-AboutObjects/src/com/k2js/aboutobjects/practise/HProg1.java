//Requirment : to add 4 number static and non static from static and non static methods

package com.k2js.aboutobjects.practise;

class HProg{
	static CharSequence cs1="40";
	CharSequence cs2=new StringBuffer("50");
	
	static CharSequence cs(Object o){
		return new StringBuilder("30");
	}
	
	CharSequence cs(String s){
		return "20";
	}
	
	int cs(Number n){
		int i=Integer.parseInt(HProg.cs1+"");
		int j=Integer.parseInt((StringBuffer)this.cs2+"");
		//1. int k=Integer.valueOf((HProg.cs((Object)null)).toString());		
		//2. Object o=null;
		//2. int k=Integer.valueOf((HProg.cs((null)).toString());		
		//3. passing null in the reference and converting null to (Object) if more than one add method is there which is taking object
		int k=Integer.valueOf(String.valueOf((HProg.cs((Object)null))));		

		int l=Integer.parseInt(this.cs("test")+"");
		return i+j+k+l;	
	}
	
	static int cs(Comparable c){
		Object o=null;
		int i=Integer.parseInt(HProg.cs1+"");
		int j=Integer.parseInt((StringBuffer)new HProg().cs2+"");
		int k=Integer.parseInt(HProg.cs(o).toString());
		int l=Integer.parseInt(new HProg().cs("test")+"");
		return (i+j)-(k-l);
	}	
}

class HProgTest{
	public static void main(String...xxyy){
		System.out.println(new HProg().cs((Number)10));
		System.out.println(HProg.cs((Comparable)10));
	}
}