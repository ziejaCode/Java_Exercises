package CodeWars.Exe0;


/*
 * https://www.codewars.com/users/ziejaCode

	Login - ziejaCode
	Pass - Browar25101

 */

import java.lang.reflect.Array;

/**
 * 
 * @author czarny
 * 
 * 	Complete the square sum function so that it squares each number passed into 
 *  it and then sums the results together.
 *  
 *	For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
 *
 */

public class Kata1 {

	
	
	public static void main(String[] args) {
		
		int[]a = {1,2,2};
		
		System.out.println(squareSum(a));
	
	}
	
	public static int squareSum(int[] n){
		int sum = 0;
		for(int i = 0; i < n.length; i++) {
			try {
				//sum += Math.pow(n[i], 2);
				sum += n[i] * n[i];
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sum;
	}

}
