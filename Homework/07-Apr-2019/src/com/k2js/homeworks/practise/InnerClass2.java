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