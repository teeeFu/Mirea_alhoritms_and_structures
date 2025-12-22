package practice25;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ConsolePr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Введите строку для манипуляции (или 'exit' для выхода):");
            String string = scan.nextLine();

            if ("exit".equalsIgnoreCase(string)) {
                break;
            }

            System.out.println("Введите регулярное выражение для разделения:");
            String regex = scan.nextLine();

            try {
                Pattern pattern = Pattern.compile(regex);
                String[] result = pattern.split(string);
                System.out.println("Результат: " + Arrays.toString(result));
            } catch (PatternSyntaxException e) {
                System.out.println("Ошибка в регулярном выражении: " + e.getMessage());
            }

            System.out.println("\nПродолжить? (yes/no):");
            String response = scan.nextLine();

            if ("no".equalsIgnoreCase(response) || "n".equalsIgnoreCase(response)) {
                break;
            }
        }

        scan.close();
        System.out.println("Программа завершена.");
    }
}