//Requirement: to store System.out in a variable and then through this variable access println

//Package

//import

class SystemOutPrintln{
	
	public static void main(String...xxyy){
		String s1="Hi";
		java.io.PrintStream ps=System.out;
		ps.println(s1);
	}
}