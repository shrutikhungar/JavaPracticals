//Requirement: To find out sum of all prime nnumbers in array

package com.k2js.homework.practise;

class SumPrimeNumInArr{
	
	static void sumPrimeNumInArr(int[] intArr){
		int sumPrime=0;
		for(int ele:intArr){
			String result=SumPrimeNumInArr.pimeOrNot(ele);
			if (result.equals("Prime"))
				sumPrime+=ele;
		}
		System.out.println(sumPrime);
	}
	
	static String pimeOrNot(int num){
		String result="";
		int multiple=0;
		for(int i=1;i<=num/2;i++){
			if(num%i==0)
				multiple++;
		}
		System.out.println(multiple);
		if(multiple==1)
			result="Prime";
		return result;
	}
}

class SumPrimeNumInArrTest{
	
	public static void main(String[] strArr){		
		SumPrimeNumInArr.sumPrimeNumInArr(new int[]{13,2,4,6,7,8,5,10});		
	}
}