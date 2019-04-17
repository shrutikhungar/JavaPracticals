//Requirement: to print fruit class

package com.k2js.aboutobjects.practise;

class Fruits{
	String name;
	String color;
	String taste;
	
	@Override
	public String toString(){
		String frName=this.name +"\n";
		String frColor=this.color+"\n";
		String frTaste=this.taste+"\n";
		return (frName+frColor+frTaste);
	}
}

class FruitsTest{
	
	public static void main(String...xxyy){
		//creating first object
		Fruits fruitObj1=new Fruits();
		fruitObj1.name="Apple";
		fruitObj1.color="red";		
		fruitObj1.taste="sweet";
		System.out.println("First fruit details");
		System.out.println(fruitObj1);
		
		//creating second object
		Fruits fruitObj2=new Fruits(){
			@Override
			public String toString(){
				return ("i am king of all fruits");
			}
		};
		fruitObj2.name="Mango";
		fruitObj2.color="Yellow";		
		fruitObj2.taste="Sour and Sweet";
		System.out.println("Second fruit details");
		System.out.println(fruitObj2);
		
		
	}
}