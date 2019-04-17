//Requirement: to create book 

package com.k2js.homeworks.practise;

class Book{
	String bookName;
	int order;
	int noOfPages;
	public String toString(){
		String bookName="\n"+this.bookName+"\n";
		String order=this.order+"\n";
		String noOfPages=this.noOfPages+"";
		return bookName+order+noOfPages;
	}
}
	
class BookTest{
	public static void main(String...xyy){
		Book bookObj1=new Book();
		bookObj1.bookName="Key words";
		bookObj1.order=123;
		bookObj1.noOfPages=78;
		System.out.println("First book:"+bookObj1);
		
		Book bookObj2=new Book();
		bookObj2.bookName="Dictionary";
		bookObj2.order=1233;
		bookObj2.noOfPages=782;
		System.out.println("\n"+"Second book:"+bookObj2);
		
		Book bookObj3=new Book(){
			public String toString(){
				return "\n"+super.bookName;		
			}
		};
		bookObj3.bookName="Encyclopedia";
		bookObj3.order=1234;
		bookObj3.noOfPages=266;
		System.out.println("\n"+"Third book:"+bookObj3);
	}
}	