package practice3;

import java.util.Scanner;
import java.util.Random;
public class practice3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int n;
        while(true) {
            System.out.print("Введите число n: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Введите положительное число! ");
                }
            } else {
                System.out.println("Введите число!");
                scanner.next();
            }
        }


        int[] a = new int[n];

        for (int i = 0; i < n; i ++) {
            a[i] = rand.nextInt(0, n + 1);
        }
        System.out.print("Массив из случайных чисел: ");
        for (int i = 0; i < n; i ++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("Массив из четных элементов: ");

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }


    }
}