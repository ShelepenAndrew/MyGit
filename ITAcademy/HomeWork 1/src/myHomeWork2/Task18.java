package myHomeWork2;

import java.util.Arrays;

public class Task18 {
    /*
    Write a Java program to find the second smallest element in an array.

    Напишите программу на Java, чтобы найти второй наименьший элемент в массиве.
    */
    public static void main(String[] args) {
        int[] array = {23, 4324, 543, 1, 43, 545, 654, 4, 234, 324};
        Arrays.sort(array);
        System.out.println(array[1]);
    }
}
