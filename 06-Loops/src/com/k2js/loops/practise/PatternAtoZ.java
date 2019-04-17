//Requirement: To print number of stars

package com.k2js.loops.practise;

class PrintAtoZPattern{
	
	static void printAtoZPattern(){
		//System.out.print((i%5==0)?"*\n":"*");
		for(int i=0;i<26;i++){					
			if(i%5==0)
				System.out.println("");				
			System.out.print((char)(i+65));
			
		}
	}
}

class PrintAtoZPatternTest{
	
	public static void main(String...xxyy){
		PrintAtoZPattern.printAtoZPattern();	
	}
}