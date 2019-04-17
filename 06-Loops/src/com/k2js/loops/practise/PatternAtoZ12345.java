/*Print 
12345
ABCDE
12345
FGHIJ
12345
KLMNO
12345
PQRST
12345
UVWXY
12345
Z
*/

package com.k2js.loops.practise;

class PatternAtoZ1to5{
	
	static void patternAtoZ1to5(){
		int k=0;
		for(int row=1;row<=12;row++){
			if(row%2!=0){
				for(int j=1;j<=5;j++){
					System.out.print(j);
				}
			}	
			else if(row%2==0){
				for(int i=k;i<k+5;i++){
					if(i%5==0)
						System.out.println("");
					System.out.print((char)(i+65));
				}
				k=k+5;
				System.out.println("");
			}		
		}
	}
}

class PatternAtoZ1to5Test{
	
	public static void main(String...xxyy){
		PatternAtoZ1to5.patternAtoZ1to5();
	}
}