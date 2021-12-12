package Chapter2.simpleExercises;

public class Looping1 {

	private int size = 6;
	
	public static void main(String[] args) {
		
		Looping1 l1 = new Looping1();
		
		// produce 6 lines of output
		for(int i = 0; i <= l1.size; i++) {
			System.out.println();
			for(int k = 0; k < i; k++) {
				System.out.print("\\\\");}
			for(int f = new Looping1().size; f >= 1 + i; f--) {
				System.out.print("| |");}
			for(int w = l1.size; w >= 0 + i; w--) {
				System.out.print("| |");}
			for(int a = 0; a < i; a++) {
				System.out.print("//");}
			
			
		}
	}

}
