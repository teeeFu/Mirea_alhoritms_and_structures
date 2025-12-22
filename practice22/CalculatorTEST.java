package practice22;

public class CalculatorTEST {
    public static void runTests() {
        System.out.println("Тестирование калькулятора\n");

        try {
            RPNCalculator calc1 = new RPNCalculator(10);
            int result1 = calc1.evaluate("2 3 +");
            System.out.println("Тест 1: 2 3 + = " + result1);
        } catch (Exception e) {
            System.out.println("Тест 1 failed: " + e.getMessage());
        }

        try {
            RPNCalculator calc2 = new RPNCalculator(10);
            int result2 = calc2.evaluate("2 3 * 4 5 * +");
            System.out.println("Тест 2: 2 3 * 4 5 * + = " + result2);
        } catch (Exception e) {
            System.out.println("Тест 2 failed: " + e.getMessage());
        }

        try {
            RPNCalculator calc3 = new RPNCalculator(10);
            int result3 = calc3.evaluate("10 2 /");
            System.out.println("Тест 3: 10 2 / = " + result3);
        } catch (Exception e) {
            System.out.println("Тест 3 failed: " + e.getMessage());
        }

        try {
            RPNCalculator calc4 = new RPNCalculator(10);
            int result4 = calc4.evaluate("10 3 -");
            System.out.println("Тест 4: 10 3 - = " + result4);
        } catch (Exception e) {
            System.out.println("Тест 4 failed: " + e.getMessage());
        }

        try {
            RPNCalculator calc5 = new RPNCalculator(2);
            calc5.evaluate("1 2 3 +");
            System.out.println("Тест 5: Stack overflow НЕ ВЫПОЛНЯЕТСЯ (должен быть exception)");
        } catch (Exception e) {
            System.out.println("Тест 5: " + e.getMessage());
        }

        try {
            RPNCalculator calc6 = new RPNCalculator(10);
            calc6.evaluate("1 +");
            System.out.println("Тест 6: Not enough operands НЕ ВЫПОЛНЯЕТСЯ (должен быть exception)");
        } catch (Exception e) {
            System.out.println("Тест 6: " + e.getMessage());
        }

        try {
            RPNCalculator calc7 = new RPNCalculator(10);
            calc7.evaluate("5 0 /");
            System.out.println("Тест 7: Division by zero НЕ ВЫПОЛНЯЕТСЯ (должен быть exception)");
        } catch (Exception e) {
            System.out.println("Тест 7: " + e.getMessage());
        }

        try {
            RPNCalculator calc8 = new RPNCalculator(10);
            calc8.evaluate("");
            System.out.println("Тест 8: Empty input НЕ ВЫПОЛНЯЕТСЯ (должен быть exception)");
        } catch (Exception e) {
            System.out.println("Тест 8: " + e.getMessage());
        }

        try {
            RPNCalculator calc9 = new RPNCalculator(10);
            calc9.evaluate("2 3 ^");
            System.out.println("Тест 9: Unknown operator НЕ ВЫПОЛНЯЕТСЯ (должен быть exception)");
        } catch (Exception e) {
            System.out.println("Тест 9: " + e.getMessage());
        }

        try {
            RPNCalculator calc10 = new RPNCalculator(10);
            calc10.evaluate("1 2 3");
            System.out.println("Тест 10: Too many operands НЕ ВЫПОЛНЯЕТСЯ (должен быть exception)");
        } catch (Exception e) {
            System.out.println("Тест 10: " + e.getMessage());
        }

        try {
            RPNCalculator calc11 = new RPNCalculator(10);
            int result11 = calc11.evaluate("10 5 4 3 2 * + - /");
            System.out.println("Тест 11: 10 5 4 3 2 * + - / = " + result11);
        } catch (Exception e) {
            System.out.println("Тест 11: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        runTests();
    }
}
