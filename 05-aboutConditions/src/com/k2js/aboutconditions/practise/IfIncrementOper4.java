//Requirement: if condition using terenary operator

package com.k2js.aboutconditions.practise;

class IfElseTerenary{
	public static void main(String...xxyy){
		int i = 5;
		String s=(i++!=5)?"I am inside first if":(i++!=6)?"I am inside elseif":"I am inside else of second if";
		System.out.println(s);
	}
}