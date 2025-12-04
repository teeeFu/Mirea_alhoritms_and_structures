package practice1;

public class harmonic {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i ++)  {
            System.out.printf("Член %d гармонического ряда = 1/%d  = %f %n" ,i, i, (1.0 / i));
        }
        for (int j = 0; j < args.length; j ++) {
            System.out.println("Аргумент " + (j + 1) + " = " + args[j]);
        }
    }
}
