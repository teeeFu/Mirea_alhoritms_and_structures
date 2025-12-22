package practice22;

public class RPNCalculator {
    private Stack stack;

    public RPNCalculator(int stackSize) {
        this.stack = new Stack(stackSize);
    }

    private boolean isNumber(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public int evaluate(String expression) {
        if (expression == null || expression.trim().isEmpty()) {
            throw new RuntimeException("Empty expression");
        }

        String[] tokens = expression.split("\\s+");

        for (String token : tokens) {
            if (isNumber(token)) {
                if (stack.isFull()) {
                    throw new RuntimeException("Stack overflow при попытке добавить число: " + token);
                }
                stack.push(Integer.parseInt(token));
            } else {
                if (stack.size() < 2) {
                    throw new RuntimeException("Недостаточно операндов для оператора: " + token);
                }
                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        if (b == 0) {
                            throw new RuntimeException("Деление на ноль");
                        }
                        stack.push(a / b);
                        break;
                    default:
                        throw new RuntimeException("Неизвестный оператор: " + token);
                }
            }
        }

        if (stack.size() != 1) {
            throw new RuntimeException("Слишком много операндов");
        }
        return stack.pop();
    }
}

