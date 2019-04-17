
//Requirement: new Serializable[]{"10",20,30.,new StringBuffer("40"),new StringBuilder("30"}

package com.k2js.homeworks.practise;

class Conversion1{
	public static void main(String...xxyy){
		Integer[] i=new Integer[]{1};
		java.io.Serializable[] s=new java.io.Serializable[]{"10",20,30.,new StringBuffer("40"),new StringBuilder("30")};
		int i0=Integer.parseInt(s[0]+"");
		int i1=(Integer)s[1];
		System.out.println(s[0]);
		//System.out.println(i1+i2+i3);
	}
}