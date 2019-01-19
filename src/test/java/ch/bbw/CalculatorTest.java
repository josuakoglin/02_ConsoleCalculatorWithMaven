package ch.bbw;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

  private Calculator testee;

  @Before
  public void setUp() {
    testee = new Calculator();
  }


  //Addition-method tests
  //====================================================================================================================
  @Test
  public void testAdditionTwoPositiveIsOk() {
    assertEquals(35, testee.addition(10, 25));
  }

  @Test
  public void testAdditionTwoNegativeIsOK() {
    assertEquals(-20, testee.addition(-10, -10));
  }

  @Test
  public void testAdditionOneNegativeOnePositiveIsOk() {
    assertEquals(-4, testee.addition((-6), 2));
  }

  @Test(expected = java.lang.ArithmeticException.class)
  public void testAdditionTwoPositiveWithOverflowThrowsException() {
    assertTrue(testee.addition(Integer.MAX_VALUE, 15) != 0);
  }

  @Test(expected = java.lang.ArithmeticException.class)
  public void testAdditionTwoNegativeWithOverflowThrowsException() {
    assertTrue(testee.addition(Integer.MIN_VALUE, -60) != 0);
  }

  @Test
  public void testAdditionResultIsNullOk() {
    assertEquals(0, testee.addition(-45, 45));
  }

  @Test
  public void testAdditionAddNullWithNumberIsOk() {
    assertEquals(30, testee.addition(0, 30));
  }

  @Test
  public void testAdditionLimitFromMaxIntegerIsOk() {
    assertEquals(Integer.MAX_VALUE, testee.addition(Integer.MAX_VALUE - 10, 10));
  }
  //====================================================================================================================





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
