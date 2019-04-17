//Requirement: to add static and non static variables

package com.k2js.homeworks.practise;

class Prac1{
	static Object o="30";	
	static Prac1Logic prac1LogicObj=new Prac1Logic();
	
	Object o(Object o){
		//in terenary operator which ever is the biggest data type will be considered for all
		return (o instanceof Integer)?"10":(o instanceof String)?20:40l;
	}
}

class Prac1Logic{
	Object o=500f;
	Prac1 prac1Obj=new Prac1();

	static void add(){
		//500+10+20+40+30		
		float f500=(float)Prac1.prac1LogicObj.o;
		int i10=Integer.valueOf(String.valueOf(Prac1.prac1LogicObj.prac1Obj.o(0)));
		long l20=(long)Prac1.prac1LogicObj.prac1Obj.o("t");
		int i30=Integer.valueOf(String.valueOf(Prac1.o));
		long l40=(long)Prac1.prac1LogicObj.prac1Obj.o('c');
		
		System.out.println(f500+i10+l20+i30+l40);			
	}
	
	void sub(){
		float f500=(float)this.o;
		int i10=Integer.valueOf(this.prac1Obj.o(10)+"");
		long l20=(long)this.prac1Obj.o("t");
		int i30=Integer.valueOf(String.valueOf(Prac1.o));
		long l40=(long)this.prac1Obj.o('c');
		
		System.out.println((f500)-(i10+l20+i30+l40));				
	}
}

class Prac1LogicTest{
	
	public static void main(String...xxyy){
		Prac1Logic.add();
		Prac1.prac1LogicObj.sub();
	}
}