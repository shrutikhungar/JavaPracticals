//Requirement: Comparable [] c={10,20l+"",new StringBuilder("30")}

package com.k2js.homeworks.practise;

class Conversion{
	public static void main(String...xxyy){
		Comparable[] c={10,20l+"",new StringBuffer("30")};
		int i1=(Integer)c[0];
		int i2=Integer.parseInt(c[1]+"");
		int i3=Integer.parseInt(String.valueOf(c[2]));
		System.out.println(i1+i2+i3);
	}
}