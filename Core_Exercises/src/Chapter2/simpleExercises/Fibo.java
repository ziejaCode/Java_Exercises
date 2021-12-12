package Chapter2.simpleExercises;

public class Fibo {
	
public static void main(String[]args) {
    	
    	int num1 = 0;
    	int num2 = 1;
    	int temp = 0;
		
    	System.out.print(" " + num1);
		for(int a = 0; a < 11; a++) {
			temp = num2;
			num2 = num1 + num2;
			num1 = temp;			
			System.out.print(" " + num2);
		}	
	}

}
