package practice6.practice6_1;

class Planet implements Nameable {
    private String name;
    private double radius;

    public Planet(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }
}
