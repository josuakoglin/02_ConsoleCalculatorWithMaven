package ch.bbw;

public class Calculator {

  public int addition(int summand1, int summand2) throws java.lang.ArithmeticException {
    long value = (long) summand1 + (long) summand2;
    if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
      throw new java.lang.ArithmeticException();
    }
    return summand1 + summand2;
  }

  public int subtraction(int value1, int value2) {
    long value = (long) value1 - (long) value2;
    if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
      throw new java.lang.ArithmeticException();
    }
    return value1 - value2;
  }

  public int division(int value1, int value2) {
    return value1 / value2;
  }

  // Um diese Methode zu teseten musste ich die Testklasse im selben package erstellen, da es sonst nicht funktioniert hätte.
  // Der Grund dafür ist das der Access Modifier protected ist.
  protected int multiplication(int value1, int value2) {
    return value1 * value2;
  }

  // Die Folgende Methode kann man normal testen, da kein Access Modifier in Java den einen ähnlichen Effekt wie Public hat.
  // Der Unterschied ist, dass Public zusätzlich noch für Subclasses in einem anderen Package sichtbar ist und no modifier nicht..
  double sqareroot(double value1) {
    return Math.sqrt(value1);
  }

  // Die untenstehende Methode kann man nur mit "Reflection" testen.
  // Der Grund dafür ist, dass die Methode private ist und man sie nur innerhalb der Class verwenden kann.
  // Somit ist es nicht möglich Unit-Tests für diese Methode zu schreiben, weil der Zugriff auf die Methode unmöglich ist.
  private int square(int value1) {
    return value1 * value1;
  }

}


