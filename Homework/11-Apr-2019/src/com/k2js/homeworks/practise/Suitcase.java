//Requirement to craete suitcase object

package com.k2js.homeworks.practise;

class Suitcase{
	String brandName;
	String color;
	int size;
	int price;
	
	Suitcase(String brandName, String color, int size){
		this.brandName=brandName;
		this.color=color;
		this.size=size;	
	}
	
	Suitcase(String brandName, String color, int size, int price){
		this.brandName=brandName;
		this.color=color;
		this.size=size;
		this.price=price;
	}
	
	public String toString(){
		String brandName="\n"+this.brandName+"\n";
		String color=this.color+"\n";
		String size=this.size+"\n";
		String price=(this.price==0)?"Price Not Available":this.price+"\n";
		return brandName+color+size+price;
	}
}

class SuitcaseTest{
	public static void main(String...xxyy){
		Suitcase suitcaseObj1=new Suitcase("VIP","Red",20);
		System.out.println(suitcaseObj1);
		
		Suitcase suitcaseObj2=new Suitcase("Sky Bag","White",50,878);
		System.out.println(suitcaseObj2);
	}
}