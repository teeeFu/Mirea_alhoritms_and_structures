package practice9.practice9_1;

public class TestClass {

    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student current = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getId() > current.getId()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = current;
        }
    }

    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }



    public static void main(String[] args) {
        Student[] students = {
                new Student(105, "Иван Петров"),
                new Student(102, "Мария Сидорова"),
                new Student(107, "Алексей Иванов"),
                new Student(101, "Елена Козлова"),
                new Student(103, "Дмитрий Смирнов")
        };

        System.out.println("Исходный массив студентов:");
        printStudents(students);

        insertionSort(students);

        System.out.println("\nОтсортированный массив по id:");
        printStudents(students);

        System.out.println("\n=== Дополнительный тест ===");

        Student[] students2 = {
                new Student(5, "Анна Волкова"),
                new Student(2, "Павел Орлов"),
                new Student(8, "Ольга Новикова"),
                new Student(1, "Сергей Кузнецов"),
                new Student(6, "Татьяна Морозова")
        };

        System.out.println("Исходный массив студентов 2:");
        printStudents(students2);

        insertionSort(students2);

        System.out.println("\nОтсортированный массив студентов 2 по id:");
        printStudents(students2);
    }
}