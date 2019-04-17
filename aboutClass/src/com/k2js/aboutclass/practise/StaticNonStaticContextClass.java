//Requirement: To include static as well as non-static elements in a class.

package com.k2js.aboutclass.practise;

class StaticNonStaticContextClass{
		static int i = 10;
		int j=20;
		
		StaticNonStaticContextClass(){
			System.out.println("outer class constructor");
		}
		
		{
			System.out.println("outer class non-static block");
		}
		
		static {
			System.out.println("outer class static block");
		}
		
		void nonStaticMethod(){
			System.out.println("outer class non-static method: "+j);
		}
		
		public static void main(String...xxyy){
			System.out.println("outer class main static method: "+i);
		}	
		
		//doubt: error main not found: not able to add main()
		class NonStaticInnerClass{			
			void m(){
				System.out.println("non-static inner method of inner non-static class");
			}
		}
		static class StaticClass{			
			static void m(){
				System.out.println("static inner method of inner static class");
			}
			void m1(){
				System.out.println("non-static inner method of inner static class");
			}
			public static void main(String...xxyy){
				System.out.println("Inner main method of static inner class");
				m();
			}
		}
		interface autoStaticInterface{
			static void m(){
				System.out.println("A");
			}
			public static void main(String...xxyy){
				System.out.println("Inner main method of static inner interface");
			}
		}
		
		enum e{
			;
			public static void main(String...xxyy){
				System.out.println("Inner main method of static inner enum");
			}
			void m3(){
				System.out.println("inner non-static method of static inner enum");
			}
		}
}