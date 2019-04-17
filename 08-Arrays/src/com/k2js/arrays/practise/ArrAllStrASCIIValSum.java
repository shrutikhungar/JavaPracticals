//Requirement: To find sum of ASCII value if all characters in a string 

package com.k2js.arrays.practise;

class StrArrASCIIValueSUM{
	
	static void strArrASCIIValueSUM(String...strArr){
		int sum='0';
		/*Method 1:
		for(String strEle:strArr){
			sum=StrArrASCIIValueSUM.asciiSumStr(strEle);
			System.out.println(sum + " " +strEle );
		}*/
		
		//Method 2
		for(int i=0;i<=strArr.length-1;i++){
			sum=StrArrASCIIValueSUM.asciiSumStr(strArr[i]);
			System.out.println(sum + " " +strArr[i] );

		}
	}
	
	static int asciiSumStr(String str){		
		int sum=0;
		for(char c:str.toCharArray()){
			sum=sum+c;
		}
		return sum;
	}
}

class StrArrASCIIValueSUMTest{
	public static void main(String...xxyy){
		StrArrASCIIValueSUM.strArrASCIIValueSUM("Ab","BF");
	}
}