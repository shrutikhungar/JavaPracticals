//Requirement: To add digits of a comparable class and multiple by 

package com.k2js.aboutlocalvariables.practise;

class AddingComparableDigits{
	
	int addCompDigits(Comparable compNum){		
		String str=compNum.toString();
		//or String str=(String)compNum;
		//or int number=Integer.valueOf(str);		
		int number=Integer.parseInt(str);		
		int firstDigit=number/10;
		System.out.println("First digit is: "+ firstDigit);
		int secondDigit=number%10;
		System.out.println("Second digit is: "+secondDigit);
		int addition=firstDigit+secondDigit;
		System.out.println("Addition is: "+addition);
		int mul=addition*2;
		return mul;
	}
}

class AddingComparableDigitsTest{
	
	public static void main(String...xxyy){
		int mul=new AddingComparableDigits().addCompDigits("47");
		System.out.println("Addition sum, multiply by 2: "+mul);
	}
}