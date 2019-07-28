package myHomeWork2;

import java.util.Scanner;

public class Task6 {
    /*
    Write a Java program to find the index of an array element.

    Напишите программу на Java, чтобы найти индекс элемента массива.
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value: ");
        int value = in.nextInt();
        int index = -1;

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7};
        for (int a = 0; a < array.length; a++) {
            if (value == array[a]) {
                index = a;
            }
        }
        if (index >= 0) {
            System.out.println("index position: " + index);
        } else {
            System.out.println("no index position");
        }
    }
}
