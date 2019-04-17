//Requirement: shoe class: color, brand mandatory, price not mandatory

package com.k2js.constructors.practise;

class Shoe{
	String color;
	String brand;
	int price;
	
	Shoe(String color,String brand){
		this.color=color;
		this.brand=brand;
	}
	
	Shoe(String color,String brand, int price){
		this.color=color;
		this.brand=brand;
		this.price=price;
	}
	
	@Override
	public String toString(){
		String color="\n"+"Shoe Color:"+this.color+"\n";
		String brand="Shoe Brand:"+ this.brand+"\n";
		String price=(this.price==0)?"Shoe Price: Price not available":"Shoe Price: "+this.price+"";
		return color+brand+price;
	}
}

class ShoeTest{
	public static void main(String...xxyy){
		
		//first object
		Shoe shoeObj1=new Shoe("black","Bata");
		System.out.println(shoeObj1);
		
		//second object
		Shoe shoeObj2=new Shoe("Brown","Inc",878);
		System.out.println(shoeObj2);
	}
}