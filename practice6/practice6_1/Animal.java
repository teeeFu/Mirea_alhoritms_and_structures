package practice6.practice6_1;

class Animal implements Nameable {
    private String name;
    private String species;
    private int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }
}