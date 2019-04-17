//requirement: to print alternate digits from reverse

package com.k2js.loops.practise;

class PrintAlternateDigitReverse{
	
	static void printAlternateDigitReverse(){
		int num=422356767,p=0;
		for(;num!=0;){
			int digit=num%10;
			num=num/100;
		}
			
	}
}

class PrintAlternateDigitReverseTest{
	
	public static void main(String...xyy){
		PrintAlternateDigitReverse.printAlternateDigitReverse();
	}
}

/*class PrintAlternateDigitReverse{
	
	static int countOfDigit(int num){
		int countOfDigit=0;
		for(;num!=0;){
			num=num/10;
			countOfDigit++;
		}
		return countOfDigit;
	}
	
	static void printAlternateDigitReverse(){
		int num=422356767,p=0;
		int countOfDigit=PrintAlternateDigitReverse.countOfDigit(num);
		for(int i=1;i<=countOfDigit;i++){
			int digit=num%10;
			if (i%2==0)
				System.out.println(digit);	
			num=num/10;
		}
			
	}
}

class PrintAlternateDigitReverseTest{
	
	public static void main(String...xyy){
		PrintAlternateDigitReverse.printAlternateDigitReverse();
	}
}*/
