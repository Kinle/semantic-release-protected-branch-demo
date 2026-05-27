package example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Calculator;
import org.junit.jupiter.api.Test;

class CalculatorTest {

  @Test
  void shouldAddNumbers() {
    Calculator calculator = new Calculator();
    int result = calculator.add(4, 5);
    assertEquals(9, result);
  }

  @Test
  void shouldSubtractNumbers() {
    Calculator calculator = new Calculator();
    int result = calculator.sub(4, 5);
    assertEquals(-1, result);
  }
}

