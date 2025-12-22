package practice18.practice18_1;

public class Exception1 {
    public void exceptionDemo() {
        try {
            System.out.println( 2 / 0 );
        }
        catch (ArithmeticException e ) {
            System.out.println("Деление на ноль!");
        }

    }

    public static void main(String[] args) {
        Exception1 obj = new Exception1();
        obj.exceptionDemo();
    }

}

//Числа с плавающей запятой (double, float): Арифметика следует стандарту IEEE 754.
// Этот стандарт определяет специальные значения для представления "нечисловых" концепций,
// таких как бесконечность и "не число".

//Цель стандарта - обеспечить продолжение вычислений даже при возникновении исключительных ситуаций,
// вместо аварийного завершения программы.
// Это критически важно для научных и инженерных расчетов.