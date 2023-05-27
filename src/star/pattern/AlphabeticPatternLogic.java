package star.pattern;

public class AlphabeticPatternLogic {

	public static void main(String[] args) {
		
		//capital letters 
		
		// A 
		//A B 
		//A B C 
		//A B C D 
		//A B C D E 
		//A B C D E F 

		
		int alpha = 65;
		for(int i =0; i <= 5; i++) {
			for(int j =0; j<=i;j++) {
				System.out.print((char)(alpha+j) + " ");
			}
			System.out.println();
			
		}
		
		//small letters 
		 //just put int alpha = 97;
		
		//a 
		//a b 
		//a b c 
		//a b c d 
		//a b c d e 
		//a b c d e f 

		

	}

}
