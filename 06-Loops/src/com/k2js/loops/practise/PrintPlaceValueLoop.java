//Requirement: To print place value of number

package com.k2js.loops.practise;

/*class PlaceValueLoop{
	
	static void placeValue(){
		int number=2344;
		for (int i=1;number!=0;i*=10){
			int lastDig=number%10;
			number/=10;
			lastDig*=i;			
			System.out.print(lastDig+",");
		}
	}
}
*/

class PrintPlaceValue1{
	static void placeValue(){
		int num=234,p=0;
		for(;num!=0;){
			int digit=num%10;
			int placeValue=(int)(Math.pow(10,p++))*digit;
			num/=10;
			System.out.println(placeValue);
		}
	}
}
class PlaceValueLoopTest{
	
	public static void main(String...xxyy){
		PrintPlaceValue1.placeValue();
	}
}