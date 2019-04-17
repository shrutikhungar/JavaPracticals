//Requirement: To access static and non static variables and members methods of non static class

package com.k2js.aboutclass.practise;

class A4hw{
	
	class InnerA4hw{
		final static int i =10;
		int j=20;
		
		void m(){
			System.out.println("I am a non static member of non static inner class.");
		}
	}
}

class A4hwTest{
	public static void main(String...xxyy){
		System.out.println(A4hw.InnerA4hw.i); //can be accessed directly through class name A4hw.InnerA4hw
		new A4hw().new InnerA4hw().m();
	}
}