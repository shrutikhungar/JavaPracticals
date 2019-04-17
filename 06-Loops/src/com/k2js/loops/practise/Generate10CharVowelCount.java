//Requirement: To generate 10 character.how many times vowels are generated.

package com.k2js.loops.practise;

class RandomNumberVowelCount{
	
	static int randomNumberVowelCount(){
		int count=0;
		for(int i=0;i<=10;i++){
			char c=(char)(int)((Math.random()*26)+65);
			if (c=='A'||c=='E' || c=='I' || c=='O' || c=='U'){
				count++;
				System.out.println("Character is: "+c);
			}	
		}
		return count;
	}
}

class RandomNumberVowelCountTest{
	
	public static void main(String...xxyy){
		int vowelCount=RandomNumberVowelCount.randomNumberVowelCount();
		System.out.println("Vowel Count is:"+vowelCount);
	}
}