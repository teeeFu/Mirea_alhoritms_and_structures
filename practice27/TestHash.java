package practice27;

public class TestHash {
    public static void main(String[] args){
        Hashtab<Boolean>myhash=new Hashtab<>();
        myhash.hashtabInit(12);
        myhash.hashtabAdd("Alexandr",true);
        myhash.hashtabAdd("Artem",false);
        myhash.hashtabAdd("Nikita",false);
        myhash.hashtabAdd("Lev",true);
        myhash.hashtabAdd("Lev",false);

        myhash.hashtabAdd("Kirill",true);
        myhash.hashtabAdd("Masha",false);
        myhash.hashtabAdd("Leonid",true);
        myhash.hashtabAdd("Jora",false);
        myhash.hashtabAdd("Vlad",true);
        myhash.hashtabAdd("Kolya",true);
        System.out.println(myhash);
        System.out.println(" ВЫВОД 1: Содержимое хеш-таблицы после добавления 10 элементов\n" +
                " Порядок элементов зависит от хеш-функции и может быть разным при каждом запуске\n" +

                "  Попытка удаления несуществующего ключа \"Kolyan\"\n" +
                "   Метод проходит по цепочке, не находит ключ, возвращает null\n" +
                "   Таблица не изменяется\n");

        System.out.println("ВЫВОД 2: Таблица после попытки удаления (остается без изменений)\n" );
        myhash.hashtabDelete("Kolyan");
        System.out.println(myhash);

        System.out.println("ВЫВОД 3: Результат поиска ключа \"Jora\"");
        System.out.println(myhash.hashtabLookup("Jora"));
    }
}

//
// 1. Создается хеш-таблица и инициализируется размером 12
// 2. Добавляется 10 элементов (ключ-значение)
// 3. При добавлении 10-го элемента срабатывает условие рехеширования:
//    size >= nodes.length * 0.75  →  10 >= 12 * 0.75 = 9  →  TRUE
// 4. Происходит рехеширование с рекурсивными вызовами hashtabAdd()
//    Это может привести к StackOverflowError или некорректному копированию