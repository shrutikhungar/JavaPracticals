//Requirement: To take input age from user and print whether its a Boy,Man,Girl,Woman using selfish method taking using terenary operator

package com.k2js.aboutconditions.practise;

class GenderTerenarySelfish{
	
	static void genderTerenary(int age){
		char gender = 'F';
		String result=(gender=='M')?
						(age<=25)?"Boy":(age<50)?"Man":"Old Man"
					 :(gender=='F')?
						(age<=25)?"Girl":(age<50)?"Woman":"Old Woman"
					 :"invalid input";					
		System.out.println(result);
	}
}

class GenderTerenarySelfishTest{
	
	public static void main(String...xxyy){
		int age = (int)(Math.random()*45+10);
		System.out.println(age);
		GenderTerenarySelfish.genderTerenary(age);
	}
}