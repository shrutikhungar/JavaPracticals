//Requirement : Biggest Nth digit

package com.k2js.homeworks.practise;

class BiggestNthDigit{
	
	static int countOfDigits(int num){
		int count = 0;
		for(;num!=0;){
			num=num/10;
			count++;
		}
		return count;
	}
	
	int biggest(int num){
		int countOfDigits=this.countOfDigits(num);
		System.out.println(countOfDigits);
		int biggestDig=0;
		for(;num!=0;){
			int digit=num%10;
			biggestDig=digit>biggestDig?digit:biggestDig;
			num/=10;
		}
		return biggestDig;
	}
	
	static int biggestNthDigit(int num, int nthPos){
		int biggestDig=new BiggestNthDigit().biggest(num);
		int originalNum=num;
		int biggestNthDigit=0;
		System.out.println(biggestDig);
		for(int i=1;i<nthPos;i++){
			for(;num!=0;){
				int digit=num%10;
				biggestNthDigit=(digit<biggestDig && digit>biggestNthDigit)?digit:biggestNthDigit;
				num/=10;
			}
			biggestDig=biggestNthDigit;
			biggestNthDigit=0;
			num=originalNum;
		}
		return biggestDig;
	}
}

class BiggestNthDigitTest{
	public static void main(String...xxxyy){
		System.out.println(BiggestNthDigit.biggestNthDigit(2378,4));
	}
}