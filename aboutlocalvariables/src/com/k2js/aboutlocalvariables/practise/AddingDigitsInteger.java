//Requirement: To add digits of integer and multiple by 

package com.k2js.aboutlocalvariables.practise;

class AddingIntegerDigits{
	
	int addingDigitsOfInt(int number){
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

class AddingIntegerDigitsTest{
	
	public static void main(String...xxyy){
		int mul=new AddingIntegerDigits().addingDigitsOfInt(45);
		System.out.println("Addition sum, multiply by 2: "+mul);
	}
}