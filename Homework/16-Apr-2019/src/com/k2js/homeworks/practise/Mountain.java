//Requirement: to create river class

package com.k2js.homeworks.practise;

class Mountain{
	String name;
	int height;
	String place;
	
	Mountain(String name, int heigth){
		this.name=name;
		this.height=height;
	}
	
	Mountain(String name,int height, String place){
		this.name=name;
		this.height=height;
		this.place=place;
	}
	
	public String toString(){
		String name="\n"+this.name+"\n";
		String height=this.height+"\n";
		String place=(this.place==null)?"Place is not available":this.place+"\n";
		return name+height+place;
	}
	
	public boolean equals(Object obj){
		boolean b1=(obj instanceof Mountain);
		boolean b2=this.name.equals(((Mountain)obj).name);
		boolean b3=this.height==(((Mountain)obj).height);
		boolean b4=this.place.equals(((Mountain)obj).place);
		return b1 && b2 && b3 && b4;
	}
}

class MountainTest{
	public static void main(String...xxyy){
		
		//first object
		Mountain mountainObj1=new Mountain("Kanchanjunga",9898,"Nepal");
		System.out.println(mountainObj1);
		
		//second object
		Mountain mountainObj2=new Mountain("Kanchanjunga",9898,"Nepal");
		System.out.println(mountainObj2);
		
		//compare
		System.out.println(mountainObj1.equals(mountainObj2));
	}
}