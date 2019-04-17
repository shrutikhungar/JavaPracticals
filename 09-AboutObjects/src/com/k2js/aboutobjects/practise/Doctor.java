//Requirement

package com.k2js.aboutobjects.practise;

class Doctor{
	String docName;
	String docQualification;
	String docSpecialization;
	int docExperience;
	
	@Override
	public String toString(){
		String docName="Doctor Name="+this.docName+"\n";
		String docQuali="Doctor Qualification="+this.docQualification+"\n";
		String docSpecial="Doctor Specialization="+this.docSpecialization+"\n";
		String docExp="Doctor Experience="+this.docExperience+"\n";
		return (docName+docQuali+docSpecial+docExp);
	}
}

class DoctorTest{
	public static void main(String...xxyy){
		//creating first object of doctor
		Doctor docObj1=new Doctor();
		docObj1.docName="Mirza";
		docObj1.docQualification="BDS";
		docObj1.docSpecialization="Dentistry";
		docObj1.docExperience=10;
		System.out.println("*****Printing first doctor details****");
		System.out.println(docObj1);
		
		//creating second object of doctor
		Doctor docObj2=new Doctor();
		docObj2.docName="Sachin";
		docObj2.docQualification="MBBS";
		docObj2.docSpecialization="Medicine";
		docObj2.docExperience=15;
		System.out.println("*****Printing second doctor details****");
		System.out.println(docObj2);
		
		//creating second object of doctor
		Doctor docObj3=new Doctor();
		docObj3.docName="Mohan";
		docObj3.docQualification="MDS";
		docObj3.docSpecialization="Surgery";
		docObj3.docExperience=20;
		System.out.println("*****Printing third doctor details****");
		System.out.println(docObj3);
	}
}	
