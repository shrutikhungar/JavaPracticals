//Requirement: to create a toothbrush class

package com.k2js.aboutobjects.practise;

class Toothbrush{
	String bristlesType;
	String brand;
	String color;
	int price;	
}

class ToothbrushTest{
	public static void main(String...xxyy){
		//creating first toothbrush object
		Toothbrush tBrushObj1=new Toothbrush();
		tBrushObj1.bristlesType="Soft";
		tBrushObj1.brand="Colgate";
		tBrushObj1.color="White";
		tBrushObj1.price=20;
		System.out.println();
		System.out.println("*******First toothbrush*******");
		System.out.println("First toothbrush bristles: "+tBrushObj1.bristlesType);
		System.out.println("First toothbrush brand: "+tBrushObj1.brand);
		System.out.println("First toothbrush bristles: "+tBrushObj1.color);
		System.out.println("First toothbrush bristles: "+tBrushObj1.price);
		
		//creating second toothbrush object
		Toothbrush tPasteObj2=new Toothbrush();
		tBrushObj2.bristlesType="Super soft";
		tBrushObj2.brand="Patanjali";
		tBrushObj2.color="Red";
		tBrushObj2.price=25;
		System.out.println();
		System.out.println("*******Second toothbrush*******");
		System.out.println("Second toothbrush bristles: "+tBrushObj2.bristlesType);
		System.out.println("Second toothbrush brand: "+tBrushObj2.brand);
		System.out.println("Second toothbrush bristles: "+tBrushObj2.color);
		System.out.println("Second toothbrush bristles: "+tBrushObj2.price);
		
		//creating third toothbrush object
		Toothbrush tBrushObj3=new Toothbrush();
		tBrushObj3.bristlesType="Medium";
		tBrushObj3.brand="Meswak";
		tBrushObj3.color="Blue";
		tBrushObj3.price=30;
		System.out.println();
		System.out.println("*******Third toothbrush*******");
		System.out.println("Third toothbrush bristles: "+tBrushObj3.bristlesType);
		System.out.println("Third toothbrush brand: "+tBrushObj3.brand);
		System.out.println("Third toothbrush bristles: "+tBrushObj3.color);
		System.out.println("Third toothbrush bristles: "+tBrushObj3.price);
	}
}