package CodeWars.Exe1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


public class SwitcherooTest {
	
	//testing class injected
	Switcheroo switcheroo = new Switcheroo();
	
	@Test
	public void basicTest() {
		System.out.println("basic test");
		assertEquals("abcbbaac", switcheroo.switchChars("bacaabbc"));
	}

}
