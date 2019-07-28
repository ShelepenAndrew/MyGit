package myHomeWork2;

public class Task15 {
    /*
    Write a Java program to find the common elements between two arrays
    of integers.

    Напишите программу на Java, чтобы найти общие элементы между двумя
    массивами целых чисел.
    */
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 77, 7, 4, 9, 66, 9};
        int[] array2 = {3, 12, 4, 1, 99, 2, 77, 111, 500};

        for (int a = 0; a < array1.length - 1; a++) {
            for (int b = 0; b < array2.length - 1; b++) {
                if (array1[a] == array2[b]) {
                    System.out.println("duplicate values: " + array2[b]);
                }
            }
        }
    }
}
