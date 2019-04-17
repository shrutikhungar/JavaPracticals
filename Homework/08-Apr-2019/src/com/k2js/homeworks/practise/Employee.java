//Requirement: to print Employee class

package com.k2js.homeworks.practise;

class Employee{
	String empName;
	int empID;
	String compName;
	
	@Override
	public String toString(){
		String empName="\n"+this.empName+"\n";
		String empID=this.empID+"\n";
		String compName=this.compName;
		return (empName+empID+compName);
	}
}

class EmployeeTest{
	
	public static void main(String...xxyy){
		//First employee object
		Employee empObj1=new Employee();
		empObj1.empName="Rajiv";
		empObj1.empID=1234;
		empObj1.compName="Floby";
		System.out.println("First Employee details:"+empObj1);
		
		//Second employee object
		Employee empObj2=new Employee();
		empObj2.empName="Manu";
		empObj2.empID=1235;
		empObj2.compName="ITM";
		System.out.println("Second Employee details:"+empObj2);
	}
}
