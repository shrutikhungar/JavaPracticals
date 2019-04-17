//Requirement: to 

package com.k2js.homeworks.practise;

class VarAccessPrac{
	Object a=new int[]{3,5};
	static VarAccessPracLogic[] b=new VarAccessPracLogic[]{new VarAccessPracLogic(),new VarAccessPracLogic(){}};
}

class VarAccessPracLogic{
	VarAccessPrac o1=new VarAccessPrac[]{new VarAccessPrac(),new VarAccessPrac(){}}[0];
	static Object o2="50";
	Object o3=60.;
	
	void add(){
		//3+5+50+60
		VarAccessPracLogic objLogic=VarAccessPrac.b[0];
		VarAccessPrac objPrac=objLogic.o1;
		//objPrac.a
		int i3=((int[])this.o1.a)[0];
		int i5=((int[])this.o1.a)[1];
		int i50=Integer.parseInt(VarAccessPracLogic.o2.toString());
		Double i60=Double.parseDouble(this.o3.toString());
		System.out.println(i3+i5+i50+i60);
	}
	static void sub(){
		//3+5+50+60
		VarAccessPracLogic objLogic=VarAccessPrac.b[0];
		VarAccessPrac objPrac=objLogic.o1;
		int i3=((int[])objPrac.a)[0];
		int i5=((int[])objPrac.a)[1];
		int i50=Integer.valueOf(VarAccessPracLogic.o2.toString());
		double i60=Double.parseDouble(objLogic.o3+"");
		System.out.println((i3+i5)-(i50+i60));
	}
}

class VarAccessPracLogicTest{
	public static void main(String...xxyy){
		new VarAccessPracLogic().add();
		VarAccessPracLogic.sub();		
	}
}