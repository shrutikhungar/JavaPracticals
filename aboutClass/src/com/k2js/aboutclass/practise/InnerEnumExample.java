//Requirement: to access the elements of inner enum 

package com.k2js.aboutclass.practise;

class InnerEnumExample{
	
	enum InnerEnum{
		innerEnumObj;
		
		int i =20;
		static int j =10;
		
		public static void m(){
			System.out.println("Hello");
		}
		
		public void n(){
			System.out.println("World");
		}
	}
}

class InnerEnumExampleTests{
	
	public static void main(String...xxyy){
		System.out.println(InnerEnumExample.InnerEnum.j);
		System.out.println(InnerEnumExample.InnerEnum.innerEnumObj.i);
		InnerEnumExample.InnerEnum.m();
		InnerEnumExample.InnerEnum.innerEnumObj.n();
	}
}