//Requirement: to create a marker program to access marker attributes brand,color,price


package com.k2js.aboutobjects.practise;

class Marker{
	static String brand,color;
	static int price;
	
	public static void main(String...xxyy){
		Marker m1=new Marker();
		m1.brand="Luxor";
		m1.color="Black";
		m1.price=25;
		
		Marker m2=new Marker();
		m2.brand="rorito";
		m2.color="blue";
		m2.price=30;
		
		Marker m3=new Marker();
		m3.brand="Cello";
		m3.color="blue";
		m3.price=25;
		
		Marker m4=new Marker();
		m4.brand="Sigma";
		m4.color="black";
		m4.price=35;
		
		System.out.println("Marker Brand="+m1.brand+"   color="+m1.color+"    price="+m1.price);
		System.out.println("Marker Brand="+m2.brand+"   color="+m2.color+"    price="+m2.price);
		System.out.println("Marker Brand="+m3.brand+"   color="+m3.color+"    price="+m3.price);
		System.out.println("Marker Brand="+m4.brand+"   color="+m4.color+"    price="+m4.price);
	}
}

