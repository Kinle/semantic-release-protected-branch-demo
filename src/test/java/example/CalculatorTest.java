package example;

import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

  @Test
  void shouldAddNumbers() {
    Calculator calculator = new Calculator();
    int result = calculator.add(4, 5);
    assertEquals(9, result);
  }
}
