package ch.bbw;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

  private Calculator testee;

  @Before
  public void setUp() {
    testee = new Calculator();
  }

  @Test
  public void testSumTwoPositiveIsOk() {
    testee = new Calculator();
    assertTrue(testee.sum(10, 25) == 35);
  }

  @Test
  public void testSubtractionTwoPositiveIsOk() {
    testee = new Calculator();
    assertTrue(testee.subtraction(25, 10) == 15);
  }

  @Test
  public void testDivisionTwoPositiveIsOk() throws ArithmeticException {
    testee = new Calculator();
    assertTrue(testee.division(12, 6) == 2);
  }

  @Test(expected = ArithmeticException.class)
  public void testDivisionByZeroThrowsException() {
    testee = new Calculator();
    testee.division(15, 0);
  }

  @Test
  public void testSquarerootIsOK() {
    testee = new Calculator();
    assertTrue(testee.sqareroot(361) == 19);
  }

}
