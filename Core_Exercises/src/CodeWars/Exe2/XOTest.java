package CodeWars.Exe2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class XOTest {
	
	@Test
	public void testXO() {
		long start = System.nanoTime();
		System.out.println("basic test");
		assertEquals(true, new XO().getXO("ooxx"));
		assertEquals(true, new XO().getXO("xooxx"));
		assertEquals(true, new XO().getXO("ooxXm"));
		assertEquals(true, new XO().getXO("zpzpzpp"));
		assertEquals(true, new XO().getXO("zzoo"));
		assertEquals(true, new XO().getXO("zpzpXXozpp"));
	    long end = System.nanoTime();
	    long time = end - start;
	    System.out.println("time taken " + time);
	}

}
