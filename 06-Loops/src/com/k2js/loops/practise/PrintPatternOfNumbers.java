/*Requirement: To print pattern 4137625 
              5
             25
            625
           7625
          37625
        4137625
*/ 

package com.k2js.loops.practise;


class PrintPatternOfNumbers{
	
	static void printPattern(int num){
		int p=1,power=0,origNum=num;
		for(;num!=0;){
			power=(int)Math.pow(10,p++);
			int digit=origNum%power;
			//for(int j=spaceCount;j>1;j--){
				System.out.print(" ");
			}
			//spaceCount--;
			System.out.println(digit);
		}
	}
}

class PrintPatternOfNumbersTest{
	public static void main(String...xxyy){
		PrintPatternOfNumbers.printPattern(4137625);	
	}
}

//Option 1
/*
class PrintPatternOfNumbers{
	
	static void printPattern(int num){
		int p=0,power=0,sum=0;
		for(;num!=0;num/=10){
			int digit=num%10;
			int placeVal=(int)(Math.pow(10,	p++)*digit;
			sum=sum+placeVal;
			System.out.println(sum);
		}
	}
}

//Option 2
class PrintPatternOfNumbers{
	
	static int countOfDigits(int num){
		int countOfDigits=0;
		for(;num!=0;){
			num=num/10;
			countOfDigits++;
		}
		return countOfDigits;
	}
	
	static void printPattern(int num){
		int p=1,power=0;
		int countOfDigits=PrintPatternOfNumbers.countOfDigits(num);
		int spaceCount=countOfDigits;
		for(int i=1;i<=countOfDigits;i++){
			power=(int)Math.pow(10,p++);
			int digit=num%power;
			for(int j=spaceCount;j>1;j--){
				System.out.print(" ");
			}
			spaceCount--;
			System.out.println(digit);
		}
	}
}

class PrintPatternOfNumbersTest{
	public static void main(String...xxyy){
		PrintPatternOfNumbers.printPattern(4137625);	
	}
}
*/