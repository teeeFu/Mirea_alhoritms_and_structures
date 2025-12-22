package practice21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution<T, K, V> {
    private T fieldT;
    private K fieldK;
    private V fieldV;

    public Solution(T t, K k, V v) {
        this.fieldT = t;
        this.fieldK = k;
        this.fieldV = v;
    }

    public static <T> List<T> newArrayList(T... elements) {
        List<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }

    public static <T> Set<T> newHashSet(T... elements) {
        Set<T> set = new HashSet<>();
        for (T element : elements) {
            set.add(element);
        }
        return set;
    }

    public static <K, V> Map<K, V> newHashMap(K[] keys, V[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Количество ключей и значений не совпадает");
        }
        Map<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }
        return map;
    }

    public static void main(String[] args) {
        List<String> list = newArrayList("A", "B", "C");
        System.out.println("ArrayList: " + list);

        Set<Integer> set = newHashSet(1, 2, 3);
        System.out.println("HashSet: " + set);

        String[] keys = {"key1", "key2"};
        Integer[] values = {100, 200};
        Map<String, Integer> map = newHashMap(keys, values);
        System.out.println("HashMap " + map);
    }
}

