package practice21;

import java.util.Arrays;
import java.util.List;

public class ArrayConverter {
    public static <T> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }

    public static void main(String[] args) {
        String[] stringArray = {"two", "one", "three", "four"};
        List<String> stringList = convertArrayToList(stringArray);
        System.out.println("Список строк: " + stringList);

        Integer[] intArray = {3, 2, 1, 4, 5};
        List<Integer> intList = convertArrayToList(intArray);
        System.out.println("Список чисел: " + intList);
    }
}
