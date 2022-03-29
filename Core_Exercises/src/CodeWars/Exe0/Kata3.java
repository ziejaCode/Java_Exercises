package CodeWars.Exe0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author czarny
 * 
 * The goal of this exercise is to convert a string to a new string where each
 *  character in the new string is "(" if that character appears only once in 
 *  the original string, or ")" if that character appears more than once in the 
 *  original string. Ignore capitalization when determining if a character is a 
 *  duplicate.
 */

public class Kata3 {

	public Kata3() {}

	public static void main(String[] args) {
		
		
		System.out.println(convertString("(( @"));
	}
	
	public static String convertString(String word) {
	
		String newString = "";
		
        List<Character> chars = new ArrayList<>();
        Set<Character> duplicates = new HashSet<Character>();
        
        for (char ch : word.toCharArray()) {
        	ch = Character.toLowerCase(ch);
        	if(!chars.contains(ch)) {
        		chars.add(ch);
        	}else {
        		duplicates.add(ch);
        	}            
        }	
		for(int y = 0; y < word.length(); y++ ) {
			char m = word.charAt(y);
			m = Character.toLowerCase(m);
			
			if(!duplicates.contains(m)) {
				newString += '(';
			}else {
				chars.add(m);
				newString += ')';
			}			
		}
		word = newString;
		return word;
		
	}

}
