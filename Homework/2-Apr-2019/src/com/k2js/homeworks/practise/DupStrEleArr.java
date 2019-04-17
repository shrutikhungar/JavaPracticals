//Requirement: to find the duplicate string element of an array

package com.k2js.homeworks.practise;

class DupStrEleArr{
	
	static void dupStrEleArr(String...strArr){
		for(String strArrEle:strArr){
			int count =0;
			for(String strArrEle1:strArr){
				if(strArrEle1.equals(strArrEle)){
					count++;
				}
			}
			if (count>1){
				duplicate=true;
			}	
		}
	}
}

class DupStrEleArrTest{
	public static void main(String...xxyy){
		DupStrEleArr.dupStrEleArr("Shruti","Nitin","Vasvi","Shruti","Nitin");
	}
}