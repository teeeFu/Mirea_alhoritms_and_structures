package practice2;

public class CircleTest {
    public static void main(String[] args) {
        int x = 2;
        Circle circle1 = new Circle(2.5, 5, 10);
        Circle circle2 = new Circle(8, 0, -7);
        System.out.println("Площадь 1 окружности: " + circle1.getArea());
        System.out.println("Площадь 2 окружности: " + circle2.getArea());
        System.out.println("Длина 1 окружности: " + circle1.getLength());
        System.out.println("Длина 2 окружности: " + circle2.getLength());
        System.out.println("Диаметр 1 окружности: " + circle1.getDiameter());
        System.out.println("Диаметр 2 окружности: " + circle2.getDiameter());
        String result = Circle.CompareTwoCircles(circle1, circle2);
        System.out.println(result);
        //System.out.println("exp of a is: " +Math.exp(x));
        //System.out.println("expm1 of a is: " +Math.expm1(x));







    }
}
