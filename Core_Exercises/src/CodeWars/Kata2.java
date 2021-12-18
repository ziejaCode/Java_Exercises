package CodeWars;

public class Kata2 {

	public static void main(String[] args) {
		System.out.println(makeNegative1(7));
		System.out.println(makeNegative1(0));
		System.out.println(makeNegative1(-3));

	}
	
	public static int makeNegative(final int x) {
		if(x == 0) {
			return 0;
		}else if(x > 0) {
			int n = x;
			n *= -1;
			return n;
		}	    
	    return x; // Your code here.   
	  }
	
	// others solutions 
	public static int makeNegative1(final int x) {
	    return -Math.abs(x);
	}
	// best solution
	public static int makeNegative2(final int x) {
	      return (x < 0) ? x : -x; 
	}

}
