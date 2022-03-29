package CodeWars.Exe1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class YouonlyneedoneTest {
	
	static Youonlyneedone you = new Youonlyneedone();
	
	@Test
	public void basicTest() {
		System.out.println("basic test");
		assertEquals(you.check(new Object[]{23, 66}, 66), true);
	}

}
