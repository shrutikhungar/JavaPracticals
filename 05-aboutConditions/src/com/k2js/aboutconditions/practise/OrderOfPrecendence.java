//Requirement: to check the order of arithmetic evaluation
//no precedence for operands
//precedence only for operator 
//first method calls will be evaluated
//System.out.print(1+2*3/4+5*6);
//now start applying operator precedence 5 operator */* same precedence. if multiplr operator same precedence then start from left to right first 2*3 then 6/4 then 5*6/ =1+1+30=32

package com.k2js.aboutconditions.practise;

class Order{
	static int m(int i){
		System.out.println(i);
		return i;
	}
	public static void main(String...xxyy){
	System.out.print(m(1)+m(2)*m(3)/m(4)+m(5)*m(6));
	}
}