package practice11;

import java.text.SimpleDateFormat;
import java.util.*;

public class razrab {
    private static Scanner scanner = new Scanner(System.in);
    private static SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    public static void Vvod() {
        int x = scanner.nextInt();
        if (x == 1) {
            Date completed = new Date();
            System.out.println("Дата и время сдачи задания: " + df.format(completed));
        }
        else {
            System.out.println("Задача не сдана!");
        }
    }

    public static void main(String[] args){
        System.out.println("Фамилия разработчика: Солодовченко");

        Date received = new Date();
        System.out.println("Дата и время получения задания: " + df.format(received));

        System.out.println("Напишите 1 если задача была сдана: ");
        try {
            Vvod();
        }
        catch (InputMismatchException e) {
            System.out.println("Введите число!");
        }
        finally {
            scanner.close();
        };


    }
}