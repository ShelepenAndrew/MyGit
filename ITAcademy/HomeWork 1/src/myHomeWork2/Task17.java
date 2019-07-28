package myHomeWork2;

import java.util.Arrays;

public class Task17 {
    /*
    Write a Java program to find the second largest element in an array.

    Написать программу на Java, чтобы найти второй по величине элемент в массиве.
    */
    public static void main(String[] args) {
        int[] array = {123, 4345, 534, 1, 43, 67, 3333, 2222};
        Arrays.sort(array);
        System.out.println(array[array.length - 2]);
    }
}
