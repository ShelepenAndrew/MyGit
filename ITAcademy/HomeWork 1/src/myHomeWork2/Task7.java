package myHomeWork2;

public class Task7 {
    /*
    Write a Java program to remove a specific element from an array.

    Напишите Java-программу для удаления определенного элемента из массива.
    */
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Array 1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.print("Array 2: ");
        int[] array2 = new int[array1.length];
        int delElement = 5;

        for (int a = 0; a < array2.length; a++) {
            if (a != delElement) {
                array2[a] = array1[a];

                System.out.print(array2[a] + " ");
            }
        }
    }
}
