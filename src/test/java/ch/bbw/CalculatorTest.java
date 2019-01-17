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
}
