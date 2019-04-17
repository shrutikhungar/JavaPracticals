//Requirement: to explain all kinds of inner classes in an outer class

package com.k2js.aboutclass.practise;

class AllInnerClasses{
	public static void main(String...xxyy){
		System.out.println("I am outer class main method");
	}
	
	public static class A{
		public static void main(String...xxyy){
			System.out.println("I am static method of static nested inner class");	
		}
		
		public void m(){
			System.out.println("I am non-static method of static nested inner class");	
		}
	}
	
	class B{
		public void m(){
			System.out.println("I am non-static method of non-static inner class");	
		}
	}
	
	class C{
		public void m(){
			class D{
				int i = 10;
				final static int j=20;
				void m(){
					System.out.println("I am a local inner class method");	//can not be called outside class C. Anything created 
				}
			}
		D objD= new D();
		objD.m();
		}
	}
}
//To call method of class B, class C we need to create another class
class AllInnerClassesTest{
	
	public static void main(String...xxyy){
		//calling static method of outer class. Since we have put ...in String argument main method we do not need to pass parameter in main while calling
		AllInnerClasses.main(); 
		
		//calling static method of inner class A
		AllInnerClasses.A.main();
		
		//calling non-static method of static nested inner class A
		AllInnerClasses.A innerClassAObj=new AllInnerClasses.A(){};
		innerClassAObj.m();
			
		//creating object of inner B class and accessing non static method
		AllInnerClasses.B innerClassBObj=new AllInnerClasses().new B(){};
		innerClassBObj.m();
			
		//creating object of inner C class and accessing non static method
		AllInnerClasses.C innerClassCObj=new AllInnerClasses().new C(){};
		innerClassCObj.m();
		
		//or
		//accessing inner C class, non-static method without storing object
		new AllInnerClasses().new C().m();
		
		//or accessing inner C class, non-static method without storing object using anonymus class
		new AllInnerClasses(){}.new C(){}.m();
		
		//or accessing inner C class, non-static method without storing object using anonymus class
		new AllInnerClasses().new C(){}.m();
		
		//or accessing inner C class, non-static method without storing object using anonymus class
		new AllInnerClasses(){}.new C().m();
	}
}