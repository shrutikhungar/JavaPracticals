//Requirement: to find whether num is prime or not using lambda
//public static java.util.stream.IntStream range(int, int);
//public abstract java.util.stream.IntStream filter(java.util.function.IntPredicate); //input boolean condition
//public abstract void forEach(java.util.function.IntConsumer); //input is void

package com.k2js.loops.practise;

class PrimeNumBelow1Lambda{
	
	static boolean isPrime(int num){
		int multipleCount=0;
		for(int i=1;i<=num/2; i++){
			if(num%i==0)
				multipleCount++;
		}
		return multipleCount==1;
	}
	
	public static void printPrime(){
		java.util.stream.IntStream.range(0,100).filter((num)->isPrime(num)).forEach((a)->System.out.println(a));
	}
}
	
class PrimeNumBelow1LambdaTest{
	
	public static void main(String...xxyy){		
		PrimeNumBelow1Lambda.printPrime();
	}
}	
	