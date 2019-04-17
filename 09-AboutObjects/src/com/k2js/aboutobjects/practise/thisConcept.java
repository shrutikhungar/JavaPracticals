//Requirement: to check this usage in other class

package com.k2js.aboutobjects.practise;

class ThisConcept{
	
	int i=100;
	void m(){
		//1. this only is an object. so no need to create another object for class ThisConcept
		System.out.println(this);
		
		//2. 1 is same as below
		String str1=String.valueOf(this);
		System.out.println(str1);
		
		//3. 2 is same as below
		String str2=str1.toString();
		System.out.println(str2);
		
		if(str1==str2)
			System.out.println("s1 is equal to s2");
		
		System.out.println(this.i);
	}
}

class ThisConceptTest{
	
	public static void main(String...xxyy){
		ThisConcept thisConceptObj=new ThisConcept();
		System.out.println(thisConceptObj);
		thisConceptObj.m();
	}
}