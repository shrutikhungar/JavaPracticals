//Requirement: To open the chrome/firefox browser in either local/remote. Both input taken by use: Good method using if else
	
package com.k2js.aboutconditions.practise;

class BrowserOpenGoodIfElse{
	
	static void browserOpenGoodIfElse(String machine, String browserName){
		if (machine.equals("Local")){
			if (browserName.equals("Firefox"))
				System.out.println("Opening "+browserName+" browser on "+machine);
			else if (browserName.equals("Chrome"))
				System.out.println("Opening "+browserName+" browser on "+machine);
		}
		else if (machine.equals("Remote")){
			if (browserName.equals("Firefox"))
				System.out.println("Opening "+browserName +" browser on "+machine);
			else if (browserName.equals("Chrome"))
				System.out.println("Opening "+browserName+" browser on "+machine);	
			else
				System.out.println("Invalid Browser Name");	
		}
		else
				System.out.println("Invalid Input");			
	}
}

class BrowserOpenGoodIfElseTest{
	
	public static void main(String...xxyy){
		BrowserOpenGoodIfElse.browserOpenGoodIfElse("Remote","Chrome");
	}
}