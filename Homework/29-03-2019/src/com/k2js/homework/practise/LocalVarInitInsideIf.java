//Requirement: access local var without initilizing

package com.k2js.homework.practise;

class LocalVarInitInsideIf{
	
	public static void main(String...xxyy){
		int x;	
		if(xxyy.length>1)
			x=10;
		System.out.println(x);
	}
}
/*
java:9: error: variable x might not have been initialized
                System.out.println(x);
                            
*/