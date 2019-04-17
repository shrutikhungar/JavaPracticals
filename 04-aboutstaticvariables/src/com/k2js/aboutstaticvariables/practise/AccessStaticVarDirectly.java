//Requirement:  To access static variable directly through import static

package com.k2js.aboutstaticvariables.practise;

import static com.k2js.aboutstaticvariables.practise.AccessStaticVaDirectly.i;

class AccessStaticVaDirectly{
	static int i = 80;
}

class AccessStaticVaDirectlyTest{
	public static void main(String...xxyy){
		System.out.println(i);
	}
}