//Requirement: To print prime number below 100

package com.k2js.loops.practise;

class PrimeNumBelow100{
	
	static void primeNumBelow100(){
		
		for(int givenNum=1;givenNum<=100;givenNum++){
			int multiple=0;
			for(int j=1;j<=givenNum/2;j++){				
				if(givenNum%j==0){
					multiple++;
				}
			}
			if(multiple==1)
					System.out.println(givenNum + " is a prime");
		}
	}
}

class PrimeNumBelow100Test{
	
	public static void main(String...xxyy){
		PrimeNumBelow100.primeNumBelow100();
	}
}