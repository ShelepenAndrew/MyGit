package myHomeWork2;

public class Task10 {
    /*
    Write a Java program to find the maximum and minimum value of an array.

    Напишите программу на Java, чтобы найти максимальное и минимальное
    значение массива.
    */
    public static void main(String[] args) {

        int[] array = {1,56,33,87,999,1222};
        int max = array[0];
        int min = array[0];
        for (int a = 0; a < array.length; a++) {

            if (array[a] > max) {
                max = array[a];
            }

            if (array[a] < min) {
                min = array[a];
            }
        }
        System.out.println("max value: " + max);
        System.out.println("min value: " + min);
    }
}
