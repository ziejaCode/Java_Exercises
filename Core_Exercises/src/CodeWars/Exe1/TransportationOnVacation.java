package CodeWars.Exe1;

public class TransportationOnVacation {

	public static void main(String[] args) {
		System.out.println(rentalCarCost1(2));
		System.out.println(rentalCarCost1(5));
		System.out.println(rentalCarCost1(8));
	}
	
	public static int rentalCarCost(int days) {
		int fee;
		if(days >= 7) {
			fee = 40 * days - 50;
		}else if(days >= 3) {
			fee = 40 * days - 20;
		}else {
			fee = 40 * days;
		}
		return fee;	    
	  }
	
	public static int rentalCarCost1(int d) {
	    return d < 7 ? d < 3 ? 40 * d : 40 * d - 20 : 40 * d - 50;
	  }

	public static int rentalCarCost2(int d) {
	    return d < 7 ? 40 * d : 40 * d - 50;
	  }
}
