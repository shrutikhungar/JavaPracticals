//Requirement: To tae input F or M and age and print whether its a Boy,Man,Girl,Woman using selfish method

package com.k2js.aboutconditions.practise;

class GenderIfSelfish{
	
	static void genderIfSelfish(int age){
		char gender = 'M';
		if (gender == 'M'){
			if(age<=25)
				System.out.println("Boy: " +age);
			else if (age<50)
				System.out.println("Man: " +age);
			else 
				System.out.println("Old Man: " +age);
		}
		else if(gender == 'F'){
			if(age<=25)
				System.out.println("Girl: " +age);
			else if (age<50)
				System.out.println("Woman: " +age);
			else 
				System.out.println("Old Woman: " +age);
		}
		else 
			System.out.println("Invalid input");
	}
}

class GenderIfSelfishTest{
		
	public static void main(String...xxyy){
		GenderIfSelfish.genderIfSelfish((int)(Math.random()*45+10));
	}
}