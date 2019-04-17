//Requirement: to create a toothbrush class

package com.k2js.aboutobjects.practise;

class Toothbrush{
	String bristlesType;
	String brand;
	String color;
	int price;	
	
	@Override
	public String toString(){
		String underline="\n"+"============="+"\n";
		String brName="Brush Name="+this.brand+"\n";		
		String brColor="Brush Color="+this.color+"\n";	
		String brBristlesType="Brush Bristles Type="+this.bristlesType+"\n";
		String brPrice="Brush Price="+this.price+"\n";	
		
		return ("Brush Details:" +underline+brName+brColor+brPrice+brBristlesType);
	}
}

class ToothbrushTest{
	public static void main(String...xxyy){
		//creating first toothbrush object
		Toothbrush tBrushObj1=new Toothbrush();
		tBrushObj1.bristlesType="Soft";
		tBrushObj1.brand="Colgate";
		tBrushObj1.color="White";
		tBrushObj1.price=20;
		System.out.println("*******First toothbrush*******");
		System.out.println(tBrushObj1);
		
		//creating second toothbrush object
		Toothbrush tBrushObj2=new Toothbrush();
		tBrushObj2.bristlesType="Super soft";
		tBrushObj2.brand="Patanjali";
		tBrushObj2.color="Red";
		tBrushObj2.price=25;
		System.out.println("*******Second toothbrush*******");
		System.out.println(tBrushObj2);		
		
		//creating third toothbrush object
		Toothbrush tBrushObj3=new Toothbrush();
		tBrushObj3.bristlesType="Medium";
		tBrushObj3.brand="Meswak";
		tBrushObj3.color="Blue";
		tBrushObj3.price=30;
		System.out.println("*******Third toothbrush*******");
		System.out.println(tBrushObj3);
		
	}
}
	
