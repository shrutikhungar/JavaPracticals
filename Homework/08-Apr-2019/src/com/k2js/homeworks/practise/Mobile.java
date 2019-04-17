//Requirement: to create a class called mobile

package com.k2js.homeworks.practise;

class Mobile{
	String brandName;
	String color;
	int screenSize;
	String operSystem;
	public String toString(){
		String brandName="\n"+"Phone brand: "+this.brandName+"\n";
		String color="Phone color: "+this.color+"\n";
		String size="Phone size: "+this.screenSize+"\n";
		String operSystem="Phone operating system: "+this.operSystem;
		return (brandName+color+size+operSystem);
	}
}

class MobileTest{
	public static void main(String...xxyy){
		//First Mobile
		Mobile mobObj1=new Mobile();
		mobObj1.brandName="Nokia";
		mobObj1.color="blue";
		mobObj1.screenSize=13;
		mobObj1.operSystem="Andriod";
		System.out.println("First mobile:"+mobObj1);
		
		//Second Mobile
		Mobile mobObj2=new Mobile(){
			public String toString(){
				return ("\n"+brandName);
			}
		};
		mobObj2.brandName="Nokia";
		mobObj2.color="blue";
		mobObj2.screenSize=13;
		mobObj2.operSystem="Andriod";
		System.out.println("Second mobile:"+mobObj2);
		
	}
}