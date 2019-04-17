//Requirement: to generate random number. if number is less than 100 than return last digit. if number is more than 100 than return middle digit

package com.k2js.aboutstaticvariables.practise;

class RandomNum{
	static int i = (int)(Math.random()*50)+80;
	
	static int analyzeNum(){
		if(RandomNum.i < 100){
			System.out.println(RandomNum.i);
			return RandomNum.i%10;
		} else if (RandomNum.i >= 100){
			System.out.println(RandomNum.i);
			return(RandomNum.i/10)%10;
		}
		
		return 0;
	}
}

class RandomNumTest{
	
	public static void main(String...xxyy){
		int lastDigit=RandomNum.analyzeNum();
		System.out.println(lastDigit);
	}
}