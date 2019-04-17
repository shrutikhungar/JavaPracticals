//Requirement: access local var without initilizing

package com.k2js.homework.practise;

class LocalVarNotInitialize{
	
	public static void main(String...xxyy){
		int x=10;	
		System.out.println(x);
	}
}
/*
java:9: error: variable x might not have been initialized
                System.out.println(x);
                            
*/