package myHomeWork2;

public class Task2 {
    /*
    Write a Java program to sum values of an array.

    Напишите Java-программу для суммирования значений массива.
    */
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 9, 15, 11, 111};
        int sum = 0;
        for (int a = 0; a < array.length; a++) {
            sum = sum + array[a];
        }
        System.out.println("Array sum: " + sum);
    }
}
