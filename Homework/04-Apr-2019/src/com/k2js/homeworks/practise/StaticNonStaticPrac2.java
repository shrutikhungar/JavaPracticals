//requirement: to add static and non static variable values from static and non static context

package com.k2js.homeworks.practise;

class Prac2{
	static Object o="50";
	
	Object o(Object o){
		return 40;
	}
	static Object prac2Obj=new Prac2(){};
}

class Prac2Logic{
	Object o=30;
	
	static Object p(String s){
		return 20;
	}
	
	void add(){
		//50+40+30+20;
		int i=Integer.valueOf(String.valueOf(Prac2.o));
		//below all posibilities are there j
		//Way 1:
		int j=(Integer)(((Prac2)Prac2.prac2Obj).o(null));
		//Way 2:int j=(Integer)(((Prac2)Prac2.prac2Obj).o(10));
		//Way 3:int j=(Integer)(((Prac2)Prac2.prac2Obj).o((Integer)10));
		//Way 4:int j=(Integer)(((Prac2)Prac2.prac2Obj).o((Object)(Integer)10));
		int k=(Integer)(this.o);
		int l=(Integer)Prac2Logic.p("t");
		System.out.println(i+j+k+l);
	}
	
	static void sub(){
	//50+40 - 30+20;
		int i=Integer.valueOf(Prac2.o.toString());
		int j=(Integer)(((Prac2)Prac2.prac2Obj).o(10));
		int k=(Integer)(new Prac2Logic().o);
		int l=(Integer)Prac2Logic.p("t");
		System.out.println((i+j)-(k+l));
	}
}

class Prac2LogicTest{
	
	public static void main(String...xxyy){
		new Prac2Logic().add();
		new Prac2Logic().sub();
	}
}