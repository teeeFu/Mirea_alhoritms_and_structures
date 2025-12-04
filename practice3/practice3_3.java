package practice3;

import java.util.Random;
public class practice3_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[4];


        for (int i = 0; i < 4; i ++) {
                a[i] = rand.nextInt(10, 100);
        }
        for (int i = 0; i < 4; i ++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 1; i ++) {
            if ((a[i] < a[i + 1]) && (a[i + 2] < a[i + 3]) && (a[i + 1] < a[i + 2]))
                System.out.println("Последовательность строго возрастающая");

            else
                System.out.println("Последовательность не является строго возрастающей");


        }
    }
}
