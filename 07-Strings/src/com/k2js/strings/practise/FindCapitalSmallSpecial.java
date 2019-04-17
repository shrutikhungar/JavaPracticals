//Requirement: To find out capital,small,special characters

package com.k2js.string.practise;

class CapitalSmall{
	static void capitalSmall(String s){
		int cc=0; int sc=0;int spc=0;int nc=0;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c >= 'A' && c <='Z'){
				cc++;
			}
			else if(c>'0' && c<='9'){
				nc++;
			}
			else if(c>='a' && c<='z'){
				sc++;
			}
			else{
				spc++;
			}
		}
		System.out.println("Capital letter"+cc);
		System.out.println("number"+nc);
		System.out.println("small letter"+sc);
		System.out.println("Special letter"+spc);
	}
}

class CapitalTest{
	public static void main(String...ss){
		CapitalSmall.capitalSmall("Key2JavaSelenium");
	}
}