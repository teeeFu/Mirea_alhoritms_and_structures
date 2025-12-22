package practice18.practice18_2;

import java.util.Scanner;

public class Exception2 {
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
    }

    public static void main(String[] args) {
        Exception2 obj = new Exception2();
        obj.exceptionDemo();
    }
}

//Qwerty - NumberFormatException
//0 - ArithmeticException
//1.2 - NumberFormatException
//1 - норм