//Requirement: to create television object

package com.k2js.constructors.practise;

class Television{
	String brand;
	int screenSize;
	String type;
	int price;
	
	Television(String brand,int price){
		this.brand=brand;
		this.price=price;
	}
	
	Television(String brand,int screenSize,int price){
		this.brand=brand;
		this.screenSize=screenSize;
		this.price=price;
	}
	
	Television(String brand,int screenSize, String type,int price){
		this.brand=brand;
		this.screenSize=screenSize;
		this.type=type;
		this.price=price;
	}
	
	public String toString(){
		String brandName="\n"+this.brand+"\n";
		String screenSize=((this.screenSize==0)?"Screen size not available":this.screenSize)+"\n";
		String type=((this.type==null)?"Type not available":this.type)+"\n";
		String price=this.price+"\n";
		return brandName+screenSize+type+price;
	}
}

class TelevisionTest{
	public static void main(String...xxyy){
		//First Object
		Television teleObj1=new Television("Sony",20000);
		System.out.println("First Object: "+teleObj1);
		
		//Second Object
		Television teleObj2=new Television("Sony",35,20000);
		System.out.println("First Object: "+teleObj2);
		
		//Third Object
		Television teleObj3=new Television("Sony",35,"LCD",20000);
		System.out.println("First Object: "+teleObj3);
	}
}