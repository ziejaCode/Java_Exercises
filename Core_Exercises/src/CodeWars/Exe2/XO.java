package CodeWars.Exe2;

/*	Check to see if a string has the same amount of 'x's and 'o's. 
 *  The method must return a boolean and be case insensitive. 
 *  The string can contain any char.

	Examples input/output:
	
	XO("ooxx") => true
	XO("xooxx") => false
	XO("ooxXm") => true
	XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
	XO("zzoo") => false
*/	
	public class XO {
		
		 
		public static boolean getXO1 (String str) {
			
			int countx = 0, conunt0 = 0;
			for(char n : str.toCharArray()) {
				
				n = Character.toLowerCase(n);
				System.out.println("n is now " + n);
				if(n == 'x') {
					countx++;
					System.out.println("I am in x");
				}else if(n == 'o') {			
					conunt0++;
					System.out.println("I am in 0");
				}else {
					//nothing
				}			
			}
			System.out.println("x are " + countx + " and 0 are " + conunt0);  
			if(countx == conunt0) {
				return true;
			}else {
				return false;  
			}
			
		}
		
		public static boolean getXO (String str) {
			
			int countx = 0, conunt0 = 0;
			for(char n : str.toCharArray()) {
				
				n = Character.toLowerCase(n);
				if(n == 'x') {
					countx++;
				}else if(n == 'o') {			
					conunt0++;
				}	
			}
			return countx == conunt0 ? true : false;		
		}


}
