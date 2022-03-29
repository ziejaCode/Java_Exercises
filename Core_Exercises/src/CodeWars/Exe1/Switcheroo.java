package CodeWars.Exe1;

public class Switcheroo {

	public String switchChars(String string) {
		
		StringBuilder retString = new StringBuilder();
	    for(int i = 0; i < string.length(); i++){
	      char ch = string.charAt(i);
	      System.out.println(ch);
	      if(ch == 'b'){  
	    	  System.out.println("I was in 1");
	          retString.append('a');
	      }else if (ch == 'a'){
	    	  System.out.println("I was in 2");
	    	  retString.append('b');
	      }else{
	    	  System.out.println("I was in 3");
	    	  retString.append(ch);
	      }
	      System.out.println("I am out");
	    }
	    System.out.println(retString);
	    return retString.toString();
	}
	
	public String switchChars1(String string) {
		
//		StringBuilder retString = new StringBuilder();
//	    for(int i = 0; i < string.length(); i++){
//	    	char ch = string.charAt(i);
//	    	if ch == 'a'? retString.append('b'): retString.append(ch);
//	    }
		
		return null;
	}

}
