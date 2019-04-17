//Requirement: to practise for static and non static variable access

package com.k2js.homeworks.practise;

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
	
	static void add(){
		System.out.println(((Integer)StaticNonStaticPrac2.c+(Integer)StaticNonStaticPrac2.c()) + (Integer.parseInt(StaticNonStaticPrac2.s+"")+(Integer)new StaticNonStaticPrac2(){}.s()));
	}
	
	default void sub(){
		System.out.println((Integer)StaticNonStaticPrac2.c+(Integer)StaticNonStaticPrac2.c() - Integer.parseInt(StaticNonStaticPrac2.s+"")+(Integer)this.s());
	}
}

class StaticNonStaticPrac2Test{
	public static void main(String...xxyy){
		StaticNonStaticPrac2.add();
		new StaticNonStaticPrac2(){}.sub();
	}
}
