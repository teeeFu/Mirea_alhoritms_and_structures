package practice9.practice9_2;

import java.util.Comparator;

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGPA(), s1.getGPA());
    }

    public void quickSort(Student[] students, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(students, left, right);
            quickSort(students, left, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, right);
        }
    }

    private int partition(Student[] students, int left, int right) {
        Student pivot = students[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (compare(students[j], pivot) < 0) {
                i++;
                swap(students, i, j);
            }
        }
        swap(students, i + 1, right);
        return i + 1;
    }

    private void swap(Student[] students, int i, int j) {
        Student temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }
}