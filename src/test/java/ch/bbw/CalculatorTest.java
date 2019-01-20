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


  //Subtraction-method tests
  //====================================================================================================================
  @Test
  public void testSubtractionTwoPositiveIsOk() {
    assertEquals(15, testee.subtraction(25, 10));
  }

  @Test
  public void testSubtractionTwoNegativeIsOK() {
    assertEquals(-10, testee.subtraction(-30, -20));
  }

  @Test
  public void testSubtractionOneNegativeOnePositiveIsOK() {
    assertEquals(22, testee.subtraction(20, -2));
  }

  @Test
  public void testSubtractionNullandPositiveNumberIsOk() {
    assertEquals(30, testee.subtraction(30, 0));
  }

  @Test
  public void testSubtractionFromIntegerMinValueIsOk() {
    assertEquals(Integer.MIN_VALUE, testee.subtraction(Integer.MIN_VALUE + 10, 10));
  }

  @Test
  public void testSubtractionFirstNumberIsNullSecondNumberIsPositiveResultIsNegative() {
    assertEquals(-30, testee.subtraction(0, 30));
  }

  @Test(expected = ArithmeticException.class)
  public void testSubtractionOneNegativeOnePositiveOverflowHandlingThrowsException() {
    assertTrue(testee.subtraction(Integer.MIN_VALUE, 5) != 0);
  }

  @Test
  public void testSubtractionFirstNumberIsPositiveSecondNumberIsNullResultIsLikeFirstNumber() {
    assertEquals(25, testee.subtraction(25, 0));
  }
  //====================================================================================================================


  //Division-method tests
  //====================================================================================================================
  @Test(expected = ArithmeticException.class)
  public void testDivisionByZeroThrowsException() {
    assertTrue(testee.division(40, 0) != 0);
  }

  @Test
  public void testDivisionResultIsRounded() {
    assertTrue(testee.division(10, 4) == 2);
  }

  @Test
  public void testDivisionResultIsNullIsOk() {
    assertEquals(0, testee.division(0, 50));
  }

  @Test
  public void testDivisionOnePositiveOneNegativeIsOk() {
    assertEquals(-10, testee.division(30, -3));
  }

  @Test
  public void testDivisionTwoPositiveIsOk() {
    assertEquals(5, testee.division(20, 4));
  }

  @Test
  public void testDivisionNegativeResultIsRounded() {
    assertEquals(-20, testee.division(40, -2));
  }

  @Test
  public void testDivisionFirstNumberIsNegativeSecondNumberPositiveIsOk() {
    assertEquals(-4, testee.division(-12, 3));
  }

  @Test
  public void testDivisionTwoNegativeIsOk() {
    assertEquals(10, testee.division(-20, -2));
  }
  //====================================================================================================================

  @Test
  public void testSquarerootIsOK() {
    assertTrue(testee.sqareroot(361) == 19);
  }


  //ConvertNumberToBinary-method tests
  //====================================================================================================================
  @Test
  public void testBinaryWithPositiveNumberIsOK() {
    assertEquals("1111", testee.convertNumberToBinary(15));
  }

  @Test
  public void testBinaryWithIntegerMaxValueIsOk() {
    assertEquals(Integer.toBinaryString(Integer.MAX_VALUE), testee.convertNumberToBinary(Integer.MAX_VALUE));
  }

  @Test
  public void testBinaryWithZeroIsOk() {
    assertEquals("0", testee.convertNumberToBinary(0));
  }

  @Test(expected = ArithmeticException.class)
  public void testBinaryWithIntegerMinValueOverflowHandlingThrowsException() {
    assertEquals("0", testee.convertNumberToBinary(Integer.MIN_VALUE));
  }



  @Test(expected = ArithmeticException.class)
  public void testBinaryWithNegativeNumberOverflowHandlingThrowsException() {
    assertEquals("0", testee.convertNumberToBinary(-10));
  }
  //====================================================================================================================






}
