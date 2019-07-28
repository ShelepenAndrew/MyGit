package myHomeWork2;

import java.util.ArrayList;

public class Task20 {
    /*
    Write a Java program to convert an array to ArrayList.

    Напишите Java-программу для преобразования массива в ArrayList.
    */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayList<Integer> someArray = new ArrayList<>(array.length);
        for (int a = 0; a < array.length; a++) {
            Integer temp = array[a];
            someArray.add(temp);
        }
        for (Integer x : someArray) {
            System.out.print(x + " ");
        }
    }
}
