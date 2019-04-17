//RequirementL to print common val between array

package com.k2js.homeworks.practise;

class CommonEleArr{
	
	static void commonEleArr(int[] intArr1,int[] intArr2){
		
		int[] biggerArr=(intArr1.length>intArr2.length)?intArr1:intArr2;
		int[] smallerArr=(intArr1.length<intArr2.length)?intArr1:intArr2;
		int sizeOfNewArr=0,count=0;
		for(int i=0;i<=smallerArr.length-1;i++){
			for(int j=0;j<=biggerArr.length-1;j++){				
				if(biggerArr[j]==smallerArr[i])
					count++;
					
				if(count>0){
					sizeOfNewArr+=count;
					break;
				}
			}
		}	
			
		int[] intNewArr=new int[sizeOfNewArr];
		int index=0;
		for(int i=0;i<=smallerArr.length-1;i++){
			for(int j=0;j<=biggerArr.length-1;j++){				
				if(biggerArr[j]==smallerArr[i]){
					intNewArr[index++]=smallerArr[i];
					break;
				}
			}
		}	
			
		System.out.println(java.util.Arrays.toString(intNewArr));
	}
}

class CommonEleArrTest{
	public static void main(String...xxyy){
		CommonEleArr.commonEleArr(new int[]{1,2,3,4,5,8},new int[]{1,4,3,4,6});
	}
}