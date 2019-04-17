//Requirement: to access static and non static variable through static and non static context

package com.k2js.homeworks.practise;

class ObjAccessPrac{
	static Object o=new int[]{3,5};
	
	static Object o(Object o){
		if(o instanceof Integer)
			return ((int[])ObjAccessPrac.o)[0];
		else if (o instanceof String)
			return ((int[])ObjAccessPrac.o)[1];
		else 
			return new ObjAccessPracLogic[]{new ObjAccessPracLogic(),new ObjAccessPracLogic(){}};
	}
}

class ObjAccessPracLogic{
	Object o(Object o){
		if(o instanceof Double)
			return "15";
		else 
			return new ObjAccessPrac[]{new ObjAccessPrac()};
	}
	void add(){
		//3+5+15
		//int i3=((int[])ObjAccessPrac.o)[0];
		int i3=(Integer)(ObjAccessPrac.o(10));
		//int i5=((int[])ObjAccessPrac.o)[1];
		int i5=Integer.parseInt(ObjAccessPrac.o("s").toString());
		int i15=Integer.valueOf(this.o(10.).toString());
		System.out.println(i3+i5+i15);
	}
	
	static void sub(){
		//3+5-15
		int i3=(Integer)ObjAccessPrac.o(10);				
		int i5=Integer.parseInt(ObjAccessPrac.o("10").toString());
		ObjAccessPracLogic obj=((ObjAccessPracLogic[])ObjAccessPrac.o('v'))[0];
		int i15=Integer.valueOf(obj.o(10.).toString());
		System.out.println(i3+i5+i15);
	}
}

class ObjAccessPracTest{
	public static void main(String...xxyy){
		new ObjAccessPracLogic().add();
		ObjAccessPracLogic.sub();
	}
}