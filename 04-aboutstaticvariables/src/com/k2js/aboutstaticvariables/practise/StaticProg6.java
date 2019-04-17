//Requirement: To get a random number from 48 to 120 and find out the number and convert it into char and find out whether its capital or small or a number

package com.k2js.aboutstaticvariables.practise;

class H_1{	
	static char c=(char)(int)(Math.random()*75+48);
		
	static void findSmallCapitalNum(){			
		if (H_1.c >= 0 & H_1.c <= 9){				
			System.out.println(H_1.c + ": Number is number");
		} else if (H_1.c >= 'a' & H_1.c <= 'z'){			
			System.out.println(H_1.c + ": Character is smallcaps");
		} else if (H_1.c >= 'A' & H_1.c <= 'Z'){				
			System.out.println(H_1.c + ": Character is capital");
		} else 				
			System.out.println(H_1.c + ": Character is special character");
	}
}

class H_1_Test{
	
	public static void main(String...xxyy){
		H_1.findSmallCapitalNum();	
	}
}