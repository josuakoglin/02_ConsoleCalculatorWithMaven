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
    assertTrue(testee.addition(10, 25) == 35);
  }

  @Test
  public void testSubtractionTwoPositiveIsOk() {
    assertTrue(testee.subtraction(25, 10) == 15);
  }

  @Test
  public void testDivisionTwoPositiveIsOk() throws ArithmeticException {
    assertTrue(testee.division(12, 6) == 2);
  }

  @Test(expected = ArithmeticException.class)
  public void testDivisionByZeroThrowsException() {
    testee.division(15, 0);
  }

  @Test
  public void testSquarerootIsOK() {
    assertTrue(testee.sqareroot(361) == 19);
  }

}
