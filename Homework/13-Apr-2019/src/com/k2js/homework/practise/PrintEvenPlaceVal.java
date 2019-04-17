/*Req: print 12345
2000
40
*/

package com.k2js.homeworks.practise;

class PrintEvenPlaceVal{
	
	int countOfDigits(int num){
		int count=0;
		for(;num!=0;){
			count++;
			num/=10;			
		}
		return count;
	}
	
	static void printEvenPlaceVal(int num){
		int count=new PrintEvenPlaceVal().countOfDigits(num);
		for(int i=0;i<=count;i++){
			int power=(int)Math.pow(10,i);
			int digit=num%10;
			num/=10;
			int placeVal=digit*power;
			if(i%2==0){
				System.out.println(placeVal);
			}
		}			
	}
}

class PrintEvenPlaceValTest{
	public static void main(String...xxyy){
		PrintEvenPlaceVal.printEvenPlaceVal(45678);
	}
}