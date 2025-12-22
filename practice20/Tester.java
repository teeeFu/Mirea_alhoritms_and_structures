package practice20;

public class Tester {
    public static void main(String[] args) {
        Box<String, Dog, Integer> box = new Box<>("Информация", new Dog("Бобик", "Дворняга", 4), 1);
        System.out.println(box.getVariable());
        System.out.println(box.getValue());
        System.out.println(box.getKey());
        box.getTypes();
    }
}