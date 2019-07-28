package myHomeWork2;

public class Task12 {
    /*
    Write a Java program to find the duplicate values
    of an array of integer values.

    Напишите программу на Java, чтобы найти повторяющиеся значения
    в массиве целочисленных значений.
    */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 4, 9, 66, 9};

        for (int a = 0; a < array.length - 1; a++) {
            for (int b = a + 1; b < array.length; b++) {
                if (array[a] == array[b]) {
                    System.out.println("duplicate values: " + array[b]);
                }
            }
        }
    }
}
