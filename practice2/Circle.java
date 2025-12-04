package practice2;

public class Circle {
    private double radius;
    private double x;
    private double y;


    public Circle( double radius, double x,double  y ){
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }
    public double getDiameter() {
        return 2 * radius;
    }

    public static String CompareTwoCircles(Circle circle1, Circle circle2) {
        if (circle1.radius > circle2.radius)
            return "Первая окружность больше второй";
         else if (circle1.radius < circle2.radius)
            return "Первая окружность меньше второй";
        else
            return "Окружности равны";

    }


}



