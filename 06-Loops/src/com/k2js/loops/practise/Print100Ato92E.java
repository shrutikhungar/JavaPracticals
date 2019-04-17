//Requirement: To print 100-A,98-B,96-C,94-D,92-E

package com.k2js.loops.practise;

class PrintNumberAndAlpha{
	
	static void printNumberAndAlpa(){
		for(int i =100,j='A', b=1 ; i>=92; i-=2,j++,b++){
			System.out.print(i +" "+(char)j+ " "+ b + "\n");		
		}
	}
}

class PrintNumberAndAlphaTest{
	
	public static void main(String...xxyy){
		PrintNumberAndAlpha.printNumberAndAlpa();
	}
}