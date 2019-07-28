package myHomeWork2;

public class Task11 {
    /*
    Write a Java program to reverse an array of integer values.

    Напишите Java-программу для обращения к массиву
    целочисленных значений.
    */
    public static void main(String[] args) {
        int[] array = {23, 54, 1, 34, 6, 10};
        System.out.print("Array before: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int a = 0; a < array.length / 2; a++) {
            int arrayTemp = array[a];
            array[a] = array[array.length - a - 1];
            array[array.length - a - 1] = arrayTemp;
        }
        System.out.print("Array after: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
