package practice6.practice6_2;

public class Tester {
    public static void main(String[] args) {
        Priceable phone = new Product("Телефон", 15000);
        Priceable laptop = new Product("Ноутбук", 50000);
        Priceable repair = new Service("Ремонт", 3000);
        Priceable delivery = new Service("Доставка", 500);
        Priceable apples = new Food("Яблоки", 100, 2.5);
        Priceable bread = new Food("Хлеб", 80, 1.0);

        Priceable[] items = {phone, laptop, repair, delivery, apples, bread};


        System.out.println("Цены товаров и услуг:");
        System.out.println("---------------------");

        for (Priceable item : items) {
            System.out.printf("Цена: %.2f руб.", item.getPrice());

            if (item instanceof Product) {
                System.out.printf(" - Товар: %s%n", ((Product) item).getName());
            } else if (item instanceof Service) {
                System.out.printf(" - Услуга: %s%n", ((Service) item).getName());
            } else if (item instanceof Food) {
                System.out.printf(" - Еда: %s%n", ((Food) item).getName());
            } else {
                System.out.println();
            }
        }

        double total = 0;
        for (Priceable item : items) {
            total += item.getPrice();
        }

        System.out.println("---------------------");
        System.out.printf("Общая стоимость: %.2f руб.%n", total);
    }
}