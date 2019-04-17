//Requirement: To generate 10 characters and find out how many are vowels

package com.k2js.loops.practise;

class VowelsGenerateCount{
	
	static int vowelsGenerateCount(){
		int count=0;
		for(int i=0;i<=10;i++)
		{
			char c = (char)(int)((Math.random()*26)+'A');
			System.out.println(c);
			if (c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
				count++;
		}
		return count;
	}
}

class VowelsGenerateCountTest{
	
	public static void main (String...xxyy){
		int count = VowelsGenerateCount.vowelsGenerateCount();
		System.out.println("Count:" +count);
	}
}