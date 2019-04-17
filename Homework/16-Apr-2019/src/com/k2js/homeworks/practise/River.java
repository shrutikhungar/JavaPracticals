//Requirement: to create river class

package com.k2js.homeworks.practise;

class River{
	String name;
	String birthPlace;
	int length;
	
	River(String name, String birthPlace){
		this.name=name;
		this.birthPlace=birthPlace;
	}
	
	River(String name, String birthPlace, int length){
		this.name=name;
		this.birthPlace=birthPlace;
		this.length=length;
	}
	
	public String toString(){
		String name=this.name+"\n";
		String birthPlace=this.birthPlace+"\n";
		String length=(this.length==0)?"Length is not available":this.length+"\n";
		return name+birthPlace+length;
	}
	
	public boolean equals(Object obj){
		boolean b1=(obj instanceof River);
		boolean b2=this.name.equals(((River)obj).name);
		boolean b3=this.length==(((River)obj).length);
		boolean b4=this.birthPlace.equals(((River)obj).birthPlace);
		return b1 && b2 && b3 && b4;
	}
}

class RiverTest{
	public static void main(String...xxyy){
		//first object
		River riverObj1=new River("Ganga","Haridwar",9898);
		System.out.println(riverObj1);
		
		//second object
		River riverObj2=new River("Ganga","Haridwar",9898);
		System.out.println(riverObj2);
		
		System.out.println(riverObj1.equals(riverObj2));
	}
}