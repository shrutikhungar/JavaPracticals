//requirement: To find out the length of the string:

package com.k2js.string.practise;

class StringLength{
	public static void main(String...cc){
		String s="Hello";
		CharSequence cs="JavaWorld";
		Object o="Java Selenium";
		int l1=s.length();
		System.out.println("compile time polymorphism" +l1);
		int l2=cs.length();
		System.out.println("Run time polymorphism" +l2);
		int l3=((String)o).length();
		System.out.println("Compile time polymorphism" +l3);
		int l4=(o+"").length();
		System.out.println("compile time polymorphism" +l4);
		int l5=(o.toString().length());
		System.out.println("compile time polymorphism" +l5);
		int l6=(String.valueOf(o).length());
		System.out.println("compile time polymorphism" +l6);



	}
}	
