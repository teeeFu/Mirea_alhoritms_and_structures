package practice1;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        System.out.print("Узнать факториал числа: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 1;

        for (int i = 1; i <= n; i ++) {
            ans = i * ans;

        }
        System.out.println("Факториал числа " + n + " = " + ans);

    }
}
