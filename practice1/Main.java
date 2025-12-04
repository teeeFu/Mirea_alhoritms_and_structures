package practice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число элементов массива: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        int sum = 0;
        double sred = 0;
        int minim = 999999999;
        int maxim = 0;


        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
            if (numbers[i] < minim) {
                minim = numbers[i];
            }

            if (numbers[i] > maxim) {
                maxim = numbers[i];
            }


        }
        int sum2 = 0;
        int j = 0;
        while (j < n) {
            sum2 += numbers[j];
            j += 1;
        }


        sred = (double) sum2 / n;
        System.out.println(sum2);
        System.out.println(sred);

    }
}
        //System.out.print("Массив: ");
/*
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("Сумма массива: "  + sum);
        System.out.println("Среднее арифметическое "  + sred);
        System.out.println("Максимальный элемент "  + maxim);
        System.out.println("Минимальный элемент "  + minim);

    }
}

 */