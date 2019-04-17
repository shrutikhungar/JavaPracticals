//Requirement: To generate random charactes and break loop when APPLE is printed

package com.k2js.loops.practise;

class GenerateAppleBreakLoop{
	
	static void generateAppleBreakLoop(){
		int aCount=0,pCount=0,lCount=0,eCount=0;
		for(;;)
		{
			char c=(char)(int)((Math.random()*26)+'A');
			if(c=='A'){
				aCount++;
			}
			else if (c=='P'){
				pCount++;
			}
			else if (c=='L') {
				lCount++;
			}
			else if (c=='E'){
				eCount++;
			}

			if(c=='A' || c=='P' || c=='L' || c=='E'){
				System.out.print(c);
			}
						
			if (aCount>=1 && pCount >=2 && eCount>=1 && lCount>=1)
				break;
		}
	}
}

class GenerateAppleBreakLoopTest{
	
	public static void main(String...xxyy){
		GenerateAppleBreakLoop.generateAppleBreakLoop();
	}
}