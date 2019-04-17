//Requirement: to find duplictae element in an array

package com.k2js.homeworks.practise;

class DupliEleArray{
	
	static void dupliEleArray(int[] intArr){
		for(int intArrEle:intArr){
			int temp=intArrEle;
			int count=0;
			for(int intArrEle1:intArr){	
				if(intArrEle1==temp)
					count++;
			}
			if(count>1)
				System.out.println("Duplicate:"+intArrEle);
		}
	}
}

class DupliEleArrayTest{
	
	public static void main(String...xxyy){
		DupliEleArray.dupliEleArray(new int[]{2,6,7});
	}
}