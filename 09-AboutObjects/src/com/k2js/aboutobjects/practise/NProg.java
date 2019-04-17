//Requirement: to 

package com.k2js.aboutobjects.practise;

class NProg{
	Object a=new int[]{3,5};
	static NProgLogic[] b=new NProgLogic[]{new NProgLogic(),new NProgLogic(){}};
}

class NProgLogic{
	NProg o1=new NProg[]{new NProg(),new NProg(){}}[0];
	static Object o2="50";
	Object o3=60.;
	
	void add(){
		//3+5+50+60
		int i3=((int[])(this.o1.a))[0];
		int i5=((int[])(this.o1.a))[1];
		int i50=Integer.parseInt(NProgLogic.o2.toString());
		double i60=Double.parseDouble(this.o3.toString());
		System.out.println(i3+i5+i50+i60);		
	}
	
	static void sub(){
		//(3+5+60)-50
		int i3=((int[])(NProg.b[1].o1.a))[0];
		int i5=((int[])(NProg.b[1].o1.a))[1];
		int i50=Integer.parseInt(NProgLogic.o2.toString());
		double i60=(Double)(NProg.b[0].o3);
		System.out.println((i3+i5+i50)-(i60));		
	}
}

class NProgLogicTest{
	public static void main(String...xxyy){
		new NProgLogic().add();
		NProgLogic.sub();
	}
}