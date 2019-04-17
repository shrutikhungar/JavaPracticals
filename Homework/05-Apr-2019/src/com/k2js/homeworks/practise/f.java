//Request

package com.k2js.homeworks.practise;

class A
{
    static
    {
        i = 30;
		System.out.println("1");
    }
 
    static int i = 20;
 
    static
    {
        i = 10;
		System.out.println("2");
    }
 
    public static void main(String[] args)
    {
        System.out.println(A.i);
    }
}
