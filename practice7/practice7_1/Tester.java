package practice7.practice7_1;

public class Tester {
    public static void main(String[] args) {
        // Создание точек с одинаковой скоростью
        MovablePoint point1 = new MovablePoint(0, 0, 2, 2);
        MovablePoint point2 = new MovablePoint(5, 5, 2, 2);

        // Создание прямоугольника
        MovableRectangle rectangle = new MovableRectangle(point1, point2);

        // Тестирование
        System.out.println("Прямоугольник: " + rectangle.toString());
        System.out.println("Скорости точек одинаковы: " + rectangle.SpeedTest());

        // Движение прямоугольника
        rectangle.moveRight();
        rectangle.moveDown();
        System.out.println("После движения: " + rectangle.toString());

        // Создание прямоугольника с разными скоростями точек
        MovablePoint point3 = new MovablePoint(0, 0, 2, 2);
        MovablePoint point4 = new MovablePoint(5, 5, 3, 3); // Разные скорости!
        MovableRectangle rectangle2 = new MovableRectangle(point3, point4);

        System.out.println("\nВторой прямоугольник: " + rectangle2.toString());
        System.out.println("Скорости точек одинаковы: " + rectangle2.SpeedTest());
    }
}