package myHomeWork2;

public class Task19 {
    /*
    Write a Java program to add two matrices of the same size.

    Напишите Java-программу для добавления двух матриц одинакового размера.
    */
    public static void main(String[] args) {

        int[] arrayOne = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayTwo = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arrayThree = new int[10];

        for (int i = 0; i < arrayThree.length; i++) {
            arrayThree[i] = arrayOne[i] + arrayTwo[i];
        }
        System.out.print("Array three: ");
        for (int a = 0; a < arrayThree.length; a++) {
            System.out.print(arrayThree[a] + " ");
        }
    }
}
