//To call method of class B, class C we need to create another class
class AllInnerClassesTest{
	
	public static void main(String...xxyy){
			
		//calling static method of outer class.Since we have put ...in String argument main method we do not need to pass parameter in main while calling
		AllInnerClasses.main();
		
		//calling static method of inner class A
		AllInnerClasses.A.main();
		
		//calling non-static method of static nested inner class
		AllInnerClasses.A innerClassAObj=new AllInnerClasses.A();
		innerClassAObj.m();
			
		//creating object of inner B class
		AllInnerClasses.B innerClassBObj=new AllInnerClasses().new B();
		innerClassBObj.m();
			
		//creating object of inner C class
		AllInnerClasses.C innerClassCObj=new AllInnerClasses().new C();
		innerClassCObj.m();
	}
}