//REquirement: find out the second letter and legnth from the second letter

package com.k2js.string.practise;

class SecondChar{
	static void secondChar(String s,char c){
		//indexOf will fnd the index of character and that we will minus from total length.
		int i=s.indexOf(c);
		System.out.println(i);
		int len=s.length()-i;
		System.out.println(len);
	}
}

class IndexTest{
	public static void main(String...ss){
		SecondChar.secondChar("HelloworldJavaWorld",'l');
	}
}