//Requirement: to store System.out in a variable and then through this variable access println

//Package

//import

class SystemConsoleWriterPrintln{
	
	public static void main(String...xxyy){
		String s1="Hi";
		java.io.Console c=System.console();
		java.io.PrintWriter pw=c.writer();
		pw.println(s1);
		//pw.write(1);
	}
}