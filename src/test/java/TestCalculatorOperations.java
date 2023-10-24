import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestCalculatorOperations {
    CalculatorOperations calculatorOperations = new CalculatorOperations();

    @Test
    @DisplayName("Test Addition Operation")
    public void testAddition(){
        Assertions.assertEquals(5.0, calculatorOperations.addition(2,3));
    }
    @Test
    @DisplayName("Test Subtraction Operation")
    public void testSubtraction(){
        Assertions.assertEquals(-1.0, calculatorOperations.subtraction(2,3));
    }
    @Test
    @DisplayName("Test Multiplication Operation")
    public void testMultiplication(){
        Assertions.assertEquals(6.0, calculatorOperations.multiplication(2,3));
    }
    @Test
    @DisplayName("Test Division Operation")
    public void testDivision(){
        Assertions.assertEquals(1, calculatorOperations.division(3,3));
    }
}
