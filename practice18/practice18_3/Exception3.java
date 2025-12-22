package practice18.practice18_3;

import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("ERROR!");
        }
        finally {
            exceptionDemo();
        }
    }

    public static void main(String[] args) {
        Exception3 obj = new Exception3();
        obj.exceptionDemo();
    }
}

//Qwerty - NumberFormatException
//0 - ArithmeticException
//1.2 - NumberFormatException
//1 - норм