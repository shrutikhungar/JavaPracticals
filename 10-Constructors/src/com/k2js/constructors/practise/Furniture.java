//Requirement: to create Furniture object

package com.k2js.constructors.practise;

class Furniture{
	String brand;
	String type;
	String color;
	int price;
	
	Furniture(String brand,int price){
		this.brand=brand;
		this.price=price;
	}
	
	Furniture(String brand,String type,int price){
		this.brand=brand;
		this.type=type;
		this.price=price;
	}
	
	Furniture(String brand,String type, String color,int price){
		this.brand=brand;
		this.type=type;
		this.color=color;
		this.price=price;
	}
	
	public String toString(){
		String brandName="\n"+this.brand+"\n";
		String type=((this.type==null)?"Type not available":this.type)+"\n";
		String color=((this.color==null)?"Color not available":this.color)+"\n";
		String price=this.price+"\n";
		return brandName+type+color+price;		
	}
}

class FurnitureTest{
	public static void main(String...xxyy){
		//First Object
		Furniture furnObj1=new Furniture("Hometown",20000);
		System.out.println("First Object: "+furnObj1);
		
		//Second Object
		Furniture furnObj2=new Furniture("HomeCenter","Table",20000);
		System.out.println("First Object: "+furnObj2);
		
		//Third Object
		Furniture furnObj3=new Furniture("Fern","Bed","Brown",30000);
		System.out.println("First Object: "+furnObj3);
	}
}