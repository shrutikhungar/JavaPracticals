//Requirement : to access static and non static variable and method from static and non static context of same class 

package com.k2js.aboutobjects.practise;

interface StaticNonStaticPrac2{	
	static Comparable c=10;
	
	//by default any variable in interface is public static final
	java.io.Serializable s=20;
	static Object c(){
		return new Integer(30);
	}
	
	default Number s(){
		return Integer.valueOf(40);
	}
	
	default void add(){
		StaticNonStaticPrac2 prac2Obj=new StaticNonStaticPrac2(){};
		//below is not correct since by default any variable in interface is public static final
		//System.out.println((((Integer)StaticNonStaticPrac2.c)+(Integer)StaticNonStaticPrac2.c()) + (Integer.parseInt(this.s+"")+(Integer)this.s()));
		System.out.println((((Integer)StaticNonStaticPrac2.c)+(Integer)StaticNonStaticPrac2.c()) + (Integer.parseInt(StaticNonStaticPrac2.s+"")+(Integer)this.s()));
	}
	
	static void sub(){
		StaticNonStaticPrac2 prac3Obj=new StaticNonStaticPrac2(){};
		System.out.println(((Integer)StaticNonStaticPrac2.c+(Integer)StaticNonStaticPrac2.c()) - (Integer.parseInt(StaticNonStaticPrac2.s+"")+(Integer)(prac3Obj.s())));
	}
}

class StaticNonStaticPrac2Test{
	
	public static void main(String...xxyy){
		new StaticNonStaticPrac2(){}.add();
		StaticNonStaticPrac2.sub();
	}
}