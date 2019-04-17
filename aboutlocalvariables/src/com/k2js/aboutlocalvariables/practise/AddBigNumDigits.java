//Requirement: To find the biggest number from array and add digits of the biggest nnumber add multiply by 2

package com.k2js.aboutlocalvariables.practise;

class AddBigNumDigits{
	
	//to find big number among two elements of comparable array
	int fnFindBigNum(Comparable[] c){		
		int firstArrayEle=Integer.parseInt(c[0].toString());
		int secArrayEle=Integer.parseInt(c[1].toString());
		int bigNum=firstArrayEle>secArrayEle?firstArrayEle:secArrayEle;
		System.out.println(bigNum);
		return bigNum;
	}
	
	//to add the digits of bigger number of comparable array
	static int fnAddDigits(int bigNum){
		int firstElebigNum=bigNum/10;
		int secElebigNum=bigNum%10;
		int sumOfDigits=firstElebigNum + secElebigNum;
		return sumOfDigits;
	}
	
	public static void main(String...xxyy){
		Comparable [] c={45,89};
		//new AddBigNumDigits().fnFindBigNum({45,77});
		int bigNum=new AddBigNumDigits().fnFindBigNum(c);
		int sumOfDigits=AddBigNumDigits.fnAddDigits(bigNum);
		System.out.println(sumOfDigits);
	}
}