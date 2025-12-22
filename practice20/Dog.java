package practice20;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        super(name);
        this.breed = breed;
        this.age = age;
    }

    public String getBreed() {return breed;}
    public int getAge() {return age;}

    public void setBreed(String breed) {this.breed = breed;}
    public void setAge(int age) {this.age = age;}

    @Override
    public String toString() {
        return super.toString() +
                "Порода: " + breed + "\n" +
                "Возраст: " + age + " лет";
    }
}