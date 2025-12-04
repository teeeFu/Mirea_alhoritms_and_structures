package practice9.practice9_2;

public class tester {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Иван", 3.8),
                new Student("Мария", 4.5),
                new Student("Алексей", 3.2),
                new Student("Ольга", 4.9),
                new Student("Дмитрий", 4.1)
        };

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.length - 1);

        for (Student s : students) {
            System.out.println(s);
        }
    }
}