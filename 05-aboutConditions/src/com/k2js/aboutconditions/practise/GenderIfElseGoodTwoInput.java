//Requirement: To tak input F or M and age from user and print whether its a Boy,Man,Girl,Woman using selfish method taking two inputs: Good method

package com.k2js.aboutconditions.practise;

class GenderIfGoodTwoInput{
	
	static String genderIfSelfish(int age, char gender){
		if (gender == 'F')
			if (age<=25)
				return ("Girl: " + age);
			else if (age<50)
				return ("Woman: " + age);
			else	
				return ("Old Woman: " + age);
		else if (gender == 'M')
			if (age<=25)
				return ("Boy: " + age);
			else if (age<50)
				return ("Man: " + age);
			else	
				return ("Old Man: " + age);
		else 
			return ("invalid input: "+age);
	}
}

class GenderIfGoodTwoInputTest{	
	public static void main(String...xxyy){
		int age=(int)(Math.random()*45+10);
		String str = GenderIfGoodTwoInput.genderIfSelfish(age,'F');
		System.out.println(str);
	}
}
