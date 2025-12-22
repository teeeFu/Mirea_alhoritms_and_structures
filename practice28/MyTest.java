package practice28;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

public class MyTest {
    public static void main(String[] args){
        /// Задание 1
        HashSet<String> set=new HashSet<>();
        set.add("Sasha");
        set.add("Otlichno");
        set.add("Sdal");
        TreeSet<String> tset=new TreeSet<>(set);
        System.out.println(" TreeSet автоматически сортирует элементы в алфавитном порядке\n" +
                "[Sasha, Sdal]" +
                " идет перед потому что 'a' (в Sasha) идет перед 'd' (в Sdal)");
        System.out.println(tset);
        /// Задание 2
        Map<String,String> map=new HashMap<>();
        map.put("df","sdf");
        map.put("Familia","Name");
        System.out.println();
        MyMap myMap=new MyMap();
        System.out.println(myMap.map);
        System.out.println(" Результат getSameFirstCount(): количество коллизий по значениям \n" +
                "Формула: всего элементов (11) - уникальных значений (10) = 1 дубликат");



        System.out.println(myMap.getSameFirstCount());
        System.out.println();
        /// Задание 3
        MyHashMap<String> myHashMap=new MyHashMap<>(1);
        myHashMap.put(12.3,"12.3");
        myHashMap.put(23.0,"Value 23.0");
        myHashMap.put(35.0,"12.rtht");
        System.out.println("Значение для ключа " + myHashMap.get(23.0));

    }
}