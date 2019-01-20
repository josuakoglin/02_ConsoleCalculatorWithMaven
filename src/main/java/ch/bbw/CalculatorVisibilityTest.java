package ch.bbw;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalculatorVisibilityTest {
  private Calculator testee;

  @Before
  public void setUp() {
    testee = new Calculator();
  }

  //Multiplication-method tests
  //====================================================================================================================
  @Test
  public void testMultiplicationTwoPositiveIsOk() {
    assertEquals(10, testee.multiplication(2, 5));
  }

  @Test
  public void testMultiplicationTwoNegativeIsOk() {
    assertEquals(40, testee.multiplication(-20, -2));
  }

  @Test
  public void testMultiplicationFirstNumberIsPositiveSecondNumberIsNegativeIsOk() {
    assertEquals(-20, testee.multiplication(5, -4));
  }

  @Test
  public void testMultiplicationFirstNumberIsNegativeSecondNumberPositiveIsOk() {
    assertEquals(-36, testee.multiplication(-12, 3));
  }

  @Test
  public void testMultiplicationResultIsNullIsOk() {
    assertEquals(0, testee.multiplication(0, 50));
  }
  //====================================================================================================================
}
