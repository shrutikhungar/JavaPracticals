//Requirement : to access static and non static variable and method from static and non static context of same class 

package com.k2js.aboutobjects.practise;

class StaticNonStaticPrac1{
	
	static int m(){
		return 10;
	}
	int n(){
		return 10;
	}
	int m=30;
	static int n=40;
	
	public void methAdd(int a,int b){
		//System.out.println((StaticNonStaticPrac1.m()+this.m+a) + (this.n()+StaticNonStaticPrac1.n+b)); 
		//or
		StaticNonStaticPrac1 obj=this;
		System.out.println((StaticNonStaticPrac1.m()+obj.m+a) + (obj.n()+StaticNonStaticPrac1.n+b)); 
	}
	
	public static void methAdd(int a,int b,int k){
		StaticNonStaticPrac1 prac1Obj=new StaticNonStaticPrac1();
		System.out.println((StaticNonStaticPrac1.m()+prac1Obj.m+a) + (prac1Obj.n()+StaticNonStaticPrac1.n+b)-k); 
	}
}

class StaticNonStaticPrac1Test{
	
	public static void main(String...xxyy){
		new StaticNonStaticPrac1().methAdd(1,1);
		StaticNonStaticPrac1.methAdd(2,4,5);
	}
}