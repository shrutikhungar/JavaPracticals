//Req:

package com.k2js.homeworks.practise;

class A
{
    static int first;
 
    static String second;
 
    static
    {
        System.out.println(1);
 
        first = 100;
    }
 
    static
    {
        System.out.println(2);
 
        second = "SECOND";
    }
}
 
class StaticInitializationBlock
{
    static
    {
        System.out.println(3);
    }
 
    public static void main(String[] args)
    {
        System.out.println(4);
 
        System.out.println(A.first);
 
        System.out.println(A.second);
    }
}