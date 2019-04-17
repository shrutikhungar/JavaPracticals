//Requirement: To open the chrome/firefox browser in either local/remote. Both input taken by use: Good method using terenary
	
package com.k2js.aboutconditions.practise;

class BrowserOpenGoodTerenary{
	
	static void browserOpenGoodTerenary(String machine, String browserName){
		
		String result=machine.equals("Local")?browserName.equals("Chrome")?"Starting chrome on local":(browserName.equals("Firefox")?"Starting firefox on local":"Invalid browserName")
						:machine.equals("Remote")?browserName.equals("Chrome")?"Starting chrome on remote":(browserName.equals("Firefox")?"Starting firefox on remote":"Invalid browserName")
							:"Invalid Machine Name";
		System.out.println(result);
	}
}
class BrowserOpenGoodTerenaryTest{
	
	public static void main(String...xxyy){
		BrowserOpenGoodTerenary.browserOpenGoodTerenary("Remote","Chrome");
	}
}