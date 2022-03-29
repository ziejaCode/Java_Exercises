package CodeWars.Exe2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


public class NiceArrayTest {	
	
	NiceArray niceArray = new NiceArray();
	
	@Test
	public void basicTest1() {
		long start = System.nanoTime();
		System.out.println("basic test");
		assertEquals(false, niceArray.checkArray1(new Integer[] {4, 2, 1}));
		assertEquals(true, niceArray.checkArray1(new Integer[]{1,2,3,4,5}));
	    assertEquals(true, niceArray.checkArray1(new Integer[]{5,4,3,2,1}));
	    assertEquals(false, niceArray.checkArray1(new Integer[]{1,3,5,2}));
	    assertEquals(false, niceArray.checkArray1(new Integer[]{10,10,2,2,3}));
	    assertEquals(false, niceArray.checkArray1(new Integer[]{}));
	    assertEquals(false, niceArray.checkArray1(new Integer[]{1}));
	    long end = System.nanoTime();
	    long time = end - start;
	    System.out.println("time taken " + time);
	}
	
	@Test
	public void basicTest2() {
		long start = System.nanoTime();
		System.out.println("basic test");
		assertEquals(false, niceArray.checkArray1(new Integer[] {4, 2, 1}));
		assertEquals(true, niceArray.checkArray1(new Integer[]{1,2,3,4,5}));
	    assertEquals(true, niceArray.checkArray1(new Integer[]{5,4,3,2,1}));
	    assertEquals(false, niceArray.checkArray1(new Integer[]{1,3,5,2}));
	    assertEquals(false, niceArray.checkArray1(new Integer[]{10,10,2,2,3}));
	    assertEquals(false, niceArray.checkArray1(new Integer[]{}));
	    assertEquals(false, niceArray.checkArray1(new Integer[]{1}));
	    long end = System.nanoTime();
	    long time = end - start;
	    System.out.println("time taken " + time);
	}
	
	@Test
	public void basicTest3() {
		long start = System.nanoTime();
		System.out.println("basic test");
		assertEquals(false, niceArray.checkArray1(new Integer[] {4, 2, 1}));
		assertEquals(true, niceArray.checkArray1(new Integer[]{1,2,3,4,5}));
	    assertEquals(true, niceArray.checkArray1(new Integer[]{5,4,3,2,1}));
	    assertEquals(false, niceArray.checkArray1(new Integer[]{1,3,5,2}));
	    assertEquals(false, niceArray.checkArray1(new Integer[]{10,10,2,2,3}));
	    assertEquals(false, niceArray.checkArray1(new Integer[]{}));
	    assertEquals(false, niceArray.checkArray1(new Integer[]{1}));
	    long end = System.nanoTime();
	    long time = end - start;
	    System.out.println("time taken " + time);
	}
}
