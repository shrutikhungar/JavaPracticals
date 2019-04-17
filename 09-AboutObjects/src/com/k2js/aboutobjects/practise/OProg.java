//Requirement: to access static and non static variable through static and non static context

package com.k2js.aboutobjects.practise;

class OProg{
	static Object o=new int[]{3,5};
	
	static Object o(Object o){
		if(o instanceof Integer){
			return ((int[])OProg.o)[0];
		}
		else if(o instanceof String){
			return ((int[])OProg.o)[1];
		}
		else 
			return new OProgLogic[]{new OProgLogic(),new OProgLogic(){}};
	}
}

class OProgLogic{
	Object o(Object o){
		if(o instanceof Double){
			return "15";
		}
		else {
			return new OProg[]{new OProg()};
		}
	}
	
	void add(){
		int i3=(Integer)OProg.o(10);
		int i5=(Integer)OProg.o("t");
		int i15=Integer.valueOf(this.o(15.).toString());
		System.out.println(i3+i5+i15);
	}
	
	static void sub(){
		int i3=(Integer)OProg.o(10);
		int i5=(Integer)OProg.o("t");
		OProgLogic oProgLogicObj=((OProgLogic[])OProg.o('v'))[0];
		int i15=Integer.parseInt(oProgLogicObj.o(10.).toString());
		System.out.println(i3+i5+i15);
	}
}

class OProgLogicTest{
	public static void main(String...xxyy){
		new OProgLogic().add();
		OProgLogic.sub();
	}
}