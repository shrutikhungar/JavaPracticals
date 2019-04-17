//Requirement: To generate number btween 50 to 100. break loop of greater than 75

package com.k2js.loops.practise;

class GenerateAbove75Break{
	
	static void generateAbove75Break(){		
		int count=0;
		for (;;){
			int num=(int)((Math.random()*50)+50);
			if(num<=75){
				System.out.println("Number is less than 75: " + num);
			}
			else if (num>75){
				break;
			}
		}
	}
}

class GenerateAbove75BreakTest{
	
	public static void main(String...xxyy){
		GenerateAbove75Break.generateAbove75Break();
	}
}