//Requirement: to add 4 numbers (static and non static variables) from static and non static context

package com.k2js.aboutobjects.practise;

class JProg{
	static Object o="50";
	
	Object o(Object o){
		return 40;
	}
	static Object jProgObj=new JProg(){};
}

class JProgLogic{
	Object o=30;
	
	static Object p(String s){
		return 20;
	}
	
	void add(){
		//50+40+30+20;
		Object o=null;
		int i=Integer.valueOf(JProg.o+"");
		int k=(Integer)this.o;
		int l=(Integer)JProgLogic.p("test");
		//int j=(Integer)(((JProg)JProg.jProgObj).o(null));		
		JProg jProgObj1=(JProg)JProg.jProgObj;
		int j=(Integer)(jProgObj1.o(null));		
		System.out.println(i+j+k+l);
	}
	
	static void sub(){
		//50+40 - 30+20;
		int i=Integer.valueOf(JProg.o+"");
		JProg jProgObj2=(JProg)JProg.jProgObj;
		int j=(Integer)jProgObj2.o(null);
		int k=(Integer)new JProgLogic().o;
		int l=(Integer)JProgLogic.p("test");
		System.out.println((i+j)-(k+l));
	}
}

class JProgTest{
	
	public static void main(String...xxyy){
		new JProgLogic().add();
		new JProgLogic().sub();
	}
}
