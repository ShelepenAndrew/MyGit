package myHomeWork1;

import java.util.Scanner;

public class Task10 {
    /*
    Напишите программу с тремя переменными целого типа, первым двум
    присвойте значения, а третьей переменной присвойте их сумму.
    Выведете значение третей переменной на экран.
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int number1 = in.nextInt();
        System.out.print("Enter the 2nd number: ");
        int number2 = in.nextInt();
        int sum = number1 + number2;
        System.out.print("Sum of two numbers: " + sum);

    }
}
