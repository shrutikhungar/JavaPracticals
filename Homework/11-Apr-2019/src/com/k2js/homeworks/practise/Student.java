//Requirement to create student object with the help of constructors

package com.k2js.homeworks.practise;

class Student{
	int id;
	String name;
	int marks;
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	Student(int id,String name,int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString(){
		String id="\n"+this.id;
		String name="\n"+this.name+"\n";
		String marks=(this.marks==0)?"Marks Not available":this.marks+"\n";
		return id+name+marks;
	}
}

class StudentTest{
	public static void main(String...xxyy){
		Student studObj1=new Student(223,"Marks");
		System.out.println("\n"+studObj1);
		
		Student studObj2=new Student(22,"Spencer",602);
		System.out.println(studObj2);
	}
}