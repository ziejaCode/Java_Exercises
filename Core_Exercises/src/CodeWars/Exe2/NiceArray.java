package CodeWars.Exe2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * A Nice array is defined to be an array where for every value n in the array, 
 * there is also an element n - 1 or n + 1 in the array.
 * 
 * Example:
 * 
 * 		[2, 10, 9, 3] is a nice array because

		 2 =  3 - 1
		10 =  9 + 1
		 3 =  2 + 1
		 9 = 10 - 1
 * 
 */

public class NiceArray {
	

	
public boolean checkArray1(Integer[]arr) {
		
		boolean res = false;
		while(arr.length == 0) {
			break;
		}
		Upper:for(int i = 0; i < arr.length; i++) {
			Lower:for(int j = 0; j < arr.length; j++) {						
					if (i == j) {
						continue;
					}
					if ((arr[i] == arr[j] - 1) || (arr[i] == arr[j] + 1)) {
						res = true;
						break Lower;
					}else {
						res = false;
					}
			}
			if(res == false){
				break Upper;
			}
		}
		return res;

	}


	public boolean checkArray2(Integer[]arr) {
		return Arrays.
                stream(arr).
                filter(i->(Arrays.asList(arr).
                		contains(i+1) || Arrays.asList(arr).
                		contains(i-1))).
                count() == arr.length && arr.length > 1;
	}
	
	public boolean checkArray3(Integer[]arr) {
		Set<Integer> s = new HashSet<>(Arrays.asList(arr));
        for(Integer i:s){
            if(!s.contains(i-1) && !s.contains(i+1))
                return false;
        }
        return !s.isEmpty();
	}


}
