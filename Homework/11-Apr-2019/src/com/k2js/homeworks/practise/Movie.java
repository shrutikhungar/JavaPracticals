//Requirement to create movieent object with the help of constructors

package com.k2js.homeworks.practise;

class Movie{
	String name;
	String director;
	String hero;
	
	Movie(String name,String director){
		this.name=name;
		this.director=director;
	}
	
	Movie(String name,String director,String hero){
		this.name=name;
		this.director=director;
		this.hero=hero;
	}
	
	public String toString(){
		String name="\n"+this.name;
		String director="\n"+this.director+"\n";
		String hero=(this.hero==null)?"Hero Not available":this.hero+"\n";
		return name+director+hero;
	}
}

class MovieTest{
	public static void main(String...xxyy){
		Movie movieObj1=new Movie("DDLJ","Karan");
		System.out.println("\n"+movieObj1);
		
		Movie movieObj2=new Movie("Titanic","Steven","Leonardo");
		System.out.println(movieObj2);
	}
}
