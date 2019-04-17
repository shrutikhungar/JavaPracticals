//Requirement to create bookent object with the help of constructors

package com.k2js.homeworks.practise;

class Book{
	String name;
	String author;
	int noOfPages;
	
	Book(String name,String author){
		this.name=name;
		this.author=author;
	}
	
	Book(String name,String author,int noOfPages){
		this.name=name;
		this.author=author;
		this.noOfPages=noOfPages;
	}
	
	public String toString(){
		String name="\n"+this.name;
		String author="\n"+this.author+"\n";
		String noOfPages=(this.noOfPages==0)?"No of pages Not available":this.noOfPages+"\n";
		return name+author+noOfPages;
	}
}

class BookTest{
	public static void main(String...xxyy){
		Book bookObj1=new Book("Book of Knowledge","Karan");
		System.out.println("\n"+bookObj1);
		
		Book bookObj2=new Book("Encyclopedia","Steven",478);
		System.out.println(bookObj2);
	}
}
