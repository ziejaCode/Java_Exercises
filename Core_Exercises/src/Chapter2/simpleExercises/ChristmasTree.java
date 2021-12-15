package Chapter2.simpleExercises;

public class ChristmasTree {

	public static void main(String[] args) {
		printTree(3, 4);
	}
	
	public static void printTree(int segments, int height) {
		
		for(int k = 0; k < segments; k++) {		
			for(int j = 0; j < height; j++) {			
				for(int n = 1; n < (segments) - k; n++) {
					System.out.print(" ");
				}
				for(int i = 0; i < segments - (k + j - k); i++) {
					System.out.print(" ");
				}
				for(int i = 0; i < j * 2 + 1; i++) {
					System.out.print("$");
				}
				System.out.println();
			}
		}
	}

}
