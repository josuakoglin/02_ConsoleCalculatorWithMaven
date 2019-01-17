package ch.bbw;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorTest {

  Calculator testee;

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

}
