package myHomeWork2;

import java.util.Arrays;

public class Task1 {
    /*
    Write a Java program to sort a numeric array and a string array.

    Напишите Java-программу для сортировки числового массива и строкового
    массива.
    */
    public static void main(String[] args) {

        int[] numbers = {1, 23, 11, 444, 765, 1, 9};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        String[] letters = {"a", "z", "r", "o", "p"};
        Arrays.sort(letters);
        for (int q = 0; q < letters.length; q++) {
            System.out.print(letters[q] + " ");
        }
    }
}
