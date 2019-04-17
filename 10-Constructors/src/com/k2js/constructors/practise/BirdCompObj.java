//Requirement: bird class: color name mandatory, beak length not mandatory

package com.k2js.constructors.practise;

class BirdCompObj{
	String name;
	String color;
	int beakLen;
	
	BirdCompObj(String name, String color, int beakLen){
		this.name=name;
		this.color=color;
		this.beakLen=beakLen;
	}
	
	BirdCompObj(String name, String color){
		this.name=name;
		this.color=color;
	}
	
	public String toString(){
		String name="\n"+"Bird Name:"+this.name+"\n";
		String color="Bird color:"+this.color+"\n";
		String beakLen=(this.beakLen==0)?"Beak Length: Beak length not available":"Beak Length: "+this.beakLen+"\n";
		return name+color+beakLen;
	}
	
	public boolean equals(Object obj){
		boolean b1=(obj instanceof BirdCompObj);
		boolean b2=this.name.equals(((BirdCompObj)obj).name);
		boolean b3=this.color.equals(((BirdCompObj)obj).color);
		boolean b4=this.beakLen==(((BirdCompObj)obj).beakLen);
		return b1 && b2 && b3 && b4;
	}
}

class BirdCompObjTest{
	public static void main(String...xxyy){
		
		//first object
		BirdCompObj obj1=new BirdCompObj("Peacock","8",23);
		System.out.println(obj1);
		
		//second object
		BirdCompObj obj2=new BirdCompObj("Peacock","8",2);
		System.out.println(obj2);
		
		//compare
		System.out.println(obj1.equals(obj2));
	}
}