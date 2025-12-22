package practice20;

import java.io.Serializable;

public class Box<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T variable;
    private V value;
    private K key;

    public Box(T variable, V value, K key) {
        this.variable = variable;
        this.value = value;
        this.key = key;
    }

    public T getVariable() {return variable;}
    public V getValue() {return value;}
    public K getKey() {return key;}

    public void getTypes() {
        System.out.println("Тип T:" + variable.getClass().getSimpleName());
        System.out.println("Тип V:" + value.getClass().getSimpleName());
        System.out.println("Тип K:" + key.getClass().getSimpleName());
    }
}