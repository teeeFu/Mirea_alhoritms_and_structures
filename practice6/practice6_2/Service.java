package practice6.practice6_2;

class Service implements Priceable {
    private String name;
    private double price;

    public Service(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}