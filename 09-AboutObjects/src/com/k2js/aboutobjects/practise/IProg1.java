//Requirement: to add 4 numbers (static and non static variables) from static and non static context

package com.k2js.aboutobjects.practise;

class IProg{
	Object o="50";
	
	static Comparable o(Object o){
		return 40;
	}
	
	static IProg iProgObj=new IProg();
	
	static void add(){
		var v1=20;
		var v2=10;
		int i=Integer.parseInt(IProg.iProgObj.o+"");
		//1. passing null in the reference and converting null to (Object) if more than one add method is there which is taking object
		Object o=null;
		int j=(Integer)IProg.o(null);		
		//2. passing object in the reference
		//Object o=new Object();
		//int j=(Integer)IProg.o(o);		
		System.out.println(v1+v2+i+j);
	}
}

class IProgTest{
	
	public static void main(String...xxyy){
		IProg.add();
	}
}

