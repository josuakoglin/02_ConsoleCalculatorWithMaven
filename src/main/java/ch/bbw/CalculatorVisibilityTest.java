package ch.bbw;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CalculatorVisibilityTest {
  @Test
  public void testZweiPositiveMultiplikationIsOk() {
    Calculator calculator = new Calculator();
    assertTrue(calculator.multiplication(3, 4) == 12);
  }
}
