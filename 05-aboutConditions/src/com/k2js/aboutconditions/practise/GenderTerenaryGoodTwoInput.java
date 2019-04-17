//Requirement: To tak input F or M and age from user and print whether its a Boy,Man,Girl,Woman using selfish method taking two inputs: Good method: using terenary operator

package com.k2js.aboutconditions.practise;

class GenderTerenaryGoodTwoInput{
	
	static String genderTerenaryGoodTwoInput(int age, char gender){
		String result=(gender == 'F')?
			age<=25?"Girl":age<50?"Woman":"Old Woman"
		:gender == 'M'?
			age<=25?"Boy":age<50?"Man":"Old Man"
		:"invalid input";
		
		return result;
	}
}

class GenderIfGoodTwoInputTest{	
	public static void main(String...xxyy){
		int age=(int)(Math.random()*45+10);
		String str = GenderTerenaryGoodTwoInput.genderTerenaryGoodTwoInput(age,'F');
		System.out.println(str+ ":" + age);
	}
}
