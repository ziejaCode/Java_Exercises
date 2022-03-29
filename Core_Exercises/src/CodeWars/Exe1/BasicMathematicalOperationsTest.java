package CodeWars.Exe1;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class BasicMathematicalOperationsTest {

  BasicMathematicalOperations basicOps = new BasicMathematicalOperations();
  
  @Test
  public void testBasics()
  {
    System.out.println("Basic Tests");
    assertThat(basicOps.basicMath1("+", 4, 7), is(11));
    assertThat(basicOps.basicMath1("-", 15, 18), is(-3));
    assertThat(basicOps.basicMath1("*", 5, 5), is(25));
    assertThat(basicOps.basicMath1("/", 49, 7), is(7));
  }
}
