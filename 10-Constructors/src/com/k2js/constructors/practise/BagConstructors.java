//Requirement: to create contructors for bag class

package com.k2js.constructors.practise;

class BagConstructors{
	int size_in_ltr;
	String color;
	int price;
	
	BagConstructors(String color,int size_in_ltr){
		this.color=color;
		this.size_in_ltr=size_in_ltr;
	}
	
	BagConstructors(String color,int size_in_ltr,int price){
		this.color=color;
		this.size_in_ltr=size_in_ltr;
		this.price=price;
	}
	
	@Override
	public String toString(){
		String size_in_ltr="\n"+this.size_in_ltr+"\n";
		String color=this.color+"\n";
		String price=this.price+"\n";
		return (size_in_ltr+color+price);
	}
}

class BagConstructorsTest{
	public static void main(String...xxyy){
		BagConstructors bagObj1=new BagConstructors("Pink",15);
		System.out.println("Printing first bag details:"+bagObj1);
		BagConstructors bagObj2=new BagConstructors("Black",25,400);
		System.out.println("Printing first bag details:"+bagObj2);
	}
}