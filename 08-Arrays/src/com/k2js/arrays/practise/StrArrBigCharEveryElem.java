//Requirement: To find out biggest chacacter in all the strings

package com.k2js.arrays.practise;

class StrArrBigCharEveryEle{
	
	static void strArrBigCharEveryEle(String...strArr){
		char biggestChar='0';
		//First way
		/*for(String strEle:strArr){
			for(char c:strEle.toCharArray())
				biggestChar=c>biggestChar?c:biggestChar;
			System.out.println(biggestChar);
		}*/
		
		//Second way
		/*
		for(String strEle:strArr){
			System.out.println(strEle);
			for(int i=0;i<=strEle.length()-1;i++){
				biggestChar=strEle.charAt(i)>biggestChar?strEle.charAt(i):biggestChar;
			}		
			System.out.println(biggestChar);
		}
		*/
		//third way: through Array sort
		for(String strEle:strArr){
			char[] charArr = strEle.toCharArray();
			Arrays.sort(charArr);
			System.out.println(charArr[0]);
		}
		//Arrays.sort(c);
		//System.out.println(c[c.length-1]);
	}
}

class strArrBigCharEveryEleTest{
	
	public static void main(String...xxyy){
		StrArrBigCharEveryEle.strArrBigCharEveryEle("hello","keys","test","made");
	}
}