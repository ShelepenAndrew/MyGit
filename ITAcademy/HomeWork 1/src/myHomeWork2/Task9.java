package myHomeWork2;

public class Task9 {
    /*
    Write a Java program to insert an element (specific position) into
    an array.

    Напишите Java-программу для вставки элемента (определенной позиции)
    в массив.
    */
    public static void main(String[] args) {
        int[] arrayOne = {1, 2, 3, 4, 6, 7, 8, 9, 10};

        System.out.print("1st array: ");
        for (int a = 0; a < arrayOne.length; a++) {
            System.out.print(arrayOne[a] + " ");
        }
        System.out.println();

        int indPos = 4;
        int newValue = 5;

        for (int i = arrayOne.length - 1; i > indPos; i--) {
            arrayOne[i] = arrayOne[i - 1];
        }
        arrayOne[indPos] = newValue;

        System.out.print("1st array: ");
        for (int a = 0; a < arrayOne.length; a++) {
            System.out.print(arrayOne[a] + " ");
        }
    }
}
