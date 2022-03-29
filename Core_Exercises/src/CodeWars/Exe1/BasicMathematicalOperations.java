package CodeWars.Exe1;

/*
    Your task is to create a function that does four basic mathematical operations.

	The function should take three arguments - operation(string/char), value1(number), value2(number).
	The function should return result of numbers after applying the chosen operation.
	
	Examples(Operator, value1, value2) --> output
 */

public class BasicMathematicalOperations {
	
	public static Integer basicMath(String op, int v1, int v2){
	    
		switch(op) {
		case "+": v1 += v2; break; 
		case "-": v1 -= v2; break;
		case "*": v1 *= v2; break;
		case "/": v1 /= v2; break;
		}
		return v1;
		
	}	
	
	// this method uses multiple 
	public static Integer basicMath1(String op, int v1, int v2){
		
		return (op=="+") ? (v1+v2) : (op=="-") ? (v1-v2) : (op=="*") ? (v1*v2) : (v2==0) ? null : (v1/v2);
	}
	
	public static void main(String args[]) {
		
		
		
		
		System.out.println(basicMath("+", 4, 7));
		System.out.println(basicMath("-", 4, 7));
		System.out.println(basicMath("*", 4, 7));
		System.out.println(basicMath("/", 4, 7));
		
	}
	

}
