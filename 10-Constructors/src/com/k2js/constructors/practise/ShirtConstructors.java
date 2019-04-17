//Requirement: to construct object of shirt class

package com.k2js.constructors.practise;

class Shirt{
	String brand;
	String color;
	char size;
	int price;
	
	Shirt(String brand, int price){
		this.brand=brand;
		this.price=price;
	}
	
	Shirt(String brand, char size, int price){
		this.brand=brand;
		this.size=size;
		this.price=price;
	}
	
	Shirt(String brand, String color, char size, int price){
		this.brand=brand;
		this.color=color;
		this.size=size;
		this.price=price;
	}
	
	public String toString(){
		String shirtBrand="\n"+this.brand+"\n";
		String shirtColor=((this.color==null)?"Color not available":this.color)+"\n";
		String shirtSize=((this.size==0)?"Size not available":this.size)+"\n";
		String shirtPrice=this.price+"\n";
		return shirtBrand+shirtColor+shirtSize+shirtPrice;
	}
}

class ShirtTest{
	public static void main(String...xxyy){
		//first shirt object
		Shirt shirtObj1=new Shirt("Lifestyle","Red",'M',600);
		System.out.println("First Shirt Details: "+shirtObj1);
		
		//second shirt object
		Shirt shirtObj2=new Shirt("Mist",'M',500);
		System.out.println("Second Shirt Details: "+shirtObj2);
		
		//Third shirt object
		Shirt shirtObj3=new Shirt("Levis",700);
		System.out.println("Third Shirt Details: "+shirtObj3);
	}	
}




