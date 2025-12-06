package practice11;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;

public class dateCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        dateFormat.setLenient(false);


        Date currentDate = new Date();
        System.out.println("Текущая системная дата и время: " + dateFormat.format(currentDate));

        try {
            System.out.print("Введите дату и время в формате dd.MM.yyyy HH:mm:ss: ");
            String userInput = scanner.nextLine();

            Date userDate = dateFormat.parse(userInput);

            System.out.println("\nРезультаты сравнения:");
            System.out.println("Введенная дата: " + dateFormat.format(userDate));
            System.out.println("Текущая дата: " + dateFormat.format(currentDate));

            int comparison = userDate.compareTo(currentDate);

            if (comparison < 0) {
                System.out.println("Введенная дата находится в ПРОШЛОМ");
            } else if (comparison > 0) {
                System.out.println("Введенная дата находится в БУДУЩЕМ");
            } else {
                System.out.println("Даты СОВПАДАЮТ");
            }

            long difference = userDate.getTime() - currentDate.getTime();
            long differenceInSeconds = Math.abs(difference) / 1000;
            long differenceInMinutes = differenceInSeconds / 60;
            long differenceInHours = differenceInMinutes / 60;
            long differenceInDays = differenceInHours / 24;

            System.out.println("\nРазница во времени:");
            System.out.println("В секундах: " + differenceInSeconds + " сек");
            System.out.println("В минутах: " + differenceInMinutes + " мин");
            System.out.println("В часах: " + differenceInHours + " час");
            System.out.println("В днях: " + differenceInDays + " дн");

        } catch (ParseException e) {
            System.out.println("Ошибка: Неверный формат даты! Используйте формат dd.MM.yyyy HH:mm:ss");
        } finally {
            scanner.close();
        }
    }
}