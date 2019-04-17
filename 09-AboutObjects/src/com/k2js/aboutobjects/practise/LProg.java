//Requirement: to add 4 numbers static and non static from static and non static context

package com.k2js.aboutobjects.practise;

class LProg{
	static Comparable c= "30";
	int[] a = new int[]{3,5};
	
	static Object c(int[] a){
		return new LProgLogic();
	}
}

class LProgLogic{
	LProg lProgObj=new LProg();
	Object a=20;
	static Comparable c = new StringBuffer("40");
	
	void add(){
		//30+3+5+20;		
		int i30 = Integer.parseInt(LProg.c.toString());
		int i3=this.lProgObj.a[0];
		int i5=this.lProgObj.a[1];
		int i20=Integer.parseInt(this.a.toString());
		int i40=Integer.parseInt(LProgLogic.c.toString());
		System.out.println(i30+i3+i5+i20+i40);
	}
	
	static void sub(){
		//(30+20)-(3+5);
		int[] a=((LProgLogic)(LProg.c(null))).lProgObj.a;
		int i30 = Integer.parseInt(LProg.c.toString());
		int i3=((LProgLogic)(LProg.c(a))).lProgObj.a[0];
		int i5=((LProgLogic)(LProg.c(a))).lProgObj.a[1];
		//int i3=((LProgLogic)(LProg.c(null))).lProgObj.a[0];
		//int i5=((LProgLogic)(LProg.c(null))).lProgObj.a[1];
		int i20=Integer.valueOf(((LProgLogic)(LProg.c(null))).a.toString());
		int i40=Integer.parseInt(LProgLogic.c.toString());
		System.out.println((i30+i20+i40)-(i3+i5));
	}
}

class LProgLogicTest{
	public static void main(String...xxyy){
		new LProgLogic().add();
		LProgLogic.sub();
	}
}