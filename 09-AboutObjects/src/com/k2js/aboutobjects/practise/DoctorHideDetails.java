//Requirement: to create doctor class with few details hidden

package com.k2js.aboutobjects.practise;

class Doctor{
	String docName;
	String docQuali;
	String docSpecial;
	int docExp;
	
	public String toString(){
		String docName="Doctor Name="+this.docName+"\n";
		String docQuali="Doctor Qualification="+this.docQuali+"\n";
		String docSpecial="Doctor Specialization="+this.docSpecial+"\n";
		String docExp="Doctor Experience="+this.docExp+"\n";
		return (docName+docQuali+docSpecial+docExp);
	}
}

class DocTest{

	public static void main(String...xxyy){
		//creating first doctor
		Doctor docObj1=new Doctor(){
			@Override
			public String toString(){
				return (super.docName+"\n"+super.docSpecial);
			}
		};	
		docObj1.docName="John";
		docObj1.docQuali="MDS";
		docObj1.docSpecial="Surgery";
		docObj1.docExp=20;
		System.out.println(docObj1);
		
		//creating second doctor
		Doctor docObj2=new Doctor();	
		docObj2.docName="Mohan";
		docObj2.docQuali="MBBS";
		docObj2.docSpecial="Dentist";
		docObj2.docExp=10;
		System.out.println(docObj2);
	}
}