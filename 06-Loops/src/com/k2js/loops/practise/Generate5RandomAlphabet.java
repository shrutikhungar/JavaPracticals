//Requirement: To generate 5 alphabets randomly 

package com.k2js.loops.practise;

class RandomAlpha5Loop{
	
	static void randomAlpha5Loop(){
		for(int i=0;i<=5;i++){
			char c=(char)(int)(Math.random()*26+97);
			System.out.println(c);
		}
	}
}

class RandomAlpha5LoopTest{
	public static void main(String...xxyy){
		RandomAlpha5Loop.randomAlpha5Loop();
	}
}