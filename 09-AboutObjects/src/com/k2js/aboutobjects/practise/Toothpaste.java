//Requirement: to create a toothpaste class

package com.k2js.aboutobjects.practise;

class Toothpaste{
	String flavour;
	String brand;
	String color;
	int size_in_gms;
	int price;
}

class ToothpasteTest{
	public static void main(String...xxyy){
		
		//creating first object of toothpaste class
		Toothpaste tPasteObj1=new Toothpaste();
		tPasteObj1.flavour="Mint";
		tPasteObj1.brand="Colgate";
		tPasteObj1.color="Red";
		tPasteObj1.size_in_gms=25;
		tPasteObj1.price=10;
		System.out.println();
		System.out.println("*******First toothpaste*******");
		System.out.println("First toothpaste flavour: "+tPasteObj1.flavour);
		System.out.println("First toothpaste brand: "+tPasteObj1.brand);
		System.out.println("First toothpaste color: "+tPasteObj1.color);
		System.out.println("First toothpaste size_in_gms: "+tPasteObj1.size_in_gms);
		System.out.println("First toothpaste price: "+tPasteObj1.price);
		
		//creating second object of toothpaste class
		Toothpaste tPasteObj2=new Toothpaste();
		tPasteObj2.flavour="Sweet";
		tPasteObj2.brand="Patanjali";
		tPasteObj2.color="White";
		tPasteObj2.size_in_gms=50;
		tPasteObj2.price=20;
		System.out.println();
		System.out.println("*******Second toothpaste*******");
		System.out.println("Second toothpaste flavour: "+tPasteObj2.flavour);
		System.out.println("Second toothpaste brand: "+tPasteObj2.brand);
		System.out.println("Second toothpaste color: "+tPasteObj2.color);
		System.out.println("Second toothpaste size_in_gms: "+tPasteObj2.size_in_gms);
		System.out.println("Second toothpaste price: "+tPasteObj2.price);

		//creating third object of toothpaste class
		Toothpaste tPasteObj3=new Toothpaste();
		tPasteObj3.flavour="Strawberry";
		tPasteObj3.brand="Meswak";
		tPasteObj3.color="Blue";
		tPasteObj3.size_in_gms=100;
		tPasteObj3.price=50;		
		System.out.println();
		System.out.println("*******Third toothpaste*******");		
		System.out.println("Third toothpaste flavour: "+tPasteObj3.flavour);
		System.out.println("Third toothpaste brand: "+tPasteObj3.brand);
		System.out.println("Third toothpaste color: "+tPasteObj3.color);
		System.out.println("Third toothpaste size_in_gms: "+tPasteObj3.size_in_gms);
		System.out.println("Third toothpaste price: "+tPasteObj3.price);
		
		//creating fourth object of toothpaste class
		Toothpaste tPasteObj4=new Toothpaste();
		tPasteObj4.flavour="Plain";
		tPasteObj4.brand="Himalaya";
		tPasteObj4.color="Red and White";
		tPasteObj4.size_in_gms=150;
		tPasteObj4.price=75;
		System.out.println();
		System.out.println("*******Fourth toothpaste*******");
		System.out.println("Fourth toothpaste flavour: "+tPasteObj4.flavour);
		System.out.println("Fourth toothpaste brand: "+tPasteObj4.brand);
		System.out.println("Fourth toothpaste color: "+tPasteObj4.color);
		System.out.println("Fourth toothpaste size_in_gms: "+tPasteObj4.size_in_gms);
		System.out.println("Fourth toothpaste price: "+tPasteObj4.price);

	}
}