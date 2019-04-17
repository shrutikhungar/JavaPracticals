//Requirement: to create objects of vegetables

package com.k2js.homeworks.practise;

class Vegetable{
	String type;
	String color;
	int price;
	
	Vegetable(String color,int price){
		this.color=color;
		this.price=price;
	}
	
	Vegetable(String type,String color,int price){
		this.type=type;
		this.color=color;
		this.price=price;
	}
	
	public String toString(){
		String type=(this.type==null)?"Type Not available":this.type;
		String color="\n"+this.color+"\n";
		String price=this.price+"\n";
		return type+color+price;
	}
}

class VegetableTest{
	public static void main(String...xxyy){
		Vegetable vegObj1=new Vegetable("red",89);
		System.out.println("\n"+vegObj1);
		
		Vegetable vegObj2=new Vegetable("Herbs","Green",60);
		System.out.println(vegObj2);
	}
}