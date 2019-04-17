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
	
	@Override
	public boolean equals(Object obj){	
		boolean b1=(obj instanceof Shoe);
		boolean b2=this.color.equals(((Shoe)obj).color);
		boolean b3=this.brand.equals(((Shoe)obj).brand);
		boolean b4=this.price==(((Shoe)obj).price);
		return b1 && b2 && b3 && b4;
	}	
}

class ShoeTest{
	public static void main(String...xxyy){
		
		//first object
		Shoe shoeObj1=new Shoe("black","Bata",878);
		System.out.println(shoeObj1);
		
		//second object
		Shoe shoeObj2=new Shoe("black","Bata",878);
		System.out.println(shoeObj2);
		
		//third object
		Shoe shoeObj3=new Shoe("Brown","Bata",878);
		System.out.println(shoeObj3);
		
		//comparing both objects: reference comparisn
		System.out.println(shoeObj1==shoeObj2);
		//comparing both objects: reference comparisn, accessing Object class .equals method which is reference comparsn
		System.out.println(shoeObj2.equals(shoeObj3));
	}
}