package practice21;

public class GenericArray<T> {
    private T[] array;

    public GenericArray(T[] array) {
        this.array = array;
    }

    public T getElement(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Индекс: +" + index + ", Размер: " + array.length);
        }
        return array[index];
    }

    public static void main(String[] args) {
        String[] strArray = {"Hello", "World"};
        GenericArray<String> strContainer = new GenericArray<>(strArray);
        System.out.println("Элемент с индексом 1: " + strContainer.getElement(1));

        Integer[] intArray = {10, 20, 30};
        GenericArray<Integer> intContainer = new GenericArray<>(intArray);
        System.out.println("Элемент с индексом 0: " + intContainer.getElement(0));
    }
}
