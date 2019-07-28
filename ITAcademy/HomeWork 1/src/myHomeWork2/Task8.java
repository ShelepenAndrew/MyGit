package myHomeWork2;

public class Task8 {
    /*
    Write a Java program to copy an array by iterating the array.

    Напишите Java-программу для копирования массива путем итерации массива.
    */
    public static void main(String[] args) {
        int[] arrayOne = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayTwo = new int[10];
        System.out.print("1st array: ");
        for (int a = 0; a < arrayOne.length; a++) {
            System.out.print(arrayOne[a] + " ");
        }
        System.out.println();

        System.out.print("2nd array: ");
        for (int i = 0; i < arrayOne.length; i++) {
            arrayTwo[i] = arrayOne[i];
        }
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print(arrayOne[i] + " ");
        }
    }
}
