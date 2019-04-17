//Requirement: To write specific methods and call then through DevBTest class 

//Package

//import

class DevB{

	public static void a(){
		System.out.print("*");
	}
	
	public static void a(String s){
		System.out.print(s);
	}
	
	public static String b(){
		return "#";
	}
	
	public static int a(int i, int b){
		return i+b;
	}
}

//Requirement: To call methods of DevB class for printing a pattern

public class DevBTest{

	public static void main(String...xxyy){
		DevB.a();
		DevB.a();
		DevB.a();
		String hash=DevB.b();
		DevB.a(hash);
		DevB.a(hash);
		int i=DevB.a(20,10);
		DevB.a(((Integer)i).toString());
		//or DevB.a(Integer.toString(i));
		//or DevB.a(i+""));
		DevB.a(hash);
		DevB.a(hash);
		DevB.a();
		DevB.a();
		DevB.a();	
		DevB.a("\n");	
		DevB.a();
		DevB.a();
		DevB.a();
		DevB.a();
		DevB.a();		
	}
}