package myHomeWork2;

import java.util.Scanner;

public class Task5 {
    /*
    Write a Java program to test if an array contains a specific value.

    Напишите Java-программу для проверки, содержит ли массив
    конкретное значение.
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your value: ");
        int val = in.nextInt();
        int value = 0;

        int[] array = {0, 12, 15, 44, 11, 1, 57, 7};

        for (int a = 0; a < array.length; a++) {

            if (val == array[a]) {
                value = val;
            }
        }
        if (value == val) {
            System.out.println("Value: " + val + " is in array");
        } else
            System.out.println("Value: " + val + " no in array");
    }
}
