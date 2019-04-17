//Requirement: To create a movie

package com.k2js.homeworks.practise;

class Movie{
	String movieName;
	String directorName;
	String actorName;
	
	public String toString(){
		String movieName=this.movieName+"\n";
		String directorName=this.directorName+"\n";
		String actorName=this.actorName;
		return movieName+directorName+actorName;
	}
}

class MovieTest{
	public static void main(String...xxyy){
		Movie movieObj1=new Movie();
		movieObj1.movieName="Star Wars";
		movieObj1.directorName="Steve Maiden";
		movieObj1.actorName="John Vich";
		System.out.println("First Movie Object: "+"\n"+movieObj1);
		
		Movie movieObj2=new Movie(){
			public String toString(){
				return super.movieName;
			}
		};
		movieObj2.movieName="Titanic";
		movieObj2.directorName="Cris";
		movieObj2.actorName="Abrahim";
		System.out.println("\n"+"Second Movie Object: "+"\n"+movieObj2);
	}		
}