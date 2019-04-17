//requirement: To create class with static inner class and accessing its static and non static member methods

package com.k2js.aboutclass.practise;

class A2hw{
	
	static class innerA2hw{
		
		static void m(){
			System.out.println("I am a static method of static inner class.");
		}
	
		void n(){
			System.out.println("I am a non-static method of static inner class.");
		}
	}
}

class A2hwTest{
	public static void main(String...xxyy){
		A2hw.innerA2hw.m();
		new A2hw.innerA2hw().n();
	}
}